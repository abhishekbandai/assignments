package com.aga.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@ComponentScan("com.aga.*")
@PropertySources({@PropertySource(value = "../../resources/properties/database.properties", ignoreResourceNotFound = true)})
public class AgaEcommerceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AgaEcommerceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
        return builder.sources(AgaEcommerceApplication.class);
//		return super.configure(builder);
    }
}
