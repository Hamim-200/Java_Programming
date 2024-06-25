package Book;

public class EnumExample {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public void displayDay(Day day) {
        switch (day) {
            case SATURDAY:
                System.out.println("It's Saturday! Weekend!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Weekend!");
                break;
            default:
                System.out.println("Weekday!");
        }
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();
        Day day = Day.SATURDAY;
        enumExample.displayDay(day);
    }
}
