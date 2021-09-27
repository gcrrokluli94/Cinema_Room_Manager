import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    int size = input.nextInt();
	    int[] a = new int[size];
	    for (int i = 0; i < size; i++) {
	        a[i] = input.nextInt();
        }

        for (int i = 0; i < 1; i++) {
            int temp = a[size - 1];
            for (int j = size - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}
