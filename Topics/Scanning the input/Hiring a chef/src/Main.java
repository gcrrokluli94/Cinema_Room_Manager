import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();

        int yearsOfExperience = input.nextInt();

        String cuisineDishes = input.next();

        System.out.println("The form for " + name +
                " is completed. We will contact you if we"
                + " need a chef who cooks " + cuisineDishes
                + " dishes and has " + yearsOfExperience + " years of experience.");
    }
}