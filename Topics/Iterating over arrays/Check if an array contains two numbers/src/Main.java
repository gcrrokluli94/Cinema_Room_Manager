
class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int size = input.nextInt();
        boolean occurNext = false;

        int indexOfN = 0;
        int indexOfM = 0;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                indexOfN = i;
            } else if (array[i] == m) {
                indexOfM = i;
            }
        }
        int differenceOfPositions = 1;

        if (differenceOfPositions == Math.abs(indexOfM - indexOfN)) {
            occurNext = true;
        }
        System.out.println(occurNext);
    }
}
