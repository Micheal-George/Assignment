package com.masai.calculator;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("a1.properties")
@Configuration
@ComponentScan(basePackages = "com.masai.calculator")
public class configApp {

}
