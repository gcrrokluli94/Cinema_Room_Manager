import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fourDigitNumber = input.nextInt();
        int lastDigit = fourDigitNumber % 10;
        int thirdDigit = (fourDigitNumber / 10 ) % 10;
        int secondDigit = (fourDigitNumber / 100) % 10;
        int firstDigit = (fourDigitNumber / 1000) % 10;

        if( firstDigit == lastDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}