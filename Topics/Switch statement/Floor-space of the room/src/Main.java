class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        String room = input.next();
        switch (room) {
            case "triangle":
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double p = (a + b + c) / 2;
                double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(triangleArea);
                break;
            case "rectangle":
                double aR  = input.nextDouble();
                double bR = input.nextDouble();
                double rectangleArea = aR * bR;
                System.out.println(rectangleArea);
                break;
            case "circle":
                final double PI = 3.14;
                double r = input.nextDouble();
                double circleArea = PI * Math.pow(r, 2);
                System.out.println(circleArea);
                break;
            default : System.exit(1);
        }
    }
}