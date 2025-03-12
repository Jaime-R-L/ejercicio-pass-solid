package org.example.Core.Impl;

import org.example.Core.ConsoleInteractionService;
import org.example.Core.EvaluationService;
import org.example.Core.ValorService;
import org.example.configuration.Configuration;

public class EvaluationServiceImpl implements EvaluationService {

    ConsoleInteractionService consoleInteractionService = new ConsoleInteractionServiceImpl();
    ValorService valorService = new ValorServiceImpl();

    @Override
    public void evaluarContrasenya(int fortaleza) {
        if (fortaleza < Configuration.LIMITE_VALIDEZ_CONTRASENYA) {
            String respuesta = consoleInteractionService.solicitarDato(Configuration.MSG_CONT_DEBIL);
            contrasenyaDebil(respuesta, fortaleza);
        } else {
            String valor = valorService.calculaValorContrasenya(fortaleza);
            System.out.println(Configuration.MSG_VALOR_CONT + valor);
            System.out.print(Configuration.MSG_CONT_ACEPTADA);
        }
    }

    private static void contrasenyaDebil(String respuesta, int fortaleza) {
        respuesta = respuesta.toLowerCase();

        if (respuesta.equals("yes") || respuesta.equals("y")) {
            System.out.print(Configuration.MSG_CONT_ACEPTADA);
            System.out.println(Configuration.MSG_FORT_CONT + fortaleza);
        } else if (respuesta.equals("no") || respuesta.equals("n")) {
            System.out.print(Configuration.MSG_CONT_NO_ACEPTADA);
        } else {
            System.out.print(Configuration.MSG_ERROR_RESP_NO_VALIDA);
        }
    }
}
