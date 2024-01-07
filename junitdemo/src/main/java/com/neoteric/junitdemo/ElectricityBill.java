package com.neoteric.junitdemo;

import java.util.Date;

public class ElectricityBill {
    private  String customerId;
    private String houseName;
    private String flatNo;
    private int currentUnits;
    private int ammount;
    private Date month;

    public ElectricityBill(String customerId, String houseName, String flatNo, int currentUnits, int ammount, Date month) {
        this.customerId = customerId;
        this.houseName = houseName;
        this.flatNo = flatNo;
        this.currentUnits = currentUnits;
        this.ammount = ammount;
        this.month = month;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public int getCurrentUnits() {
        return currentUnits;
    }

    public int getAmmount() {
        return ammount;
    }

    public Date getMonth() {
        return month;
    }
}
