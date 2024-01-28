package com.java2e.martin.biz.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 狮少
 * @version 1.0
 * @date 2019/5/20
 * @describtion MartinBizSsoApplication
 * <p>
 * 在9402端口启动一个 sso，访问http://127.0.0.1:9402/client/test,授权登录获取到接口返回数据，这相当于一个 sso
 * 在9403端口启动一个 sso，访问http://127.0.0.1:9403/client/test,不用授权，可以直接访问，这相当于另一个 sso
 * @since 1.0
 */
@SpringBootApplication
public class MartinBizSsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MartinBizSsoApplication.class, args);
    }
}
