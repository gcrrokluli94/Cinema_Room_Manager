import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isSuccessful = false;
        if (isWeekend == false) {
            if (numbersOfCups >= 10 && numbersOfCups <= 20) {
                isSuccessful = true;
                System.out.println(isSuccessful);
            } else
                System.out.println(isSuccessful);
        }
        else if (isWeekend == true) {
            if (numbersOfCups >= 15 && numbersOfCups <= 25) {
                isSuccessful = true;
                System.out.println(isSuccessful);
            } else
                System.out.println(isSuccessful);
        }
    }
}