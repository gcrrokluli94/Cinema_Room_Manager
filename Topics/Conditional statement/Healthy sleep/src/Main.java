import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int H = input.nextInt();
        if( H < A && A <= B) {
            System.out.println("Deficiency");
        } else if(H > A && A <= B && H > B) {
            System.out.println("Excess");
        } else if( H >= A && H <= B && A<=B) {
            System.out.println("Normal");
        }
    }
}