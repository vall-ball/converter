import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(Math.min(x2, x1) + " " + Math.max(x2, x1));
    }
}