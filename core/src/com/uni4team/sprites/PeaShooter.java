package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import javafx.util.Pair;


public class PeaShooter extends plant {
    private Texture peaShooterGIF;
    private Pair<Integer ,Integer> position;
    private final int costOfPeaShooter;
    public PeaShooter(int x , int y){
        peaShooterGIF = new Texture("PeaShooter2.gif");
        position = new Pair(x, y);
        costOfPeaShooter = 25;
    }

    public Texture getPeaShooterGIF() {
        return peaShooterGIF;
    }

    public void setPeaShooterGIF(Texture peaShooterGIF) {
        this.peaShooterGIF = peaShooterGIF;
    }

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public void setPosition(Pair<Integer, Integer> position) {
        this.position = position;
    }

    public int getCostOfPeaShooter() {
        return costOfPeaShooter;
    }

    public void PeaShoot(int timeToShoot){
    }

    public void render(SpriteBatch sb) {
        sb.draw(peaShooterGIF, position.getKey(), position.getValue());
    }
    public void dispose(){
        peaShooterGIF.dispose();
    }
}
