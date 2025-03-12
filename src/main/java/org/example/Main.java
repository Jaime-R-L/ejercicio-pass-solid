package org.example;

import org.example.Core.ContrasenyaService;
import org.example.Core.Impl.ContrasenyaServiceImpl;

public class Main {

    public static void main(String[] args) {
        ContrasenyaService contrasenyaService = new ContrasenyaServiceImpl();

        contrasenyaService.comprobarContrasenya();
    }
}