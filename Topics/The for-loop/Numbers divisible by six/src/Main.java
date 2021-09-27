class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        int total = 0;
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
            if (array[i] % 6 == 0) {
                total += array[i];
            }
        }
        System.out.println(total);
    }
}
