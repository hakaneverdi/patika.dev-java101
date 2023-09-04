package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.print("Satır sayısını giriniz: ");
        int row = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int col = scanner.nextInt();
        MineSweeper game = new MineSweeper(row, col);
        game.play();
    }
}
