package converter;
import java.util.Arrays;



public class Converter {

    public String getInteger(String str) {
        return str.split("\\.")[0];
    }

    public String getFractional(String str) {
        if (str.split("\\.").length == 1) {
            return "";
        } else
        return str.split("\\.")[1];
    }

    public String fromBaseToOut(String str, int sourceBase, int outputBase) {
        return Integer.toString(Integer.parseInt(str, sourceBase), outputBase);
    }

    public String fromIntDecimalToOutputBase(String str, int outputBase) {
        if (outputBase == 1) {
            int[] mass = new int[Integer.parseInt(str)];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = 1;
            }
            return Arrays.toString(mass).replaceAll("\\[|\\]|,|\\s", "");
        } else {
            return Integer.toString(Integer.parseInt(str), outputBase);
        }

    }

    public double fractionalPartToDecimal(String str, int sourceBase) {
        if (str.length() == 0) {
            return 0;
        } else {
            double result = 0;
            long base = (long) sourceBase;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    int n = fromCharToInt(str.charAt(i));
                    result += (double) n / base;
                    base *= sourceBase;
                } else {
                    result += (double) Character.getNumericValue(str.charAt(i)) / sourceBase;
                    base *= base;
                }
            }
            return result;
        }
    }
    public String fractionalDecPartToNewBase(String str, int outputBase) {
        String s = "0." + str;
        double result = Double.parseDouble(s);
        double base = (double) outputBase;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result *= base;
            if ((int) result > 9) {
                builder.append(fromIntToChar((int) result));
            } else {
                builder.append((int) result);
            }
            result = result % 1;
        }
        return builder.toString();
    }

    public int fromCharToInt(char c) {
        return (int) c - 87;
    }

    public char fromIntToChar(int i) {
        return (char) (i + 87);
    }

    public String toDecimal(String str, int sourceBase) {
        if (sourceBase == 1) {
            return String.valueOf(str.length());
        } else if (sourceBase != 10) {
            String dec = fromBaseToOut(getInteger(str), sourceBase, 10);
            double frac = fractionalPartToDecimal(getFractional(str), sourceBase);
            String fractional = Double.toString(frac);
            return dec + "." + fractional.substring(2);
        } else {
            return str;
        }


    }

    public String fromDecimalToOutputBase(String str, int outputBase) {
        String intDecPart =  getInteger(str);
        String fractional = getFractional(str);
        String intNewBasePart = fromIntDecimalToOutputBase(intDecPart, outputBase);
        String fracPart = fractionalDecPartToNewBase(fractional, outputBase);
        return intNewBasePart + "." + fracPart;
    }

    public String mainMethod(String str, int sourceBase, int outputBase) {
        String dec = toDecimal(str, sourceBase);
        return fromDecimalToOutputBase(dec,outputBase);
    }
}
