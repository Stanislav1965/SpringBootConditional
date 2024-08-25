package ru.netology.springbootconditional.service.impl;

import ru.netology.springbootconditional.service.SystemProfile;

public class DevProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
