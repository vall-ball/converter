import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mass = str.split(" ");
        String longestWord = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].length() > longestWord.length()) {
                longestWord = mass[i];
            }
        }
        System.out.println(longestWord);
    }
}