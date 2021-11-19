import java.util.Scanner;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        int last = digit % 10;
        int middle = (digit % 100) / 10;
        int first = digit / 100;
        int reversedDigit = last * 100 + middle * 10 + first;
        out.print(reversedDigit);
    }
}