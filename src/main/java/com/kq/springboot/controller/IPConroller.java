package com.kq.springboot.controller;

import com.kq.springboot.dto.DtoResult;
import com.kq.util.NetworkInterfaceUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * IPConroller
 * @author kq
 * @date 2019-09-04
 */

@RestController
@RequestMapping(value="/ip")
public class IPConroller {


    @RequestMapping(value="/r")
    public DtoResult register() {
        DtoResult result = new DtoResult();

        try{
            String localIp = NetworkInterfaceUtil.getLocalIp();
            result.setResult(localIp);
            result.setCode("18800000");
        }catch (Exception e) {
            result.setResult("获取IP失败!");
            result.setCode("16800001");
        }

        return result;
    }

}
