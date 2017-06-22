package com.antoniofb.senioritycalculator.model;

/**
 * Created by aflores on 6/22/17.
 */

public class Factor {
    private String id;
    private String name;
    private int percentage;

    public Factor(String id, String name, int percentage){
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public String getId(){return id;}

    public void setId(String id){
        this.id = id;
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

    public int getPercentage(){return percentage;}

    public void setPercentage(int percentage){
        this.percentage = percentage;
    }
}
