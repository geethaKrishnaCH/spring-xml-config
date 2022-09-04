package com.geetha.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
        System.out.println("TrackCoach default constructor called.");
    }

    public TrackCoach(FortuneService fortuneService) {
        System.out.println("TrackCoach arg-constructor called.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
