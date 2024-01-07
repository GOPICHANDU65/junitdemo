package com.neoteric.junitdemo;

import java.util.Date;

public class ElectricityBillProcessing {
    ElectricityService electricityService;
    public ElectricityBill generateBill(CustomerElectricity bill){
        int unit = bill.getCurrentUnits()-bill.getPreviousUnit();
        ElectricityBill bill1 =electricityService.generateElectricityBill(unit, bill.getCustomerId(), bill.getHouseName(), bill.getFlatNo(), bill.getCurrentUnits(), bill.getPreviousUnit(), new Date());
     return bill1;

    }

    public void setElectricityService(ElectricityService electricityService) {
        this.electricityService = electricityService;
    }
}
