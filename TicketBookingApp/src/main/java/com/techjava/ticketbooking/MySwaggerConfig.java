package com.techjava.ticketbooking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//static import is used for the regex (..)method
@Configuration
//This annotation enables the Swagger support in the application
@EnableSwagger2
public class MySwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/booking.*")).build();
	}
	@SuppressWarnings("deprecation")
	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("TicketBooking App").description("API reference guide for developers").termsOfServiceUrl("https://www.abccg.com/").contact("Batra , Yatin").version("1.0").build();
	}
}
