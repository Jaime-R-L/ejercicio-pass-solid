package org.example.FortalezaCalculator.Impl;

import org.example.FortalezaCalculator.FortalezaCaracteresEspecialService;

public class FortalezaCaracteresEspecialServiceImpl implements FortalezaCaracteresEspecialService {
    @Override
    public Integer calcularFortalezaCaracteresEspecial(String pass) {
        int result = 0;
        if (pass.matches(".*[^a-zA-Z0-9].*")) {
            result += 2;
        }
        return result;
    }
}
