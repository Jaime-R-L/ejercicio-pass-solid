package org.example;

import org.example.services.ContrasenyaService;
import org.example.services.impl.ContrasenyaServiceImpl;

public class Main {

    public static void main(String[] args) {
        ContrasenyaService contrasenyaService = new ContrasenyaServiceImpl();

        contrasenyaService.comprobarContrasenya();
    }
}