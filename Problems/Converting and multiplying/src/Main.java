import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            try {
                int i = Integer.parseInt(s);
                if (i == 0) {
                    break;
                } else {
                    System.out.println(i * 10);
                }
            } catch (Exception ex) {
                System.out.println("Invalid user input: " + s);
            }
        }

    }
}