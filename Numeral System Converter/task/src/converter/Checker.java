package converter;

public class Checker {

    public boolean check(String sourceBase, String outputBase) {
        if (checkIsNumber(sourceBase) && checkIsNumber(outputBase)) {
            return checkBase(Integer.parseInt(sourceBase)) && checkBase(Integer.parseInt(outputBase));
        } else {
            return false;
        }


    }

    public boolean checkBase(int base) {
        return base <= 36 && base > 0;
    }

    public boolean checkIsNumber(String n) {
        boolean answer = true;
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
                answer = false;
                break;
            }
        }
        return answer;
    }

}
