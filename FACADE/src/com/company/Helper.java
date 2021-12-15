package com.company;

import java.util.Scanner;

public class Helper {
    public static String deliverProduct(BrandType brandType){
        Categories categories=new Categories();
        ComboClass combo=new ComboClass();
        Scanner sc = new Scanner(System.in);
        int noOfDevice;
        String categoryItem,comboItem,selectedType="";




        switch (brandType){
            case Android:

                Device android=new Android();
                System.out.println("How Many Do You Want to Buy?");
                noOfDevice = sc.nextInt();
                while (!android.validateNoOfDevice(noOfDevice)){
                    System.out.println("We Only Have "+android.getNoOfDeviceLeft()+" Device left");
                    noOfDevice = sc.nextInt();
                }

                categoryItem=categories.getCategoriesDetails();
                comboItem=combo.getComboDetails();
                android.getComboDetails(comboItem);
                android.getSpcsDetails(categoryItem);

                return android.deliverProduct();
            case Windows:

                Device windows=new WindowsOs();
                System.out.println("How Many Do You Want to Buy?");
                noOfDevice = sc.nextInt();
                while (!windows.validateNoOfDevice(noOfDevice)){
                    System.out.println("We Only Have "+windows.getNoOfDeviceLeft()+" Device left");
                    noOfDevice = sc.nextInt();
                }
                categoryItem=categories.getCategoriesDetails();
                comboItem=combo.getComboDetails();
                windows.getComboDetails(comboItem);
                windows.getSpcsDetails(categoryItem);
                return windows.deliverProduct();
            case BlackBerry:

                Device blackberry=new Blackberry();
                System.out.println("How Many Do You Want to Buy?");
                noOfDevice = sc.nextInt();
                while (!blackberry.validateNoOfDevice(noOfDevice)){
                    System.out.println("We Only Have "+blackberry.getNoOfDeviceLeft()+" Device left");
                    noOfDevice = sc.nextInt();
                }
                categoryItem=categories.getCategoriesDetails();
                comboItem=combo.getComboDetails();
                blackberry.getComboDetails(comboItem);
                blackberry.getSpcsDetails(categoryItem);
                return blackberry.deliverProduct();
        }


        return null;
    }
}
