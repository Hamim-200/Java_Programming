package assignment_lab;

/**
 *
 * @author Hamim_Ahmed
 */
public class Assignment_lab {

    public static int sumOfDigits(int id) {
        int sum = 0;
        while (id != 0) {
            sum += id % 10;
            id /= 10;
        }
        return sum;

    }

    public static boolean isPrime(int sum) {
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int id = 1665;

        int SUM = sumOfDigits(id);
        System.out.println("The Sum of Id Digit Sum" + " = " + SUM + " and it is a prime number " + isPrime(SUM));

    }

}
