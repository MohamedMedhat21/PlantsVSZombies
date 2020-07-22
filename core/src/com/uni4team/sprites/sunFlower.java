package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import javafx.util.Pair;

public class sunFlower extends plant {
    private boolean hasSun;
    private Sun sun;

    public sunFlower(int x, int y) {
        picOfPlant = new Texture("SunFlower1Resized.gif");
        position = new Pair(x, y);
        costOfPlant = 50;
        this.setHpPoints(1000);
        hasSun = false;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sunTemp) {
        sun = sunTemp;
    }

    public boolean getHasSun() {
        return hasSun;
    }

    public void setHasSun(boolean temp) {
        hasSun = temp;
    }

    public void PeaShoot(int timeToShoot) {
    }

}