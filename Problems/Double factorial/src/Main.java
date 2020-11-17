import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger answer = BigInteger.ONE;
        int i = 1;

        boolean parity;
        if (n % 2 == 0) {
            parity = true;
        } else {
            parity = false;
        }

        while (i <= n) {
            if (parity && i % 2 == 0 || !parity && i % 2 != 0) {
                answer = answer.multiply(BigInteger.valueOf(i));
            }
            i++;
        }
        return answer;
    }
}