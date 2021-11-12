package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        System.out.print("> ");
        int seatsPerRow = input.nextInt();
        System.out.println("Cinema:");
        char[][] cinema = { {' ', '1', '2', '3', '4', '5', '6', '7', '8'},
                            {'1', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'2', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'3', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'4', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'5', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'6', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'},
                            {'7', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S'}};
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
        int ticketPrice = 0;
        int totalIncome = 0;
        int frontHalf = 0;
        int backHalf = 0;

        if (rows % 2 != 0 && rows * seatsPerRow > 60) {
            frontHalf = rows / 2;
            backHalf = (rows % 2) + frontHalf;
            totalIncome = (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
            System.out.println("Total income:");
            System.out.println("$" + totalIncome);
        } else if (rows % 2 == 0 && rows * seatsPerRow > 60) {
            frontHalf = rows / 2;
            backHalf = frontHalf;
            totalIncome = (frontHalf * seatsPerRow * 10) + (backHalf * seatsPerRow * 8);
            System.out.println("Total income:");
            System.out.println("$" + totalIncome);
        } else if (rows * seatsPerRow <= 60) {
            ticketPrice = 10;
            totalIncome = (rows * seatsPerRow) * ticketPrice;
            System.out.println("Total income:");
            System.out.println("$" + totalIncome);
        }
    }
}