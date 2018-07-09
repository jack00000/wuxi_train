package org.whgc.mapDemo.util;

import org.whgc.mapDemo.model.Product;

public class Item {
    private int num;
    private Product product;

    public Item(int num,Product product){
        this.num=num;
        this.product=product;
    }
    public int getNum() {
        return num;
    }

    public Product getProduct() {
        return product;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
