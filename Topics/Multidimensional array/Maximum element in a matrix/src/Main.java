import java.util.Scanner;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        int indexOfI = 0;
        int indexOfJ = 0;
        int[][] twoDimArray = new int[n][m];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = sc.nextInt();
            }
        }
        max = twoDimArray[0][0];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (max < twoDimArray[i][j]) {
                    max = twoDimArray[i][j];
                    indexOfI = i;
                    indexOfJ = j;
                    }
                }
            }
        out.print(indexOfI + " " + indexOfJ);
    }
}