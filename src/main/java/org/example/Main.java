package org.example;

import java.util.Scanner;

public class Main {

    public static void comprobarContrasenya() {
        Integer fortaleza = 0;

        String pass = introduceContrasenya();

        fortaleza = calcularFortalezaLongitud(pass, fortaleza);

        fortaleza = calcularFortalezaCaracteres(pass, fortaleza);

        finProceso(fortaleza);

    }

    private static String introduceContrasenya() {
        Scanner scanner = new Scanner(System.in); // Crea un scanner
        System.out.print("Ingresa tu contraseña: ");
        String pass = scanner.nextLine(); // Captura el texto ingresado

        return pass;
    }

    private static Integer calcularFortalezaLongitud(String pass, Integer fortaleza) {
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

    private static Integer calcularFortalezaCaracteres(String pass, Integer fortaleza) {
        if (pass.matches(".*[a-z].*")) {
            fortaleza += 1;
        } else if (pass.matches(".*[a-zA-Z].*")) {
            fortaleza += 2;
        }

        if (pass.matches(".*\\d.*")) {
            fortaleza += 1;
        }

        if (pass.matches(".*[^a-zA-Z0-9].*")) {
            fortaleza += 2;
        }

        return fortaleza;
    }

    private static void finProceso(Integer fortaleza) {
        String respuesta = "";
        if (fortaleza < 8) {
            Scanner scanner = new Scanner(System.in); // Crea un scanner
            System.out.print("Su contraseña es debil, ¿desea continuar con esa contraseña? (y, yes) o (n, no): ");
            respuesta = scanner.nextLine(); // Captura el texto ingresado
            scanner.close(); // Cierra el scanner al finalizar
            contrasenyaDebil(respuesta);
        } else {
            System.out.print("Su contraseña ha sido aceptada");
        }
    }

    private static void contrasenyaDebil(String respuesta) {
        respuesta.toLowerCase();

        if (respuesta.equals("yes") || respuesta.equals("y")) {
            System.out.print("Su contraseña ha sido aceptada");
        } else if (respuesta.equals("no") || respuesta.equals("n")) {
            System.out.print("Reinicia el proceso de ingreso de contraseña");
        } else {
            System.out.print("Respuesta no válida. Reinicia el proceso de ingreso de contraseña");
        }
    }

    public static void main(String[] args) {
        comprobarContrasenya();
    }
}