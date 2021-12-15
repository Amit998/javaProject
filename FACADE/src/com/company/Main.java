package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int flag=1;
        String model,buyAgain;
        BrandType[] allBrand=BrandType.values();




        while (flag==1 || flag == 2){
            if (flag==1){
                flag=2;
                System.out.println("Which Model Do You Want to Buy?");
                for(BrandType brand : allBrand){
                    System.out.println(brand);
                }
                model = sc.nextLine();

                for(BrandType brand : allBrand){
                    if (brand.name().equals(model)){
                        System.out.println(Helper.deliverProduct(brand));
                    }
                }
            }else if (flag==2){
                flag=1;
                System.out.println("Do You Want to Buy Again? Please Select:-\nYes\nNo");
                buyAgain=sc.nextLine();

                if (buyAgain.toString().toLowerCase(Locale.ROOT).equals("yes")){
                    continue;
                }else {
                    break;
                }
            }


        }



    }
}
