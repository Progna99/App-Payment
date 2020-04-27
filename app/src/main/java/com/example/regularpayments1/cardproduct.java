package com.example.regularpayments1;

import androidx.annotation.NonNull;

public class cardproduct {
    String name;
    String money;
    String week;
    String payment;
    private int image;

    public cardproduct(String name,String money,String week,String payment,int  image){
        this.name=name;
        this.money=money;
        this.week=week;
        this.payment=payment;
        this.image=image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMoney(){
        return money;
    }
    public void setMoney(String money){
        this.money=money;
    }
    public String getWeek(){
        return week;
    }
    public void setWeek(String week){
        this.week=week;
    }
    public String getPayment(){
        return payment;
    }
    public void setPayment(String payment){
        this.payment=payment;
    }
    public int getImage(){
        return image;
    }
    public void setImage(){
        this.image=image;
    }


}
