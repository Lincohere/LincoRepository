package com.neusoft.tijaincms.service.impl;

import com.neusoft.tijaincms.mapper.CiDetailedReportMapper;
import com.neusoft.tijaincms.mapper.CiReportMapper;
import com.neusoft.tijaincms.mapper.SetmealMapper;
import com.neusoft.tijaincms.po.*;
import com.neusoft.tijaincms.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiReportServiceImpl implements CiReportService {

    @Autowired
    private CiReportMapper ciReportMapper;
    @Autowired
    private SetmealMapper setmealMapper;
    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Transactional
    @Override
    public int createCiReportTemplate(Orders orders) {
        int count = ciReportMapper.getCiReportByOrderId(orders.getOrderId());
        if (count > 0) {
            return 1;
        }
        //System.out.println("检测是否拿到smid"+orders.getSmId());
        Setmeal setmeal = setmealMapper.getSetmealById(orders.getSmId());
//        System.out.println("检测传回的setmeal:"+setmeal.getSmId()+" "+setmeal.getName());
        List<CiReport> cirList = new ArrayList<>();

        List<SetmealDetailed> a=setmeal.getSdList();

//        System.out.println("测试输出cir");
        for(SetmealDetailed b : a){
            CiReport cir = new CiReport();
            cir.setCiId(b.getCheckItem().getCiId());
//            System.out.println("测试输出b.getCheckItem().getCiId() "+b.getCheckItem().getCiId());
//            System.out.println("测试输出cir.getCiId "+b.getCiId());
            cir.setCiName(b.getCheckItem().getCiName());
            cir.setOrderId(orders.getOrderId());
            System.out.println(cir.getCiName()+" "+cir.getCiId()+" "+cir.getOrderId());
            cirList.add(cir);
            //检测cirList是否add成功？？？？？
        }

        int result1 = ciReportMapper.saveCiReport(cirList);

        List<CiDetailedReport> cidrList = new ArrayList<>();
        for(SetmealDetailed sd : setmeal.getSdList()){
            for (CheckItemDetailed cid : sd.getCheckItem().getCdList()){
                CiDetailedReport cidr = new CiDetailedReport();
                cidr.setName(cid.getName());
                cidr.setUnit(cid.getUnit());
                cidr.setMinrange(cid.getMinrange());
                cidr.setMaxrange(cid.getMaxrange());
                cidr.setNormalValue(cid.getNormalValue());
                cidr.setNormalValueString(cid.getNormalValueString());
                cidr.setType(cid.getType());
                cidr.setValue("");
                cidr.setIsError(0);
                cidr.setCiId(sd.getCiId());
                cidr.setOrderId(orders.getOrderId());
                cidrList.add(cidr);
            }
        }
        int result2= ciDetailedReportMapper.saveCiDetailedReport(cidrList);
        return result1>0&&result2>0?1:0;
    }
    @Override
    public List<CiReport> listCiReport(Integer orderId){
        //先查询CiReport表，获取体检报告中的检查项
        List<CiReport> cirList = ciReportMapper.listCiReport(orderId);
        //根据上面查询获取的检查项，再查询检查项明细
        for(CiReport cir:cirList){
            CiDetailedReport param=new CiDetailedReport();
            param.setOrderId(orderId);
            param.setCiId(cir.getCiId());
            List<CiDetailedReport> list=ciDetailedReportMapper.listCiDetailedReportByOrderIdByCiId(param);
            cir.setCidrList(list);
        }
        return cirList;

    }
}
