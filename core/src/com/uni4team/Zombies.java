package com.uni4team;

abstract public class Zombies {
    private int hpPoint;
    private int speed;
    public void setHpPoint(int hpPoint) {
        this.hpPoint = hpPoint;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean hit(int hp) {
        hpPoint -= hp;
        return (hpPoint > 0 ? false : true);
    }
}
