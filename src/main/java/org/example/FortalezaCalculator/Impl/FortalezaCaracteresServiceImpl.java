package org.example.FortalezaCalculator.Impl;

import org.example.FortalezaCalculator.FortalezaCaracteresEspecialService;
import org.example.FortalezaCalculator.FortalezaCaracteresMayusService;
import org.example.FortalezaCalculator.FortalezaCaracteresNumService;
import org.example.FortalezaCalculator.FortalezaCaracteresService;

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
