import java.util.*;

public class Main {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(count(word));
    }

    private static boolean isVowels(char c) {
        boolean answer = false;
        for (char a : VOWELS) {
            if (c == a) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    private static int count(String word) {
        char[] mass = word.toCharArray();
        int count = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            if (isVowels(mass[i]) &&  isVowels(mass[i + 1]) && isVowels(mass[i + 2])) {
                count++;
                i++;
            } else if (!isVowels(mass[i]) &&  !isVowels(mass[i + 1]) && !isVowels(mass[i + 2])) {
                count++;
                i++;
            }
        }
        return count;
    }
}
