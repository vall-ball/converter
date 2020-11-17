import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] mass = str.toCharArray();
        char[] resultMass = new char[mass.length * 2];
        for (int i = 0; i < resultMass.length; i += 2) {
            resultMass[i] = mass[i / 2];
        }
        for (int i = 1; i < resultMass.length; i += 2) {
            resultMass[i] = mass[i / 2];
        }
        System.out.println(new String(resultMass));
    }
}