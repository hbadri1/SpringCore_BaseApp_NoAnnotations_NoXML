package com.hissou;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.hissou.sports.Coach;
import com.hissou.sports.SwimCoach;
import com.hissou.sports.service.FortuneService;
import com.hissou.sports.service.HappyFortuneService;

@Configuration
// @ComponentScan("com.hissou")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//For Spring 4.2 and lower
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public FortuneService getFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(getFortuneService());
	}
}
