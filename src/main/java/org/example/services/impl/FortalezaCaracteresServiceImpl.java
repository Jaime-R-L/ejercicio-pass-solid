package org.example.services.impl;

import org.example.services.FortalezaCaracteresEspecialService;
import org.example.services.FortalezaCaracteresMayusService;
import org.example.services.FortalezaCaracteresNumService;
import org.example.services.FortalezaCaracteresService;

public class FortalezaCaracteresServiceImpl implements FortalezaCaracteresService {

    FortalezaCaracteresEspecialService fortalezaCaracteresEspecialService = new FortalezaCaracteresEspecialServiceImpl();
    FortalezaCaracteresMayusService fortalezaCaracteresMayusService = new FortalezaCaracteresMayusServiceImpl();
    FortalezaCaracteresNumService fortalezaCaracteresNumService = new FortalezaCaracteresNumServiceImpl();

    @Override
    public Integer calcularFortalezaCaracteres(String pass) {
        int fortaleza = 0;

        fortaleza += fortalezaCaracteresEspecialService.calcularFortalezaCaracteresEspecial(pass);

        fortaleza += fortalezaCaracteresMayusService.calcularFortalezaCaracteresMayus(pass);

        fortaleza += fortalezaCaracteresNumService.calcularFortalezaCaracteresNum(pass);

        return fortaleza;
    }
}
