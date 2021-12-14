package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Normal Scenario with out facase

        Ingredient ingredient=new Ingredient();

        Food pasta=new Pasta();
        String pastaItems=ingredient.getPastaItems();
        pasta.prepareFood(pastaItems);
        System.out.println(pasta.deliverFood());


        System.out.println("------------FACADE---------------");

        System.out.println(Waiter.deliveryFood(FoodType.PASTA));






    }
}
