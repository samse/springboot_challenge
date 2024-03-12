package com.example.web.base;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

public class BaseApplicationConfig {

	@Bean
	public LocalValidatorFactoryBean beanValidator(MessageSource messageSource) {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource);
		return bean;
	}
	
}
