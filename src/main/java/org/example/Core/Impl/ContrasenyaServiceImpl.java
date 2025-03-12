package org.example.Core.Impl;

import org.example.Core.ConsoleInteractionService;
import org.example.Core.ContrasenyaService;
import org.example.Core.EvaluationService;
import org.example.FortalezaCalculator.FortalezaService;
import org.example.FortalezaCalculator.Impl.FortalezaServiceImpl;
import org.example.configuration.Configuration;

public class ContrasenyaServiceImpl implements ContrasenyaService {
    FortalezaService fortalezaService = new FortalezaServiceImpl();

    ConsoleInteractionService consoleInteractionService = new ConsoleInteractionServiceImpl();

    EvaluationService evaluationService = new EvaluationServiceImpl();

    @Override
    public void comprobarContrasenya() {
        String pass = consoleInteractionService.solicitarDato(Configuration.MSG_SOLI_CONT);

        int fortaleza = fortalezaService.calcularFortaleza(pass);

        evaluationService.evaluarContrasenya(fortaleza);

        consoleInteractionService.cierraConexion();
    }
}
