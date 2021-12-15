package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Categories {
    public List getRam(){
        List<String> ramTypes=new ArrayList<String>();
        ramTypes.add("2");
        ramTypes.add("4");
        ramTypes.add("6");
        ramTypes.add("8");
        ramTypes.add("12");
        return ramTypes;
    }

    public List getSensors(){
        List<String> sensorTypes=new ArrayList<String>();
        sensorTypes.add("x");
        sensorTypes.add("y");
        sensorTypes.add("z");
        return sensorTypes;
    }

    public List getColors(){
        List<String> colorTypes=new ArrayList<String>();
        colorTypes.add("red");
        colorTypes.add("blue");
        colorTypes.add("black");
        colorTypes.add("grey");
        return colorTypes;
    }

    public List getStorageSize(){
        List<String> stTypes=new ArrayList<String>();
        stTypes.add("32");
        stTypes.add("64");
        stTypes.add("128");
        stTypes.add("256");
        return stTypes;
    }

    public String getDefaultRam(){
        return "4";
    }
    public String getDefaultColor(){
        return "black";
    }
    public String getDefaultStorage(){
        return "64";
    }
    public String getDefaultSensor(){
        return "x";
    }




    public String getCategoriesDetails(){
        String ram,color,size,sensor,data,isCustomize;
        Scanner sc=new Scanner(System.in);

        List<String>
                ramData=this.getRam(),
                storageData=this.getStorageSize(),
                sensorData=this.getSensors(),
                colorData=this.getColors();


        System.out.println("Do You Want To Customize Device?Or By Default you will get This Specification ");
        System.out.println("RAM->"+getDefaultRam()+"\nStorage->"+getDefaultStorage()+"\nColor->"+getDefaultColor()+"\nSensor->"+getDefaultSensor()+"\nPlease Enter-> \nYes\nNo");
        isCustomize=sc.nextLine();
        if (isCustomize.toString().toLowerCase(Locale.ROOT).equals("yes")) {
            System.out.println("Please Enter The Ram You Want Add into your device");
            ram = getInfo(ramData,"RAM");
            System.out.println("Please Enter The Color You Want to use");
            color = getInfo(colorData,"Color");
            System.out.println("Please Enter The Storage Size You Want To Use");
            size = getInfo(storageData,"GB");
            System.out.println("Please Enter The Additional Sensor You Want To Add");
            sensor = getInfo(sensorData,"Sensor");
        }else {
            ram=getDefaultRam();
            sensor=getDefaultSensor();
            size=getDefaultStorage();
            color=getDefaultColor();
        }
        data="This Specification \nRam is "+ram+" \nColor is "+color+" \nStorage size is "+size+ " \nSensor is "+sensor;

        return data;
    }


    public String getInfo(List<String> data,String tempData){
        String info;
        Scanner sc=new Scanner(System.in);

        for (String sensorType:data){
            System.out.println(sensorType+" "+tempData);
        }
        info = sc.nextLine();
        while (!data.contains(info)){
            System.out.println("Please Select Correct Option");
            info = sc.nextLine();
        }


        return info;
    }
}
