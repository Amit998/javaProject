package com.company;

public class Waiter {

    public static String deliveryFood(FoodType foodType){
        Ingredient ingredient=new Ingredient();
        switch (foodType){
            case PASTA:
                Food pasta=new Pasta();
                String pastaItems=ingredient.getPastaItems();
                pasta.prepareFood(pastaItems);

                return pasta.deliverFood();
            case PIZZA:
                Food pizza=new Pizza();
                String pizzaItems=ingredient.getPastaItems();
                pizza.prepareFood(pizzaItems);

                return pizza.deliverFood();
        }
        return null;
    }
}
