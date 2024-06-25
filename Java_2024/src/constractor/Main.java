package constractor;

public class Main {
    public static void main(String[] args) {
        Teacher T1 = new Teacher();
//        T1.displayInformation();
        Teacher T2 = new Teacher("Hamim","Male");
        T2.displayInformation();
        Teacher T3 = new Teacher("Tamim","Male",28923);
        T3.displayInformation();
    }
    
}
