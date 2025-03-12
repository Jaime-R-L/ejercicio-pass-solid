package org.example.FortalezaCalculator.Impl;

import org.example.FortalezaCalculator.FortalezaCaracteresMayusService;

public class FortalezaCaracteresMayusServiceImpl implements FortalezaCaracteresMayusService {

    @Override
    public Integer calcularFortalezaCaracteresMayus(String pass) {
        int result = 0;
        if (pass.matches(".*[a-z].*")) {
            result += 1;
        } else if (pass.matches(".*[a-zA-Z].*")) {
            result += 2;
        }
        return result;
    }
}
