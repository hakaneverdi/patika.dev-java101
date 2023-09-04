package org.example;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int row, col, mineCount;
    private char[][] realBoard;
    private char[][] displayBoard;

    Scanner scanner = new Scanner(System.in);

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineCount = (row * col) / 4;
        this.realBoard = new char[row][col];
        this.displayBoard = new char[row][col];
        initBoards();
        placeMines();
    }

    public void initBoards() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                realBoard[i][j] = '-';
                displayBoard[i][j] = '-';
            }
        }
    }

    public void placeMines() {
        int minesPlaced = 0;
        Random random = new Random();
        while (minesPlaced < mineCount) {
            int x = random.nextInt(row);
            int y = random.nextInt(col);
            if (realBoard[x][y] != '*') {
                realBoard[x][y] = '*';
                minesPlaced++;
            }
        }
    }

    public boolean isValid(int x, int y) {
        return x >= 1 && x <= row && y >= 1 && y <= col;
    }

    public int countAdjacentMines(int x, int y) {
        int count = 0;
        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            if (newX >= 0 && newX < row && newY >= 0 && newY < col && realBoard[newX][newY] == '*') {
                count++;
            }
        }
        return count;
    }

    public boolean makeMove(int x, int y) {
        if (realBoard[x - 1][y - 1] == '*') {
            return false;
        }
        displayBoard[x - 1][y - 1] = Character.forDigit(countAdjacentMines(x - 1, y - 1), 10);
        return true;
    }

    public boolean hasWon() {
        int correctCells = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (displayBoard[i][j] != '-' || realBoard[i][j] == '*') {
                    correctCells++;
                }
            }
        }
        return correctCells == row * col;
    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {

        boolean gameOn = true;
        while (gameOn) {
            System.out.println("===========================");
            printBoard(displayBoard);
            System.out.print("Satır Giriniz (1-" + row + "): ");
            int x = scanner.nextInt();
            System.out.print("Sütun Giriniz (1-" + col + "): ");
            int y = scanner.nextInt();

            if (!isValid(x, y)) {
                System.out.println("Geçersiz koordinat! Tekrar deneyin.");
                continue;
            }

            if (makeMove(x, y)) {
                if (hasWon()) {
                    printBoard(displayBoard);
                    System.out.println("Oyunu Kazandınız !");
                    gameOn = false;
                }
            } else {
                printBoard(realBoard);
                System.out.println("Game Over!!");
                gameOn = false;
            }
        }
    }
}
