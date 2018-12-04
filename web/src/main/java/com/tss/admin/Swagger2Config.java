package com.tss.admin;/**
 * @Author: zhoujie
 * @Date: Create in 2018/12/3 22:25
 * @Modified by:
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2Config
 *
 * @author zhoujie
 * @create 2018-12-03 22:25
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.tss.admin.web"))
				.paths(PathSelectors.any())
				.build();
	}

	/**
	 * @description 构建api文档的详细参数
	 * @return void
	 * @time: 22:27 2018/12/3
	 * @author zhoujie
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 页面标题
				.title("管理员接口文档")
				// 创建人
				.contact(new Contact("ZJ", "","mxw968@126.com"))
				// 版本号
				.version("1.0")
				// 描述
				.description("API 描述")
				.build();
	}
}
