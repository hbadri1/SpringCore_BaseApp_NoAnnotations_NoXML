package com.hissou.sports;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getTraining() {
		return "Play tennis!!!!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
