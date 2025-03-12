package org.example.services.impl;

import org.example.services.FortalezaLongitudService;

public class FortalezaLongitudServiceImpl implements FortalezaLongitudService {
    @Override
    public Integer calcularFortalezaLongitud(String pass) {
        int fortaleza = 0;
        int longitud = pass.length();
        if (7 <= longitud && longitud <= 8) {
            fortaleza += 1;
        } else if (9 <= longitud && longitud <= 12) {
            fortaleza += 2;
        } else if (longitud > 12) {
            fortaleza += 3;
        }
        return fortaleza;
    }
}
