import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() <= 1) {
            System.out.println("yes");
        } else if (check(str)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean check(String str) {
        char[] mass = str.toCharArray();
        boolean answer = true;
        for (int i = 0; i < mass.length / 2; i++) {
            if (mass[i] != mass[mass.length - i - 1]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
