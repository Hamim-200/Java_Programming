package encapsulation;

public class test {

    public static void main(String[] args) {
        person p1 = new person();

        p1.setName("Hamim");
        System.out.println("Name = " + p1.getName());

        p1.setAge(18);
        System.out.println("Age = " + p1.getAge());

    }

}
