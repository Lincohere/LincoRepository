package com.neusoft.tijaincms.service.impl;

import com.neusoft.tijaincms.po.Doctor;
import com.neusoft.tijaincms.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neusoft.tijaincms.mapper.DoctorMapper;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public Doctor getDoctorByCodeByPass(Doctor doctor) {

        return doctorMapper.getDoctorByCodeByPass(doctor);
    }
}

