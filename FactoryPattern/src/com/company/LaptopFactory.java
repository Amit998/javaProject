package com.company;

public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptopType){
        switch (laptopType){
            case Dell:
                return new Dell("8GB","Intel");

            case Mac:
                return new Hp("8GB","Intel");

            case Hp:
                return new Mac("8GB","Intel");

        }
        return null;
    }
}
