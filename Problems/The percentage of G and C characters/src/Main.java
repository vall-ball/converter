import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double result;
        char[] mass = str.toCharArray();
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 'c' || mass[i] == 'C' || mass[i] == 'g' || mass[i] == 'G') {
                count++;
            }
        }
        result = (double) count / mass.length * 100;
        System.out.println(result);
    }
}