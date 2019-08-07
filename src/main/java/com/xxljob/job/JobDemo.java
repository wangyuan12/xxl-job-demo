package com.xxljob.job;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ** @Author： wy
 * ** @Email :
 * ** @Project_Name : demo
 * ** @Package_Name : com.xxljob.job
 * ** @User : Administrator
 * ** @date : 2019/8/5 19:32
 * **
 **/
@RestController
public class JobDemo {
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/{id}")
    public String getJob(@PathVariable String id){
        System.out.println("id=========="+id);
            return id;
    }
    @RequestMapping(value = "/")
    public String getJob2( ){
        System.out.println("id=========="+port);
        return port;
    }
}
