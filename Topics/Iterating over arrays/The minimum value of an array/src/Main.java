class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        int min = 0;
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        min = array[0];
        for (int i = 0; i < len; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
