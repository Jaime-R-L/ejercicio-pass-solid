package org.example.services.impl;

import org.example.services.FortalezaCaracteresNumService;

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
