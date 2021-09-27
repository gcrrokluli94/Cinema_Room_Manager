import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double M = input.nextDouble();
        double P = input.nextDouble();
        double K = input.nextDouble();
        int year = 0;
        do {
            if (M == K) {
                break;
            }
            M += M * (P / 100);
            ++year;
        } while(K > M);
        System.out.println(year);
    }
}