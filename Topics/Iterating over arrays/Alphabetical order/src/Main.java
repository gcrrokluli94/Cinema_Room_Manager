import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] a = input.nextLine().split("\\s+");
        boolean flag = true;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i].compareTo(a[i+1]) > 0 ){
                flag = false;
            } else if(a[i].compareTo(a[i+1]) < 0 || a[i].compareTo(a[i+1]) == 0) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}