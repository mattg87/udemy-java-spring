package com.SpringCourse.SpringCore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

    public Dog() {
        System.out.println("Initialized: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doStartup () {
        System.out.println("In Startup: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doCleanup() {
        System.out.println("In Shutdown: " + getClass().getSimpleName());
    }

    @Override
    public String makeNoise() {
        return "woof!!!";
    }
}