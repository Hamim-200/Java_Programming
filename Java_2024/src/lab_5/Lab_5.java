package lab_5;

import java.util.*;

public class Lab_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number or string : ");
        String str = scan.nextLine();

        if (isPalindrom(str)) {
            System.out.println("this is palindrom");
        } else {
            System.out.println("this is not");
        }
    }

    public static boolean isPalindrom(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[str.length() - 1 - i];
            arr[arr.length - 1 - i] = temp;

            if (arr[i] != arr[str.length() - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
