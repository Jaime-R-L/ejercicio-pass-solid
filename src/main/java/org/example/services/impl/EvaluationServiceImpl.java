package org.example.services.impl;

import org.example.services.ConsoleInteractionService;
import org.example.services.EvaluationService;

public class EvaluationServiceImpl implements EvaluationService {

    ConsoleInteractionService consoleInteractionService = new ConsoleInteractionServiceImpl();

    @Override
    public void evaluarContrasenya(int fortaleza) {
        if (fortaleza < ConfigurationServiceImpl.LIMITE_VALIDEZ_CONTRASENYA) {
            String respuesta = consoleInteractionService.solicitarDato(ConfigurationServiceImpl.MSG_CONT_DEBIL);
            contrasenyaDebil(respuesta, fortaleza);
        } else {
            System.out.print(ConfigurationServiceImpl.MSG_CONT_ACEPTADA);
        }
    }

    private static void contrasenyaDebil(String respuesta, int fortaleza) {
        respuesta = respuesta.toLowerCase();

        if (respuesta.equals("yes") || respuesta.equals("y")) {
            System.out.print(ConfigurationServiceImpl.MSG_CONT_ACEPTADA);
            System.out.println(ConfigurationServiceImpl.MSG_FORT_CONT + fortaleza);
        } else if (respuesta.equals("no") || respuesta.equals("n")) {
            System.out.print(ConfigurationServiceImpl.MSG_CONT_NO_ACEPTADA);
        } else {
            System.out.print(ConfigurationServiceImpl.MSG_ERROR_RESP_NO_VALIDA);
        }
    }
}
