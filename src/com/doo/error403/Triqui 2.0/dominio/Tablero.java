package com.doo.error403.triqui.dominio;


import java.util.Scanner;

public class Tablero {
    public static void showBoard(String[] board) {
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
    }
    public static void playPlayer(String symbol, String[] board){
        Scanner reader = new Scanner(System.in);
        System.out.println("Posicion a colocar ficha" + symbol + "?");
        int position = reader.nextInt();
        board[position] = symbol;

    }
}
