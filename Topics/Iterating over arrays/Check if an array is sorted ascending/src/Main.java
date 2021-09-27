class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean isSortedAsc = true;
        int len = input.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 1; i < len; i++) {
            if (array[i] > array[i - 1]) {
                isSortedAsc = true;
            } else if (array[i] < array[i - 1]){
                isSortedAsc = false;
                break;
            }
        }
        System.out.println(isSortedAsc);
    }
}