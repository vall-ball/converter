import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subS = scanner.nextLine();
    //  System.out.println(str);
    //  System.out.println(subS);

        int count = 0;
        if (str.length() >= subS.length()) {
            for (int i = 0; i < str.length() - subS.length() + 1; i++) {
              // System.out.println(str.substring(i, i + subS.length()));
                if (str.substring(i, i + subS.length()).equals(subS)) {
                    count++;
                    i += subS.length() - 1;
                   // System.out.println("i=" + i );
                }
            }
        }
        System.out.println(count);
    }


}