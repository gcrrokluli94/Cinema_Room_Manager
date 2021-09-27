class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int len = input.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

        int n = input.nextInt();
        int counterN = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == n) {
                counterN++;
            }
        }
        System.out.println(counterN);
    }
}