package org.example.services.impl;

import org.example.configuration.Configuration;
import org.example.services.ConsoleInteractionService;
import org.example.services.ContrasenyaService;
import org.example.services.FortalezaService;

public class ContrasenyaServiceImpl implements ContrasenyaService {
    FortalezaService fortalezaService = new FortalezaServiceImpl();

    ConsoleInteractionService consoleInteractionService = new ConsoleInteractionServiceImpl();

    @Override
    public void comprobarContrasenya() {
        String pass = consoleInteractionService.solicitarDato(Configuration.MSG_SOLI_CONT);

        fortalezaService.calcularFortaleza(pass);

        consoleInteractionService.cierraConexion();
    }
}
