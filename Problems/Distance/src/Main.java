import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int time = scanner.nextInt();
        double speed = distance / time;
        System.out.println(speed);
    }
}