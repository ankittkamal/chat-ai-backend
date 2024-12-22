package com.project.chat;

import com.project.chat.profiles.Gender;
import com.project.chat.profiles.Profile;
import com.project.chat.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AffinityBotApplication implements CommandLineRunner {

    @Autowired
    private ProfileRepository profileRepository;

    public static void main(String[] args) {
        SpringApplication.run(AffinityBotApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        Profile profile = new Profile(
                "1",
                "Issei",
                "Hyudo",
                21,
                "Japanese",
                Gender.MALE,
                "Engineer",
                "https://i.pinimg.com/736x/3b/da/cf/3bdacf98cfb75edcba07a76263e498e0.jpg",
                "INTP"
        );
        profileRepository.save(profile);
        profileRepository.findAll().forEach(System.out::println);
    }
}
