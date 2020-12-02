package com.fullspeed.address.controller;

import com.fullspeed.address.addressresolution.until.IpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class DomeController {

    @RequestMapping("/index")
    public String index(HttpServletRequest req) {
        try {
            String ip = IpUtil.getOuterNetIp(req);//获取外网ip
            System.out.println("ip : "+ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "home";
    }

}
