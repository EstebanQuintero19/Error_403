package com.doo.error403.triqui.app;

import java.util.Scanner;

import static com.doo.error403.triqui.dominio.Jugador.playMulti;
import static com.doo.error403.triqui.dominio.Maquina.playSolo;


public class AppTriqui {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("BIENVENIDOS A TIC-TAC-TOE\nElige una opcion:\n1. Jugar\n2. Instrucciones");
            int optionMain = reader.nextInt();
            while (true) {
                if (optionMain == 1) {
                    System.out.println("Como desea jugar:\n1. Contra la máquina\n2. Contra otro jugador");
                    int optionPlay = reader.nextInt();
                    if (optionPlay == 1) {
                        playSolo();
                        System.out.println("Deseas continuar jugando?\n1. Si\n2. No");
                        int keep = reader.nextInt();
                        if (keep == 2) {
                            break;
                        }
                    } else if (optionPlay == 2) {
                        playMulti();
                        System.out.println("Deseas continuar jugando?\n1. Si\n2. No");
                        int keep = reader.nextInt();
                        if (keep == 2) {
                            break;
                        }
                    } else {
                        System.out.println("Opcion incorrecta, vuelve a elegir");
                    }
                } else if (optionMain == 2) {
                    String[] board = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

                    System.out.println("- Para jugar es necesario elegir un caracter con un solo elemento, es decir que su longitud sea uno (1), donde en cada turno\n" +
                            "   cada jugador tiene la posibilidad de poner en el tablero su ficha para asi lograr 3 en raya.\n" +
                            "- No se puede poner una ficha encima de otra, simpre buscando un espacio libre sino se pierde turno\n" +
                            "- No es posible elegir una casilla fuera del tablero\n" +
                            "- Se debe poner la ficha en una de las nueve posiciciones que hay dentro del tablero así:");
                    System.out.println(board[7] + "|" + board[8] + "|" + board[9]);
                    System.out.println(board[4] + "|" + board[5] + "|" + board[6]);
                    System.out.println(board[1] + "|" + board[2] + "|" + board[3]);
                    System.out.println("\nVolver al menu\n1. Si");
                    int salir = reader.nextInt();

                    if (salir == 1) {
                        break;
                    }
                }

            }


        }
    }
}
