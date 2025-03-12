package org.example.services.impl;

import org.example.services.FortalezaCaracteresEspecialService;

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
