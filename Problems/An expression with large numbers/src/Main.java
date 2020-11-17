import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String as = scanner.next();
        String bs = scanner.next();
        String cs = scanner.next();
        String ds = scanner.next();
        BigInteger a = new BigInteger(as);
        BigInteger b = new BigInteger(bs);
        BigInteger c = new BigInteger(cs);
        BigInteger d = new BigInteger(ds);
        System.out.println(a.negate().multiply(b).add(c).subtract(d));
    }
}