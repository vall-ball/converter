import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] mass = date.split("-");
        String answer = mass[1] + "/" + mass[2] + "/" + mass[0];
        System.out.println(answer);

    }
}