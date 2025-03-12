package org.example.FortalezaCalculator.Impl;

import org.example.FortalezaCalculator.FortalezaCaracteresNumService;

public class FortalezaCaracteresNumServiceImpl implements FortalezaCaracteresNumService {
    @Override
    public Integer calcularFortalezaCaracteresNum(String pass) {
        int result = 0;
        if (pass.matches(".*\\d.*")) {
            result += 1;
        }
        return result;
    }
}
