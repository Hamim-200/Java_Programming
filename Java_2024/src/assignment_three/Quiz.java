package assignment_three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Quiz {

    private int id;
    private int marks;

    Quiz(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Quiz[] quiz = new Quiz[10];

        try {
            File file = new File("data.txt");
            int highestMarks = Integer.MIN_VALUE;
            int maxMarkId = -1;
            Scanner s = new Scanner(file);

            int index = 0;

            while (s.hasNext()) {
                int id = s.nextInt();
                int marks = s.nextInt();

                System.out.println("Id: " + id + " Marks: " + marks);
                quiz[index] = new Quiz(id, marks);
                if (marks > highestMarks) {
                    highestMarks = marks;
                    maxMarkId = id;
                }
                index++;
            }
            System.out.println("Hight Mark obtain ID: " + maxMarkId);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
