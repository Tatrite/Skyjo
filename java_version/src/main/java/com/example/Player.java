package com.example;

public class Player {
    private int score;
    private String name;
    private boolean lost;
    private Deck deck;
    
    public Player(String name){
        score=0;
        this.name=name;
        this.lost=false;
    }

    public void addPoint(int x){
        this.score+=x;
        if (this.score>=100){
            this.loosing();
        }
    }

    private void loosing(){
        System.out.println(this.name+" à perdue ave un score de : "+this.score);
        this.lost=true;
    }
}
