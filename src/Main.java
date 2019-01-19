import java.math.BigInteger;

public class Main {

    public static void main(String[] args){
        String fact = "5040";
        System.out.println(calculateReverseFactorial(fact));
    }
    static BigInteger calculateFactorial(int n)
    {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <=n; i ++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    static int calculateReverseFactorial(String fact) {
        for (int i = 1; i <=2000; i++) {
            String currectFact = calculateFactorial(i).toString();
            if (currectFact.length() == fact.length()) {
                if (currectFact.equals(fact)) {
                    return i;
                }
            } else if (currectFact.length() > fact.length()) {
                break;
            }
        }
        return -1;
    }
}
