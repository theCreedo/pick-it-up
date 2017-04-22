package com.example.ty.pickitup;

public class Achievement {

    private String type;
    private int number;
    private int image;

    public Achievement(String type, int number) {
        this.type = type;
        this.number = number;
        this.image = image;
    }

    public String type(){
        return this.type;
    }

    public int level(){
        return this.number;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int image(){
        return this.image;
    }
}