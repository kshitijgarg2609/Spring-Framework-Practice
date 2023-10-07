package com.kgprojects.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.kgprojects.controller","com.kgprojects.dao","com.kgprojects.service"})
@ImportResource("classpath:config.xml")
public class JavaConfig
{
	
}
