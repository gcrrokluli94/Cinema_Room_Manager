class Main {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int year = 0;
        do {
            year = in.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("Leap");
            } else if (year % 4 == 0 && year % 100 == 0  && year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } while (year <= 1900 || year >= 3000);

    }
}
