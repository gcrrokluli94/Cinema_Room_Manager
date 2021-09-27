class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int answer = input.nextInt();
        switch(answer) {
            case 1: System.out.println("Yes!");
            break;
            case 2:
            case 3:
            case 4: System.out.println("No!");
            break;
            default: System.out.println("Unknown number");
            break;
        }
    }
}
