package com.company;

public class Pasta implements Food{
    public String preparedItem;


    @Override
    public void prepareFood(String itemsRequired) {
        preparedItem="Tomato Pasta with ingredients -"+itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
