import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(check(str));

    }

    private static int check(String str) {
        int answer = -1;
        for (int i = 0; i <= str.length() - 3; i++) {
            //System.out.println("str.substring(i, i + 3).toUpperCase() " + str.substring(i, i + 3).toUpperCase());
            if (str.substring(i, i + 3).toUpperCase().equals("THE")) {
                //System.out.println("str.substring(i, i + 3).toUpperCase() " + str.substring(i, i + 3).toUpperCase());
                answer = i;
                break;
            }
        }
        return answer;
    }
}