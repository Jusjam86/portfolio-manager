package com.pluralsight.finance;

public class Gold extends FixedAsset {

    // variables
    private double weight;

    // constructor
    public Gold(double weight) {
        super("Gold", weight);
        this.weight = weight;
    }

    // getters & setters
    public double getWeight(){return weight;}
    public void setWeight(double weight){this.weight = weight;}

    @Override
    public double getValue(){return weight * getMarketValue();}
}
