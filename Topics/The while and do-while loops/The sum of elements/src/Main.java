class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int data;
        int sum = 0;
        do {
            data = input.nextInt();
            sum += data;
        } while (data != 0);
        System.out.println(sum);
    }
}
