package com.fixed.asset.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");

        registry.addViewController( "/" ).setViewName( "forward:/home" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        
        registry.addViewController( "" ).setViewName( "forward:/home" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        
        
    }
}
