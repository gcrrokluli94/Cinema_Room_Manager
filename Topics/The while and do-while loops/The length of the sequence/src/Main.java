import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        int counter = 0;
        while (data > 0) {
            data = in.nextInt();
            counter++;
        }
        System.out.println(counter);
    }
}