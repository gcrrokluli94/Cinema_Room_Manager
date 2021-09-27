import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < 3; i++) {
            box1[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = in.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        for (int i = 0; i < 3; i++) {
            if (box1[i] > box2[i] || box1[i] < box2[i]) {
                for (int j = i + 1; j < 2; j++) {
                    if (box1[j] > box2[j]) {
                        for (int k = j + 1; k < 3; k++) {
                            if (box1[k] > box2[k] && Math.abs(box1[k] - box2[k]) < 4) {
                                System.out.println("Box 1 > Box 2");
                            } else if (box1[k] == box2[k]) {
                                System.out.println("Incompatible");
                                System.exit(0);
                            }
                        }
                    } else if (box1[j] < box2[j]) {
                        for (int k = j + 1; k < 3; k++) {
                            if (box1[k] < box2[k] && Math.abs(box1[k] - box2[k]) < 4) {
                                System.out.println("Box 1 < Box 2");
                            }
                        }
                    } else if (box1[j] == box2[j]) {
                        System.out.println("Incompatible");
                        System.exit(0);
                    }
                }
            } else if (box1[i] == box2[i]) {
                System.out.println("Incompatible");
                System.exit(0);
            }
        }
    }
}
