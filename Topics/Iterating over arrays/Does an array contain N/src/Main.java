class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        boolean isTrue = false;
        int len = in.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        int numb = in.nextInt();
        for (int i = 0; i < len; i++) {
            if (array[i] == numb) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);
    }
}
