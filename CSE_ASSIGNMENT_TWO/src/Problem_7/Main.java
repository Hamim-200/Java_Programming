package Problem_7;

public class Main {

    public static void main(String[] args) {
        Furniture T1 = new Table("Table-1", 1);
        Furniture C1 = new Chair("Chair-1", 4);
        Furniture S1 = new Sofa("Sofa-1", 3);
        
        Furniture T2 = new Table("Table-2", 2);
        Furniture C2 = new Chair("Chair-2", 3);
        Furniture S2 = new Sofa("Sofa-2", 5);

        double total1 = T1.expenditure() + C1.expenditure() + S1.expenditure();
        System.out.println("Total for all 1 = " + total1);
        
        double total2 = T2.expenditure() + C2.expenditure() + S2.expenditure();
        System.out.println("Total for all 2 = " + total2);

    }

}
