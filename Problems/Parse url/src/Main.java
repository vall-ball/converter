import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url =  scanner.nextLine();
        String param = url.split("\\?")[1];
        String[] mass = param.split("&");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = toStr(check(toPair(mass[i])));
        }
        String[] answer = searchForPass(mass);
        for (String s : answer) {
            System.out.println(s);
        }
    }

    private static String[] check(String[] pair) {
        if (pair.length == 1) {
            String[] answer = new String[2];
            answer[0] = pair[0];
            answer[1] = "not found";
            return answer;
        } else {
            return pair;
        }
    }

    private static String[] toPair(String s) {
        return s.split("=");
    }

    private static String toStr(String[] pair) {
        return pair[0] + " : " + pair[1];
    }

    private static String[] searchForPass(String[] mass) {
        boolean check = false;
        String password = "";
        for (String s : mass) {
            String[] temp = s.split(":");
            if (temp[0].equals("pass ")) {
                check = true;
                password = temp[1].substring(1, temp[1].length());
                break;
            }
        }
        if (check) {
            String[] answer = new String[mass.length + 1];
            System.arraycopy(mass, 0, answer, 0, mass.length);
            answer[answer.length - 1] = "password : " + password;
            return answer;
        } else {
            return mass;
        }
    }
}
