package com.geetha.springdemo;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
