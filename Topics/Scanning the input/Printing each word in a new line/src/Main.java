import static java.lang.System.out;

class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int len = 5;
        String[] str = new String[len];
        for (int i = 0 ; i < str.length; i++) {
            str[i] = sc.next();
        }
        for(String elem : str) {
            out.println(elem);
        }
    }
}