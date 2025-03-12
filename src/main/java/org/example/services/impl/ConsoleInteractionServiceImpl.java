package org.example.services.impl;

import org.example.services.ConsoleInteractionService;

import java.util.Scanner;

public class ConsoleInteractionServiceImpl implements ConsoleInteractionService {

    Scanner scanner = new Scanner(System.in); // Crea un scanner

    @Override
    public String solicitarDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine(); // Captura el texto ingresado
    }

    @Override
    public void cierraConexion() {
        scanner.close();
    }
}
