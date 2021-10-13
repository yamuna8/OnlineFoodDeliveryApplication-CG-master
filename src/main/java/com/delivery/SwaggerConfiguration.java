package com.delivery;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;



@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.delivery"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointInfo());

    }
    public ApiInfo apiEndPointInfo() {
        return new ApiInfoBuilder().title("Online Food Delivery Application")
                .description("Food Delivery")
//                .contact(new Contact("Project","https://project.com","vjvijay1999@gmail.com"))
                .licenseUrl("http://www.apache.org/licenses/LICENCE-2.0.html")
                .version("0.0.1-SNAPSHOT")
                .build();
    }
  }
