class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        int max = 0;
        int indexPos = 0;
        for (int i = 0; i< len; i++) {
            array[i] = in.nextInt();
            if(array[i] > max) {
                max = array[i];
                indexPos = i;
            }
        }
        System.out.println(indexPos);
    }
}