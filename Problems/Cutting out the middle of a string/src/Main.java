import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() <= 2) {
            System.out.println("");
        } else {
            System.out.println(modify(str));
        }
    }

    private static String modify(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2 - 1) + str.substring(str.length() / 2 + 1, str.length());
        } else {
            return str.substring(0, str.length() / 2) + str.substring(str.length() / 2 + 1, str.length());
        }
    }
}
