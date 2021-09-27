class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean neverOccur = true;
        int len = input.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }
        int n = input.nextInt();
        int m = input.nextInt();
        int indexOfN = 0;
        int indexOfM = 0;

        for (int i = 1; i < len; i++) {
            if (array[i] == n) {
                indexOfN = i;
            }
            if (array[i - 1] == m) {
                indexOfM = i - 1;
            }
            if (Math.abs(indexOfM - indexOfN) == 1) {
                neverOccur = false;
                break;
            }
        }
        System.out.println(neverOccur);
    }
}
