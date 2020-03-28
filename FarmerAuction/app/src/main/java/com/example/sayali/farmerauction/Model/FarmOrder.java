package com.example.sayali.farmerauction.Model;

public class FarmOrder {

    String pid,pname,price,userphone,saveCurrentdt;

    public FarmOrder() {
    }

    public FarmOrder(String pid, String pname,String saveCurrentdt, String price,String userphone) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
