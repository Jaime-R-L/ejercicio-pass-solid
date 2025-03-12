package org.example.services.impl;

import org.example.services.FortalezaCaracteresService;
import org.example.services.FortalezaLongitudService;
import org.example.services.FortalezaService;

public class FortalezaServiceImpl implements FortalezaService {

    FortalezaCaracteresService fortalezaCaracteresService = new FortalezaCaracteresServiceImpl();

    FortalezaLongitudService fortalezaLongitudService = new FortalezaLongitudServiceImpl();

    @Override
    public Integer calcularFortaleza(String pass) {
        Integer fortaleza = 0;

        fortaleza += fortalezaLongitudService.calcularFortalezaLongitud(pass);

        fortaleza += fortalezaCaracteresService.calcularFortalezaCaracteres(pass);

        return fortaleza;
    }
}
