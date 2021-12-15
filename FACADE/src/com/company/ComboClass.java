package com.company;

import java.util.*;

public class ComboClass {


    public Map getCombos(){
        Map<String, Double> combos = new HashMap<String, Double>();
        combos.put("PhoneCover",0.0);
        combos.put("TemperedGlass",120.0);
        combos.put("EarPhone",0.0);
        combos.put("ChargingAdapter",140.0);
        combos.put("OTGAdapter",90.0);
        combos.put("WarrantyAdapter",100.0);
        return combos;
    };
    public Map getDefaultCombos(){
        Map<String, Double> combos = new HashMap<String, Double>();
        combos.put("PhoneCover",0.0);
        combos.put("EarPhone",0.0);
        return combos;
    };

    public String getComboDetails(){
        Scanner sc = new Scanner(System.in);
        int extraCharge=0;
        String comboVal,comboData="You Have Selected ",isComboChange;
        Map<String,Double> comboMapData,defaultCombo;
        comboMapData=getCombos();
        defaultCombo=getDefaultCombos();



        System.out.println("Do You Want To Change The Combo Package? Or by default you will get");
        for (Map.Entry<String,Double> entry : defaultCombo.entrySet()){
            System.out.println(entry.getKey());
        }

        System.out.println("Please Enter :-\nYes\nNo");
        isComboChange = sc.nextLine();

        if (isComboChange.toString().toLowerCase(Locale.ROOT).equals("yes")) {
            defaultCombo.clear();
            for (Map.Entry<String,Double> entry : comboMapData.entrySet()){
                System.out.println(entry.getKey() + ", Charge = " + entry.getValue()+"RS");
            }

            for (int i = 0; i < 2; i++) {
                System.out.println("Please Select Combo Name " + (i + 1));
                comboVal = sc.nextLine();
                while(!comboMapData.keySet().contains(comboVal)){
                    System.out.println("Please Use Correct Name "+  comboVal);
                    comboVal = sc.nextLine();
                }
                defaultCombo.put(comboVal,comboMapData.get(comboVal));
            }
        }

        for (Map.Entry<String,Double> combo: defaultCombo.entrySet()){
            comboData+=" "+combo.getKey()+" Charge "+combo.getValue();
            extraCharge+=combo.getValue();
        }
        comboData+=" As Combo Pack\nAnd Extra Charge Will Be "+extraCharge;


        return comboData;
    }
}
