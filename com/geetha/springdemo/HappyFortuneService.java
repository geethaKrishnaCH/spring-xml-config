package com.geetha.springdemo;

public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
        System.out.println("HappyFortuneService constructor called");
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!!!";
    }
}
