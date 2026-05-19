package com.pluralsight.finance;

public class FixedAsset implements Valuable{

    // variables
    private String name;
    private double marketValue;

    // constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    // getters & setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getMarketValue() {return marketValue;}
    public void setMarketValue(double marketValue) {this.marketValue = marketValue;}

    // methods
    @Override
    public double getValue() {return marketValue;}
}
