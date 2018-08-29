package com.way.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
/**
 * #http请求地址和资源文件映射如下:
 * #/{application}/{profile}[/{label}]
 * #/{application}-{profile}.yml
 * #/{label}/{application}-{profile}.yml
 * #/{application}-{profile}.properties
 * #/{label}/{application}-{profile}.properties
 * 远程仓库https://github.com/forezp/SpringcloudConfig/ 中有个文件config-client-dev.properties文件中有一个属性：
 *
 * foo = foo version 3
 *
 * 启动程序：访问http://localhost:8888/foo/dev
 */
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
