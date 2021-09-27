import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int len = in.nextInt();
        int[] array = new int[len];
        List<Integer> list = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < len; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < len - 1; i++) {
            if (array.length == 1) {
                counter = 1;
                break;
            } else if (array[i + 1] > array[i]) {
                ++counter;
            } else {
                list.add(counter);
                counter = 1;
            }
        }
        list.add(counter);
        Integer longestSeq = list
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        out.println(longestSeq);
    }
}