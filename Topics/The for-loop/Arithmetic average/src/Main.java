class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int divisible = 0;
        double sum = 0.0;
        double avarage = 0.0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                divisible++;
            }
        }
        avarage = sum / divisible;
        System.out.println(avarage);
    }
}