package com.geetha.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("BaseballCoach default constructor called.");
    }

    public BaseballCoach(FortuneService fortuneService) {
        System.out.println("BaseballCoach arg constructor called.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
