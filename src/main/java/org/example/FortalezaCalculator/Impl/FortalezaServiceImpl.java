package org.example.FortalezaCalculator.Impl;

import org.example.FortalezaCalculator.FortalezaCaracteresService;
import org.example.FortalezaCalculator.FortalezaLongitudService;
import org.example.FortalezaCalculator.FortalezaMaximaService;
import org.example.FortalezaCalculator.FortalezaService;

public class FortalezaServiceImpl implements FortalezaService {

    FortalezaCaracteresService fortalezaCaracteresService = new FortalezaCaracteresServiceImpl();

    FortalezaLongitudService fortalezaLongitudService = new FortalezaLongitudServiceImpl();

    FortalezaMaximaService fortalezaMaximaService = new FortalezaMaximaServiceImpl();

    @Override
    public int calcularFortaleza(String pass) {
        Integer fortaleza = 0;

        fortaleza += fortalezaLongitudService.calcularFortalezaLongitud(pass);

        fortaleza += fortalezaCaracteresService.calcularFortalezaCaracteres(pass);

        fortaleza += fortalezaMaximaService.calculaFortalezaMaxima(fortaleza);

        return fortaleza;
    }
}
