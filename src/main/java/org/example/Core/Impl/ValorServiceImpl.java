package org.example.Core.Impl;

import org.example.Core.ValorService;
import org.example.configuration.Configuration;

public class ValorServiceImpl implements ValorService {
    @Override
    public String calculaValorContrasenya(int fortaleza) {
        String result = "";
        switch (fortaleza) {
            case 1, 2:
                result = Configuration.VALOR_CONT_MUY_DEBIL;
                break;
            case 3, 4, 5:
                result = Configuration.VALOR_CONT_DEBIL;
                break;
            case 6, 7:
                result = Configuration.VALOR_CONT_MODERADA;
                break;
            case 8, 9:
                result = Configuration.VALOR_CONT_FUERTE;
                break;
            case 10:
                result = Configuration.VALOR_CONT_MUY_FUERTE;
                break;
        }
        return result;
    }
}
