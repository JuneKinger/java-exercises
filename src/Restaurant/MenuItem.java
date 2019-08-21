package Restaurant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MenuItem {
    private String menuName;
    private String description;
    private String category;
    private double price = 0.0;
    private Map<String, Date> newMenuItemDate = new HashMap<>();

    public MenuItem(String menuName, String description, String category, double price, Map<String, Date>newMenuItemDate) {
        this.menuName = menuName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newMenuItemDate = newMenuItemDate;
    }

    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public HashMap<String, Date> getNewMenuItemDate() {
        return (HashMap<String, Date>) this.newMenuItemDate;

    }
    public void setNewMenuItemDate(Map<String, Date> newMenuItemDate) {
        this.newMenuItemDate = newMenuItemDate;
    }
}

