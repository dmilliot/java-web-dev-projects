package org.launchcode;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private String newItem;
    private String dateUpdated;
    private Map<String, Object> Categories = new HashMap<String, Object>();


    public Menu(String newItem, String dateUpdated, Map<String, Object> categories) {
        this.newItem = newItem;
        this.dateUpdated = dateUpdated;
        Categories = categories;
    }

    public String getNewItem() {
        return newItem;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public Map<String, Object> getCategories() {
        return Categories;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public void setCategories(Map<String, Object> categories) {
        Categories = categories;
    }
}
