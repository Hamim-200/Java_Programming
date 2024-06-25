package Problem_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the name of the Semester: ");
        String semester_name = S.nextLine();

        System.out.print("Enter year: ");
        int semster_year = S.nextInt();

        NextSemester sem1 = new NextSemester(semester_name, semster_year);
        System.out.println(sem1.display());
        System.out.println("Sum of the year: " + sem1.calculate(semster_year));

        sixMonths s1 = new sixMonths(semester_name, semster_year, 6);
        System.out.println(s1.display());
        System.out.println("Remainder: " + s1.calculate());

        fourMonths f1 = new fourMonths(semester_name, semster_year, 4);
        System.out.println(f1.display());
        System.out.println("Remainder: " + f1.calculate());
    }

}
