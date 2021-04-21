package com.example.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.common.utils.ResultObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentinel-demo")
public class EchoController {

    @GetMapping("/echo")
    @SentinelResource(value = "echo", blockHandler = "block", fallback = "error")
    public ResultObj<String> echo(){
        return ResultObj.success("echo");
    }

    public ResultObj<String> error(){
        return ResultObj.error("error");
    }

    public ResultObj<String> block(){
        return ResultObj.error("block");
    }
}
