package com.kq.springboot.controller;

import com.kq.springboot.dto.DtoResult;
import com.kq.util.NetworkInterfaceUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ZookeeperServerController
 *
 * @author kq
 * @date 2019-10-30
 */
@RestController
@RequestMapping(value="/zookeeper")
public class ZookeeperServerController {

    @Value("${my.zookeeper.server}")
    private String zookeeperServer;

    @RequestMapping(value="/server")
    public DtoResult getServer() {
        DtoResult result = new DtoResult();

        result.setResult(zookeeperServer);
        result.setCode("18800000");

        return result;
    }

}
