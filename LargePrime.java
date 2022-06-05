
import java.math.BigInteger;

public class LargePrime {
    public static void main(String[] args) {
        BigInteger two = BigInteger.valueOf(2);
        BigInteger largest = two.pow(82_589_933);
        BigInteger largestprimeNumber = largest.subtract(BigInteger.ONE);
        System.out.println(largestprimeNumber);
    }

}
