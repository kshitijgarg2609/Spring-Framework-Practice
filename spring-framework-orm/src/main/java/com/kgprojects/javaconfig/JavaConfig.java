package com.kgprojects.javaconfig;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.kgprojects.dao","com.kgprojects.console"})
@ImportResource(locations = "/config.xml")
public class JavaConfig
{
	@Bean
	public Scanner scanner()
	{
		return new Scanner(System.in);
	}
}
