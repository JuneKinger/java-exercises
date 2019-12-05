package org.launchcode.java.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private String name;

    // LocalDate queries and obtains the current date from the system clock in the
    // default time-zone
    private LocalDate updatedAt = LocalDate.now();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
    }

    public Menu(String aName) {
        this.name = aName;
    }

    public Menu(String aName, ArrayList<MenuItem> menuItemList) {
        this.name = aName;
        this.menuItems = menuItemList;
    }

    public String getName() {
        return name;
    }

    // @todo 3: A way to tell when the menu was last updated
    public void setName(String name) {
        this.name = name;
        this.updateTimeStamp();
    }

    // @todo 3: A way to tell when the menu was last updated
    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.updateTimeStamp();
    }

    // @todo 1: A way to add and remove menu items from the menu
    // @todo 3: A way to tell when the menu was last updated
    public void addMenuItem(MenuItem aMenuItem) {

        // works without this. keyword
        this.menuItems.add(aMenuItem);
        this.updateTimeStamp();
    }
    public void removeMenuItem(MenuItem aMenuItem) {

        // works without this. keyword
        this.menuItems.remove(aMenuItem);
        this.updateTimeStamp();
    }

    // @todo 4: A way to print out both a menu item and an entire menu
    // get the data out of the ArrayList with index and then print
    public void printMenuItem(Integer index) {

        // get the arrayList element via index to print out
        System.out.println(this.menuItems.get(index));
    }

    // @todo 4: A way to print out both a menu item and an entire menu
    public void printMenu() {

        // works without this. keyword
        System.out.println(this.updatedAt);
        System.out.println("All menu items");
        for (MenuItem item : this.menuItems) {
            System.out.println(item);
        }
    }

    // @todo 3: A way to tell when the menu was last updated

    // june - why is this method private and the other methods public?
    private void updateTimeStamp() {

        // setting the field updatedAt with this.updatedAt
        // works without this. keyword
        this.updatedAt = LocalDate.now();
    }
}
