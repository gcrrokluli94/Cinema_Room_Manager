class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int len = input.nextInt();
        int[] array = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
