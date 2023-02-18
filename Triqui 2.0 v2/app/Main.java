package com.triqui.app;

import com.triqui.dominio.Tabla;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int canJugador;
        String jugador1, jugador2;
        boolean volverJugar = true;
        System.out.println("---|BIENVENIDOS A TRIQUI403|---");
        System.out.println("-------------------------------");
        while(volverJugar) {
            while (true) {
                System.out.print("Ingresa la cantidad de jugadores(1/2)->");
                canJugador = entrada.nextInt();
                if (canJugador > 2 || canJugador < 0) {
                    System.out.println("---------------ADVERTENCIA----------------");
                    System.out.println("Ingresa una cantidad de jugadores adecuada");
                    System.out.println("------------------------------------------");
                } else {
                    break;
                }
            }
            if (canJugador == 1) {
                while (true) {
                    System.out.print("Ingresa un caracter para el jugador 1 (X/O)->");
                    jugador1 = entrada.next();
                    jugador1 = jugador1.toUpperCase();
                    if (jugador1.length() >= 2) {
                        System.out.println("------ADVERTENCIA-------");
                        System.out.println("Ingresa solo un caracter");
                        System.out.println("------------------------");
                    } else {
                        break;
                    }
                }
                if (jugador1.equals("X")) {
                    jugador2 = "O";
                } else {
                    jugador2 = "X";
                }
                Juego juego = new Juego(jugador1, jugador2);
                juego.juegoIndividual();
                System.out.print("Deseas volver a jugar?(si/no)->");
                if(!Objects.equals(entrada.next().toUpperCase(), "SI")){
                    volverJugar = false;
                }

            } else {
                while (true) {
                    System.out.print("Ingresa un caracter para el jugador 1 (X/O)->");
                    jugador1 = entrada.next();
                    jugador1 = jugador1.toUpperCase();
                    System.out.print("Ingresa un caracter para el jugador 2 (X/O)->");
                    jugador2 = entrada.next();
                    jugador2 = jugador2.toUpperCase();
                    if (jugador2.length() >= 2 || jugador1.length() >= 2) {
                        System.out.println("------ADVERTENCIA-------");
                        System.out.println("Ingresa solo un caracter");
                        System.out.println("------------------------");
                    } else {
                        break;
                    }
                }
                Juego juego = new Juego(jugador1, jugador2);
                juego.juegoCooperativo();
                System.out.print("Deseas volver a jugar?(si/no)->");
                if(!Objects.equals(entrada.next().toUpperCase(), "SI")){
                    volverJugar = false;
                }
            }

        }




    }
}