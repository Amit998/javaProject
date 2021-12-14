package com.company;

public class Pizza implements Food{
    public String preparedItem;




    @Override
    public void prepareFood(String itemsRequired) {
        preparedItem="Thin Crust pizza with ingredients -"+itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
