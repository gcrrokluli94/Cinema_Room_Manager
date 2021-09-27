import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        int max = 0;
        do {
            value = input.nextInt();

            if(max < value){
                max = value;
            }

        }while(value != 0 && input.hasNext());
        System.out.println(max);
    }
}