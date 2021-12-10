package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Laptop dell=LaptopFactory.getLaptop(LaptopType.Dell);
        Laptop mac=new Mac("8GB","Intel");
        Laptop hp=new Hp("8GB","Intel");

        System.out.println(dell.toString());

    }
}
