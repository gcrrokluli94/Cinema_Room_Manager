import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] yearlyIncome = new int[N];
        int[] percentIncomeTax = new int[N];
        double[] payedTax = new double[N];
        double max = 0.0;
        int numberOfCompany = 0;
        int data;
        for (int i = 0; i < N; i++) {
            yearlyIncome[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            do {
                data = input.nextInt();
                percentIncomeTax[i] = data;
                payedTax[i] += yearlyIncome[i] * (percentIncomeTax[i] / 100.0);
            } while (data < 0 || data > 100);
        }
        for (int i = 0; i < N; i++) {
            if (max < payedTax[i]) {
                max = payedTax[i];
                numberOfCompany = i;
            }
        }
        System.out.println(numberOfCompany + 1);
    }
}
