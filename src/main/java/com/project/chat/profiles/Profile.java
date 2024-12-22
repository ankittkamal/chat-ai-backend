package com.project.chat.profiles;

public record Profile(
        String id,
        String firstName,
        String LastName,
        int age,
        String ethnicity,
        Gender gender,
        String bio,
        String imageUrl,
        String myersBriggsPersonalityType
) {
}
