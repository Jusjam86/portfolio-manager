package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    // variables
    private String name;
    private String owner;
    private List<Valuable> assets;

    // constructor
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets =  new ArrayList<>();
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    // return net total of all assets
    public double getValue(){
        double netValue = 0;
        for (Valuable asset : assets){
            netValue += asset.getValue();
        }
        return netValue;
    }

    // return asset with the highest value
    public Valuable getMostValue(){
        double mostValue = 0;
        Valuable most = assets.get(0);
        for (Valuable asset : assets){
            if (asset.getValue() > most.getValue()){
                most = asset;
            }
        }
        return most;
    }

    // returns the asset with the least value
    public Valuable getLeastValue(){
        double leastValue = 0;
        Valuable least = assets.get(0);
        for (Valuable asset : assets){
            if (asset.getValue() < least.getValue()){
                least = asset;
            }
        }
        return least;
    }
}
