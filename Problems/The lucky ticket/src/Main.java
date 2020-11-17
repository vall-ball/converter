import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < 3; i++) {
            firstSum += Character.getNumericValue(ticket.charAt(i));
        }

        for (int i = 3; i < 6; i++) {
            secondSum += Character.getNumericValue(ticket.charAt(i));
        }

        if (secondSum == firstSum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}