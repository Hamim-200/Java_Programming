package assignment_lab;

public class lab_second {

    public static void main(String[] args) {
        int id = 1797;

        System.out.println("Sum of digits: " + sumOfDigits(id));
        System.out.println("Is prime: " + isPrime(id));

    }

    public static int sumOfDigits(int id) {
        int sum = 0;
        while (id != 0) {
            sum += id % 10;
            id /= 10;

        }

        return sum;
    }

    public static boolean isPrime(int sum) {

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        int id = 1797;
//        int SUM = sumOfDigits(id);
//
//        System.out.println("Sum of digits: " + "=" + SUM + "and its a prime number" + isPrime(SUM));
//
//    }
}
