class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        long startIncl = input.nextInt();
        long endExcl = input.nextInt();
        long sum = 1;
        for(long i = startIncl; i < endExcl; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}