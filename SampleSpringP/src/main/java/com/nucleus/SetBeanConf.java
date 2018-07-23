package com.nucleus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SetBeanConf
{
@Bean(name="bean1")
public Sample bean1()
{
	return new Sample();
}
@Bean(name="bean2")
public Sample bean2()
{
	return new Sample();
}
}
