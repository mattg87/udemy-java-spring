package com.SpringCourse.SpringCore.common;

import org.springframework.context.annotation.Configuration;

public class RatUnconfiged implements Animal {

    public RatUnconfiged() {
        System.out.println("Initialized: " + getClass().getSimpleName());
    }

    @Override
    public String makeNoise() {
        return "Unconfigured Sqeek!";
    }
}
