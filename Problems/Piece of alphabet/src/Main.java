import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() <= 1) {
            System.out.println("true");
        } else if (check(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean check(String str) {
        boolean answer = true;
        char[] mass = str.toCharArray();
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] != mass[i + 1] - 1) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}