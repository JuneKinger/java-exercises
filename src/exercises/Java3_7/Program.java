package exercises.Java3_7;

public class Program {

    public static void main(String[] args) {

        Computer computer1 = new Desktop("3.2", "200GB", "HP", 1, "white");

        Computer computer2 = new Laptop("1.6", "250GB", "Apple", 2, "silver", 10, 4);

        Computer computer3 = new Smartphone("1.7", "100GB", "Samsung", 1, "4GB", 10);

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(computer3.toString());

    }

}
