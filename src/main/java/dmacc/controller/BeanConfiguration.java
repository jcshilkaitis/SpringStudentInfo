package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.StudentInfo;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Oct 29, 2022
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public StudentInfo studentinfo() {
		StudentInfo bean = new StudentInfo();
		return bean;
	}
}
