package com.hissou.sports;

import org.springframework.beans.factory.annotation.Value;

import com.hissou.sports.service.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	public String getEmail() {
		return this.email;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getTraining() {
		return "Go swimming....";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.sayHello();
	}

}
