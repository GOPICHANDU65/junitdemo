package com.neoteric.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElectricBillProcessingTest1 {
  /* @Test
    public void generateElectricityBill(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,100);
        ElectricityService electricityService=mock(ElectricityService.class);
        ElectricityBill bill = new ElectricityBill("23455","chandu","7/g",100,0,new Date());
        when(electricityService.generateElectricityBill(any(Integer.class),any(String.class),any(String.class),any(String.class),
                any(Integer.class),any(Integer.class),any(Date.class))).thenReturn(bill);
        Assertions .assertNotNull(bill);
        Assertions.assertEquals(0,bill.getAmmount());

    }*/
    @Test
    public void generateElectricityBillFor100unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,200);
        ElectricityService electricityService=mock(ElectricityService.class);
        ElectricityBill bill = new ElectricityBill("23455","chandu","7/g",200,100,new Date());
       when(electricityService.generateElectricityBill(any(Integer.class),any(String.class),any(String.class),any(String.class),
               any(Integer.class),any(Integer.class),any(Date.class))).thenReturn(bill);
        Assertions .assertNotNull(bill);
        Assertions.assertEquals(100,bill.getAmmount());
    }
    @Test
    public void generateElectricityBillFor200unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,300);
        ElectricityService electricityService=mock(ElectricityService.class);
        ElectricityBill bill = new ElectricityBill("23455","chandu","7/g",300,400,new Date());
        when(electricityService.generateElectricityBill(any(Integer.class),any(String.class),any(String.class),any(String.class),
                any(Integer.class),any(Integer.class),any(Date.class))).thenReturn(bill);
        Assertions .assertNotNull(bill);
        Assertions.assertEquals(400,bill.getAmmount());
    }
    @Test
    public void generateElectricityBillFor300unit(){
        ElectricityBillProcessing electricityBillProcessing= new ElectricityBillProcessing();
        CustomerElectricity customerElectricity = new CustomerElectricity("1234","chandu","7/G",100,400);
        ElectricityService electricityService=mock(ElectricityService.class);
        ElectricityBill bill = new ElectricityBill("23455","chandu","7/g",300,900,new Date());
        when(electricityService.generateElectricityBill(any(Integer.class),any(String.class),any(String.class),any(String.class),
                any(Integer.class),any(Integer.class),any(Date.class))).thenReturn(bill);
        Assertions .assertNotNull(bill);
        Assertions.assertEquals(900,bill.getAmmount());
    }
}


