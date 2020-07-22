package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import javafx.util.Pair;

public abstract class plant {
    private int hpPoints;
    protected Texture picOfPlant;
    protected Pair<Integer, Integer> position;
    protected int costOfPlant;

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

    public Texture getPicOfPlant() {
        return picOfPlant;
    }

    public void setPicOfPlant(Texture picOfPlant) {
        this.picOfPlant = picOfPlant;
    }

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position = new Pair<>(x, y);
    }

    public int getCostOfPlant() {
        return costOfPlant;
    }

    public void setCostOfPlant(int costOfPlant) {
        this.costOfPlant = costOfPlant;
    }

    public void render(SpriteBatch sb) {
        sb.draw(picOfPlant, position.getKey(), position.getValue());
    }

    public void dispose() {
        picOfPlant.dispose();
    }
}
