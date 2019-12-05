package org.launchcode.java.restaurant;

import java.time.LocalDate;
import java.time.Period;


public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private LocalDate createdAt = LocalDate.now();

    public MenuItem() {
    }

    public MenuItem(String aName, Double aPrice, String aDescription, String aCategory) {
        this.name = aName;
        this.price = aPrice;
        this.category = aCategory;
        this.description = aDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    // @todo 2: A way to tell if a menu item is new
    // I considered a menu item to be new if it was created within the last three days
    public boolean isMenuItemNew() {

        // LocalDate and Period modules are imported above -
        // the built-in between() function returns the period between the dates
        // works without this. keyword
        Period period = Period.between(LocalDate.now(), this.createdAt);

        // built-in getDays() gets the number of days in this Period
        return period.getDays() < 3;
    }

    // @todo 4: A way to print out both a menu item and an entire menu
    // this assists with setting up how I want menuItems to display when I print them;
    @Override
    public String toString() {
        // works without this. keyword
        return "category: " + this.category + "name: " + this.name + "price: " + this.price + "description: " + this.description;
    }

    // @todo 5: A way to determine whether or not two menu items are equal
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        // cast input o to be of type MenuItem with syntax (MenuItem) o
        MenuItem item = (MenuItem) o;
        return item.getName() == getName();
    }
}
