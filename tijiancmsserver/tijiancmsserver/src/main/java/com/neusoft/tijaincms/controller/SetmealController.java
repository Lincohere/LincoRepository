package com.neusoft.tijaincms.controller;

import com.neusoft.tijaincms.po.Setmeal;
import com.neusoft.tijaincms.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {
    @Autowired
    private SetmealService setmealService;
    @RequestMapping("/listSetmeal")
    public List<Setmeal> listSetmeal() {
        return setmealService.listSetmeal();
    }
}
