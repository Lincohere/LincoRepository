package com.neusoft.tijaincms.service.impl;

import com.neusoft.tijaincms.mapper.SetmealMapper;
import com.neusoft.tijaincms.po.Setmeal;
import com.neusoft.tijaincms.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  SetmealServiceImpl  implements SetmealService {
    @Autowired
    private SetmealMapper setmealMapper;

    @Override
    public List<Setmeal> listSetmeal() {
        return  setmealMapper.listSetmeal();
    }
}
