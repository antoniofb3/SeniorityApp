package com.antoniofb.senioritycalculator.model;

/**
 * Created by aflores on 6/22/17.
 */

public class Subfactor {
    private String id;
    private String name;
    private int score;

    public Subfactor(String id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId(){return id;}

    public void setId(String id){
        this.id = id;
    }

    public String getName(){return name;}

    public void setName(String name){
        this.name = name;
    }

    public int getScore(){return score;}

    public void setScore(int score){
        this.score = score;
    }
}
