package com.neoteric.junitdemo;

public class CustomerElectricity {
    private  String customerId;
    private String houseName;
    private String flatNo;
    private int previousUnit;
    private int currentUnits;

    public CustomerElectricity(String customerId, String houseName, String flatNo, int previousUnit, int currentUnits) {
        this.customerId = customerId;
        this.houseName = houseName;
        this.flatNo = flatNo;
        this.previousUnit = previousUnit;
        this.currentUnits = currentUnits;
    }

    @Override
    public String toString() {
        return "CustomerElectricity{" +
                "customerId='" + customerId + '\'' +
                ", houseName='" + houseName + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", previousUnit=" + previousUnit +
                ", currentUnits=" + currentUnits +
                '}';
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

    public int getPreviousUnit() {
        return previousUnit;
    }

    public int getCurrentUnits() {
        return currentUnits;
    }
}
