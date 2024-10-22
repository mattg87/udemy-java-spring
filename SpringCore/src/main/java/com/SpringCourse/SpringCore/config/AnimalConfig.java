package com.SpringCourse.SpringCore.config;

import com.SpringCourse.SpringCore.common.Animal;
import com.SpringCourse.SpringCore.common.RatUnconfiged;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig
{
    @Bean
    // Can give custom ID's with
    // @Bean("theid")
    public Animal ratUnconfiged() {
        return new RatUnconfiged();
    }
}
