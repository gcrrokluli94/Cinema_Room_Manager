class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] == 5) {
                counterA++;
            } else if (array[i] == 4) {
                counterB++;
            } else if (array[i] == 3) {
                counterC++;
            } else if (array[i] == 2) {
                counterD++;
            }
        }
        System.out.println(counterD + " " + counterC + " " + counterB + " " + counterA);
    }
}
