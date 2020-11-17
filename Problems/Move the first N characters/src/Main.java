import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        System.out.println(changeString(s, n));

    }

    private static String changeString(String s, int n) {
        if (n >= s.length()) {
            return s;
        } else {
            String a = s.substring(0, n);
            String b = s.substring(n, s.length());
            return b + a;
        }

    }
}