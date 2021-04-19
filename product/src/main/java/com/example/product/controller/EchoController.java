package com.example.product.controller;

import com.example.product.entity.PersonEntity;
import com.example.product.feign.OrderFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Slf4j
@RequestMapping("/product")
public class EchoController {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/id")
    public String id(){

        return orderFeign.orderId();
    }


}
