import java.util.Scanner;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] star = new String[n][n];
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == j || i + j == n - 1 || j == n / 2 || i == n / 2) {
                    star[i][j] = "* ";
                } else {
                    star[i][j] = ". ";
                }

                out.print(star[i][j]);
            }
            out.println();
        }
    }
}