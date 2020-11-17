package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringSourceBase = "";
        String number = "";
        String stringOutputBase = "";
            if (scanner.hasNext()) {
               stringSourceBase = scanner.next();
            } else {
                System.out.println("error");
            }
        if (scanner.hasNext()) {
           number = scanner.next();
        } else {
            System.out.println("error");
        }
        if (scanner.hasNext()) {
            stringOutputBase = scanner.next();
        } else {
            System.out.println("error");
        }
            Checker checker = new Checker();
        if (!stringSourceBase.equals("") && !stringOutputBase.equals("") && !number.equals("")) {

                if (checker.check(stringSourceBase, stringOutputBase)) {
                    Converter converter = new Converter();
                    System.out.println(converter.mainMethod(number, Integer.parseInt(stringSourceBase), Integer.parseInt(stringOutputBase)));
                } else {
                    System.out.println("error");
                }

            }


    }
}
