package com.example.demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket customDocket(){
        ApiInfo info =  new ApiInfoBuilder()
                .description("An API to manage service subscribers")
                .title("Subscriber API Documentation")
                .version("1.0.1")
                .license("MIT Free")
                .contact(new Contact("John Baker","https://johnbaker.api.io","johnbaker2241@yahoo.com"))
                .licenseUrl("http://johnbaker.subscriberapi.io")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.demo1"))
                .build()
                .apiInfo(info);

//        DocumentationContextBuilder builder = new DocumentationContextBuilder(DocumentationType.SWAGGER_2);
//        builder.apiInfo(info.build()).build();


    }
}
