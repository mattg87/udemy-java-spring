package com.SpringCourse.SpringCore.rest;

import com.SpringCourse.SpringCore.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCourse.SpringCore.common.Dog;

@RestController
public class RController
{
    private Animal firstAnimal;
    private Animal secondAnimal;

    @Autowired
    public RController(@Qualifier("dog") Animal firstAnimal,
                       @Qualifier("ratUnconfiged") Animal secondAnimal) {
        this.firstAnimal = firstAnimal;
        this.secondAnimal = secondAnimal;
    }

    @GetMapping("/")
    public String homePage() {
        return "Home Page";
    }

    @GetMapping("dog")
    public String dogWoof() {
        return firstAnimal.makeNoise();
    }

    @GetMapping("rat")
    public String ratSqueeze() {
        return secondAnimal.makeNoise();
    }

    // Just to show whether beans are singletons or that they're different due to different DI
    @GetMapping("/check")
    public String checkBeans() {
        return "firstAnimal == secondAnimal: " + (firstAnimal == secondAnimal);
    }
}
