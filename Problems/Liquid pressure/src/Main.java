import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double po = scanner.nextDouble();
        double height = scanner.nextDouble();
        System.out.println(po * height * 9.8);
    }
}