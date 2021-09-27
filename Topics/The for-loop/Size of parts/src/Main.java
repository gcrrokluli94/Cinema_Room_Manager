import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < numb; i++) {
            int next = in.nextInt();
            switch (next) {
                case 1: larger++;
                break;
                case 0: perfect++;
                break;
                case -1: smaller++;
                break;
            }
        }
        System.out.print(perfect + " " + larger + " " + smaller);
    }
}