package com.xxljob.job.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ** @Author： wy
 * ** @Email :
 * ** @Project_Name : demo
 * ** @Package_Name : com.xxljob.job.handler
 * ** @User : Administrator
 * ** @date : 2019/8/5 23:07
 * **
 **/
@JobHandler("myHandler")
@Service
public class MyHandler extends IJobHandler {
    @Value("${xxl.job.executor.port}")
    private String port;

    @Override
    public ReturnT<String> execute(String param) {
        XxlJobLogger.log("XXL-JOB, Hello World." + port);
        System.out.println("XXL-JOB, Hello World." + port);
       // for (int i = 0; i < 5; i++) {
          //  XxlJobLogger.log("beat at:" + i);
            // TimeUnit.SECONDS.sleep(2);
      //  }
        return ReturnT.SUCCESS;

    }
}
