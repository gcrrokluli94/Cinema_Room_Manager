class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        int counter = 0;
        for (int i = 2; i < len; i++) {
            if (array[i] - array[i - 1] == 1 && array[i - 1] - array[i - 2] == 1) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
