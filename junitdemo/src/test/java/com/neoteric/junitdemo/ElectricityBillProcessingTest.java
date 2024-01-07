package com.neoteric.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElectricityBillProcessingTest {
    @Test
    public void generateElectricityBill(){
    ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
    CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,200);
    ElectricityBill electricityBill = electricityBillProcessing.generateBill(customerElectricity);
        Assertions .assertNotNull(electricityBill);
    }
    @Test
    public void generateElectricityBillFor100unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,200);
        ElectricityBill electricityBill = electricityBillProcessing.generateBill(customerElectricity);
        Assertions .assertNotNull(electricityBill);
        Assertions.assertEquals(100,electricityBill.getAmmount());
    }
    @Test
    public void generateElectricityBillFor200unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,300);
        ElectricityBill electricityBill = electricityBillProcessing.generateBill(customerElectricity);
        Assertions .assertNotNull(electricityBill);
        Assertions.assertEquals(400,electricityBill.getAmmount());
    }
    @Test
    public void generateElectricityBillFor300unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,400);
        ElectricityBill electricityBill = electricityBillProcessing.generateBill(customerElectricity);
        Assertions .assertNotNull(electricityBill);
        Assertions.assertEquals(900,electricityBill.getAmmount());
    }
}
