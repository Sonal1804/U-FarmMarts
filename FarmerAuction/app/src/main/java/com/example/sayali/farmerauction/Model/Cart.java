package com.example.sayali.farmerauction.Model;

public class Cart {

    String pid, pname, quantity, price, productID,userphone,saveCurrentdt;

    public Cart() {
    }

    public Cart(String pid,String userphone,String saveCurrentdt, String productID,String pname, String quantity, String price) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.productID=productID;
        this.userphone=userphone;
        this.saveCurrentdt=saveCurrentdt;
    }

    public String getSaveCurrentdt() {
        return saveCurrentdt;
    }

    public void setSaveCurrentdt(String saveCurrentdt) {
        this.saveCurrentdt = saveCurrentdt;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}