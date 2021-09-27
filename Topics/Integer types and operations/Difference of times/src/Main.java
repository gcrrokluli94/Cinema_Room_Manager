import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int startSecond = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        int endSecond = scanner.nextInt();

        int hours = endHour - startHour;
        int minutes = endMinute - startMinute;
        int seconds = endSecond - startSecond;
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println(totalSeconds);
    }
}