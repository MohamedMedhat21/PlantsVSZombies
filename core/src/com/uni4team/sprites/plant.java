package com.uni4team.sprites;

public abstract class plant {
    private int hpPoints;

    public void setHpPoints(int hpPoints) {
        this.hpPoints = hpPoints;
    }

    public boolean hit(int hp) {
        hpPoints -= hp;
        return (hpPoints > 0 ? false : true);
    }

    public int getHpPoints() {
        return hpPoints;
    }

    public void ifZombieIsEating() {
    }


}
