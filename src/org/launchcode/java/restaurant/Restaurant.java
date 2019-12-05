package org.launchcode.java.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setName("Waffles");
        MenuItem eggo = new MenuItem("eggo", 3.99, "nasty", "breakfast");
        MenuItem belgium = new MenuItem("belgium", 9.99, "fluffy", "breakfast");

        // addMenuItem and printMenuItem is in Menu.java which is imported above
        menu.addMenuItem(eggo);
        menu.addMenuItem(belgium);
        menu.printMenuItem(1);
        //menu.system.out.println("************");
        menu.printMenu();
    }
}