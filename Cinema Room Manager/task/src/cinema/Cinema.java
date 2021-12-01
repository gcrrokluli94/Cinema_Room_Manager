package cinema;

import java.util.Scanner;

import static java.lang.System.out;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter the number of rows:");

        int rows = sc.nextInt();
        out.println("Enter the number of seats in each row:");
        int seatsPerRow = sc.nextInt();

        int rowNum = 0, seatNum = 0;
        char[][] cinema = getArray(rows, seatsPerRow);
        Menu(cinema, rows, seatsPerRow, rowNum, seatNum);
    }
    public static void Calculate(int rows, int seatsPerRow, int rowNum){
        Scanner sc = new Scanner(System.in);

        int ticketPrice = 0;
        int totalIncome = 0;
        int frontHalf = 0;
        int backHalf = 0;

        if (rows % 2 != 0 && rows * seatsPerRow > 60) {
            frontHalf = rows / 2;
            backHalf = (rows % 2) + frontHalf;
            if (rowNum > frontHalf) {
                ticketPrice = 8;
                out.println("Ticket price: $" + ticketPrice);
            } else {
                ticketPrice = 10;
                out.println("Ticket price: $" + ticketPrice);
            }
            totalIncome = (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
        } else if (rows % 2 == 0 && rows * seatsPerRow > 60) {
            frontHalf = rows / 2;
            backHalf = frontHalf;
            if (rowNum > frontHalf) {
                ticketPrice = 8;
                out.println("Ticket price: $" + ticketPrice);
            } else {
                ticketPrice = 10;
                out.println("Ticket price: $" + ticketPrice);
            }
            totalIncome = (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
        } else if (rows * seatsPerRow <= 60) {
            ticketPrice = 10;
            totalIncome = (rows * seatsPerRow) * ticketPrice;
            out.println("Ticket price: $" + ticketPrice);
        }
    }
    public static void Menu(char[][] cinema,int rows, int seatsPerRow, int rowNum, int seatNum) {
        Scanner sc = new Scanner(System.in);
        do {
            out.println("1. Show the seats");
            out.println("2. Buy a ticket");
            out.println("0. Exit");
            switch (sc.nextInt()) {
                case 1: if (seatNum > 0 && rowNum > 0) {
                    display(cinema, rowNum, seatNum);
                } else {
                    display(cinema);
                }
                Menu(cinema, rows, seatsPerRow, rowNum, seatNum);
                    break;
                case 2: out.println("Enter a row number:");

                    rowNum = sc.nextInt();
                    out.println("Enter a seat number in that row:");

                    seatNum = sc.nextInt();
                    Calculate(rows, seatsPerRow, rowNum);
                    Menu(cinema, rows, seatsPerRow, rowNum ,seatNum);
                    break;
                case 0:
                    return;
            }
        } while (sc.nextInt() != 0);
    }
    public static char[][] getArray(int rows, int seatsPerRow) {
        int row, col;
        row = rows;
        col = seatsPerRow;
        row++;
        col++;
        char[][] cinema = new char[row][col];
        return cinema;
    }
    public static void display(char[][] cinema) {
        char numCharCol = 48;
        char numCharRow = 48;
        out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[0][0] = ' ';
                if (cinema[i][j] == cinema[0][j]) {
                    cinema[i][j] = numCharCol++;
                }
                if (cinema[i][j] == cinema[i][0]) {
                    cinema[i][j] = numCharRow++;
                } else if (cinema[i][j] != cinema[0][j] && cinema[i][j] != cinema[i][0]) {
                    cinema[i][j] = 'S';
                }
            }
        }
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                out.print(cinema[i][j] + " ");
            }
            out.println();
        }

    }
    public static void display(char[][] cinema, int rowNum, int seatNum) {
        char numCharI = 48;
        char numCharJ = 48;
        out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[0][0] = ' ';
                cinema[rowNum][seatNum] = 'B';
                if (cinema[i][j] == cinema[0][j]) {
                    cinema[i][j] = numCharI++;
                }
                if (cinema[i][j] == cinema[i][0]) {
                    cinema[i][j] = numCharJ++;
                } else if (cinema[i][j] != cinema[0][j] && cinema[i][j] != cinema[i][0]
                        && cinema[i][j] != cinema[rowNum][seatNum]) {
                    cinema[i][j] = 'S';
                }
            }
        }
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                out.print(cinema[i][j] + " ");
            }
            out.println();
        }
    }
}