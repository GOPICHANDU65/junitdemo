package com.neoteric.junitdemo;

import java.util.Date;

public class ElectricityService {

    public ElectricityBill generateElectricityBill(int unit,String customerId, String houseName, String flatNo, int currentUnits, int ammount, Date month){
     System.out.println("  from ElectricityService generatebill");
        int currentUnit=0;
        if (unit ==100){
            currentUnit = unit*1;
        }
        if (unit==200){
            currentUnit = unit*2;
        }
        if (unit==300){
            currentUnit = unit*3;
        }
        ElectricityBill bill=new ElectricityBill(customerId,houseName,flatNo,currentUnits,ammount,new Date());
        return bill;

    }
}
