package com.nucleus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureBean 
{
@Bean(name="bean")
public Employee bean()
{
	return new Employee();
}
}
