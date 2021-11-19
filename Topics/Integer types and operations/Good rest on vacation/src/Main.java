import java.util.Scanner;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int totalCostOfFood = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();
        out.println(duration * totalCostOfFood + oneWayFlight * 2 + costOfOneNight * (duration -1));
    }
}