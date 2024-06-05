package com.pluralsight.finance;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double getValue(){
        return 0;
    }
}
