package Problem_2;

import java.util.*;

public class main {

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

        S.nextLine();

        Intersession[] intersessions = new Intersession[2];
        for (int i = 0; i < intersessions.length; i++) {
            System.out.print("Enter the name of the " + (i + 1) + " Intersession Semester : ");
            String intersessionName = S.nextLine();

            System.out.print("Enter year: ");
            int intersessionYear = S.nextInt();
            S.nextLine();

            intersessions[i] = new Intersession(intersessionName, intersessionYear);
            System.out.print("Do you have a project? type true or false!! : ");
            boolean hasProject = S.nextBoolean();
            S.nextLine();


            System.out.println(intersessions[i].display());
            System.out.println("Remainder: " + intersessions[i].calculate());
            intersessions[i].project(hasProject);
        }
    }

}
