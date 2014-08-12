package com.edwin.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableWebMvc
@org.springframework.context.annotation.Configuration
@ComponentScan("com.edwin.web")
public class WebAppConfig extends WebMvcConfigurerAdapter {
    
}
