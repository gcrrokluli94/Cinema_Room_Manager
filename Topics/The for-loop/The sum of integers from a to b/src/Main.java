class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;
        for(int i = a ; i <= b ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
