package com.backend.psbp.model;

public class Plant {

    private String id;
    private String name;
    private String type;
    private String description;
    private String image;
    private String price;
    private String stock;

    public Plant(String name, String type, String description, String image, String price, String stock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.image = image;
        this.price = price;
        this.stock = stock;
    }
    
    public int getId() {
        return Integer.parseInt(id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public String getStock() {
        return stock;
    }
}
