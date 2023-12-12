package org.launchcode;

public class MenuItems {
    private String description;
    private Double price;
    private String category;

    public MenuItems(String description, Double price, String category) {
        this.description = description;
        this.price = price;
        this.category = category;
    }


    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String category() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
