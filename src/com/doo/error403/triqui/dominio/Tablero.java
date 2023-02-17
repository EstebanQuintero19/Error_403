package com.doo.error403.triqui.dominio;


import java.util.Scanner;

public class Tablero {
    public static void showBoard(String[] board) {
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }
    public static void playPlayer(String symbol, String[] board){
        Scanner reader = new Scanner(System.in);
        System.out.println("Posicion a colocar ficha" + symbol + "?");
        int position = reader.nextInt();

        board[position] = symbol;

    }
}
