package com.tss.admin;
/**
 * @Author: zhoujie
 * @Date: Create in 2018/12/3 22:10
 * @Modified by:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动类
 * @author zhoujie
 * @create 2018-12-03 22:10
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
