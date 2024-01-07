package com.neoteric.junitdemo;

import java.util.Date;

public class ElectricityBillProcessing {
    public ElectricityBill generateBill(CustomerElectricity customerElectricity){
        int unit = customerElectricity.getCurrentUnits()-customerElectricity.getPreviousUnit();
        int currentUnits=0;
        if (unit ==100){
            currentUnits = unit*1;
        }
        if (unit==200){
            currentUnits = unit*2;
        }
        if (unit==300){
            currentUnits = unit*3;
        }
        ElectricityBill bill = new ElectricityBill(customerElectricity.getCustomerId(),customerElectricity.getHouseName(),customerElectricity.getFlatNo(),customerElectricity.getCurrentUnits(),currentUnits,new Date());
        return bill;
    }
}
