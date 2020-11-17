import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dna = scanner.nextLine();
       // int i = 4;
       // char c = 'b';
        System.out.println(loop(dna));
    }

    private static String repeatedSymbols(String str, char symbol, int position) {
        int count = 0;
        char[] mass = str.toCharArray();
        for (int i = position; i < mass.length; i++) {
            //System.out.println("mass[i] = " + mass[i]);
           // System.out.println("symbol = " + symbol);
            if (mass[i] == symbol) {
                count++;
            } else {
                break;
            }
        }
        return String.valueOf(symbol) + String.valueOf(count);
    }

    private static String loop(String str) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        char c;
        while (i != str.length()) {
            c = str.charAt(i);
            String s = repeatedSymbols(str, c, i);
            builder.append(s);
            i += Integer.parseInt(s.substring(1, s.length()));
        }
        return builder.toString();
    }
}
