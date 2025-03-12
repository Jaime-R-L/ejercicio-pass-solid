package org.example.services.impl;

import org.example.services.FortalezaCaracteresService;

public class FortalezaCaracteresServiceImpl implements FortalezaCaracteresService {
    @Override
    public Integer calcularFortalezaCaracteres(String pass) {
        int fortaleza = 0;
        
        if (pass.matches(".*[a-z].*")) {
            fortaleza += 1;
        } else if (pass.matches(".*[a-zA-Z].*")) {
            fortaleza += 2;
        }

        if (pass.matches(".*\\d.*")) {
            fortaleza += 1;
        }

        if (pass.matches(".*[^a-zA-Z0-9].*")) {
            fortaleza += 2;
        }

        return fortaleza;
    }
}
