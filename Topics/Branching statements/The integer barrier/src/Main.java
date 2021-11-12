class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int sum = 0;
        int data = 0;
        while (in.hasNext()) {
            data = in.nextInt();
            sum += data;
            if (sum >= 1000) {
                if (data == 0) {
                    break;
                } else continue;
            }
            }
        if (sum >= 1000) {
            sum -= 1000;
        }
        System.out.println(sum);
    }
}