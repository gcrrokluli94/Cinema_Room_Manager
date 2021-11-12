import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        String word2;
        String word3;
        word = input.nextLine();
        word2 = input.nextLine();
        word3 = input.nextLine();
        Scanner input1 = new Scanner(word3);
        System.out.println(word);
        System.out.println(word2);
        System.out.println(input1.next());
        System.out.println(input1.next());
        input.close();
        input1.close();
    }
}
