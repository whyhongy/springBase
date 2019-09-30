package com.why.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Component
@FeignClient(name = "service")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String  demo(@RequestParam(value = "name")String name);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String  test(@RequestParam(value = "name")String name);
}

