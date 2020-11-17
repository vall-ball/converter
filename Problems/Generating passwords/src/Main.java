import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(generatePassword(a, b, c, n));
    }

    private static String generatePassword(int a, int b, int c, int n) {
        char[] mass = new char[n];
        String password = "";
        char previousSymbol = ' ';
        while (true) {
            for (int i = 0; i < n; i++) {
                while (true) {
                    mass[i] = generateSymbol(a, b, c);
                    if (mass[i] != previousSymbol) {
                        previousSymbol = mass[i];
                        break;
                    }
                }
            }
            password = new String(mass);
            if (checkDigits(password, c) && checkLowerCase(password, b) && checkUpperCase(password, a)) {
                break;
            }
        }
        return password;
    }

    private static char generateSymbol(int a, int b, int c) {
        Random random = new Random();
        if (a == 0 && b == 0 && c == 0) {
            int i = 0;
            while (true) {
                i = random.nextInt(74) + 48;
                if (i < 58 || (i > 64 && i < 91) || i > 96) {
                    break;
                }
            }
            return (char) i;
        } else if (a == 0 && b == 0) {
            return generateOnlyDigits();
        } else if (a == 0 && c == 0) {
            return generateOnlyLowerCase();
        } else if (b == 0 && c == 0) {
            return generateOnlyUpperCase();
        } else if (a == 0) {
            int i = 0;
            while (true) {
                i = random.nextInt(74) + 48;
                if (i < 58 || i > 96) {
                    break;
                }
            }
            return (char) i;
        } else if (b == 0) {
            int i = 0;
            while (true) {
                i = random.nextInt(74) + 48;
                if (i < 58 || (i > 64 && i < 91)) {
                    break;
                }
            }
            return (char) i;
        } else if (c == 0) {
            int i = 0;
            while (true) {
                i = random.nextInt(74) + 48;
                if ((i > 64 && i < 91) || i > 96) {
                    break;
                }
            }
            return (char) i;
        } else if (c > a || c > b) {
            int i = 0;
            int check = random.nextInt(2);
            if (check == 0) {
                return generateOnlyDigits();
            } else {
                while (true) {
                    i = random.nextInt(74) + 48;
                    if (i < 58 || (i > 64 && i < 91) || i > 96) {
                        break;
                    }
                }
                return (char) i;
            }
        }else {
                int i = 0;
                while (true) {
                    i = random.nextInt(74) + 48;
                    if (i < 58 || (i > 64 && i < 91) || i > 96) {
                        break;
                    }
                }
                return (char) i;
            }
        }


    private static char generateOnlyUpperCase() {
        Random random = new Random();
        int i = random.nextInt(25) + 65;
        return (char) i;
    }

    private static char generateOnlyLowerCase() {
        Random random = new Random();
        int i = random.nextInt(25) + 97;
        return (char) i;
    }

    private static char generateOnlyDigits() {
        Random random = new Random();
        int i = random.nextInt(10) + 48;
        return (char) i;
    }

    private static boolean checkUpperCase (String password, int a) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                count++;
            }
        }
        return (count >= a);
    }

    private static boolean checkLowerCase (String password, int b) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                count++;
            }
        }
        return (count >= b);
    }

    private static boolean checkDigits (String password, int c) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return (count >= c);
    }

   /* private static boolean notTwoEquels (String password) {
        boolean answer = true;
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                answer = false;
                break;
            }
        }
        return answer;
    }*/
}
