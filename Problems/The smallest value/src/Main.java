import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = new BigInteger(scanner.next());
        BigInteger factorial = BigInteger.ONE;
        BigInteger count = BigInteger.ONE;
        while (factorial.compareTo(m) < 0) {
            factorial = factorial.multiply(count);
            if (factorial.compareTo(m) < 0) {
                count = count.add(BigInteger.ONE);
            }
        }
        System.out.println(count);
    }
}