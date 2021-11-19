import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int dim = sc.nextInt();
        int[][] twoDimArray = new int[dim][dim];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = Math.abs(i - j);
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                out.print(twoDimArray[i][j] + " ");
            }
            out.println();
        }
    }
}