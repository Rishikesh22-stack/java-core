package com.example.model;

public class Battery extends Product {
    private boolean rechargeable;
 
    public boolean isRechargeable() {
        return rechargeable;
    }
 
    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}