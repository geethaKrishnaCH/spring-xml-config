package com.geetha.springdemo;

public class CricketCoach implements Coach {

    private String email;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach no-args constructor called.");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach setter method for fortuneService called.");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Face the left hand bowler for an hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
