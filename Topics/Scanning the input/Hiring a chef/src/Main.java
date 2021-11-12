import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();

        int age = input.nextInt();

        String stageOfEducation = input.next();

        int yearsOfExperience = input.nextInt();

        String cuisineDishes = input.next();

        System.out.println("The form for " + name +
                " is completed. We will contact you if we"
                + " need a chef that cooks " + cuisineDishes
                + " dishes.");
    }
}