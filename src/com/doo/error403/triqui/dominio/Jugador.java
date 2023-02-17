package com.doo.error403.triqui.dominio;

import java.util.Scanner;

public class Jugador {
    public static void chooseChar(){
        System.out.println("Con que caracteres deseas jugar?\n1. Por defecto (X,O)\n2. Personalizada");
        Scanner reader = new Scanner(System.in);
        int selection = reader.nextInt();
        while (true){
        if (selection == 1) {
            String player1 = "X";
            String player2 = "O";
        }
        if (selection == 2){
            String caracter = reader.nextLine();
            System.out.println("Que caracter desea para el jugador 1?");
            String player1 = caracter;
            System.out.println("Que caracter desea para el jugador 2?");
            String player2 = caracter;
        }

        }

        }

    }

