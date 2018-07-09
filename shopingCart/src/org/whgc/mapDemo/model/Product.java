package org.whgc.mapDemo.model;

public class Product {

    private String pid;
    private String name;
    private float price;
    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Product(String pid, String name, float price) {
        super();
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

}