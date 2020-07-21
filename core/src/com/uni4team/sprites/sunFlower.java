package com.uni4team.sprites;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import javafx.util.Pair;

public class sunFlower extends plant{
    private Texture sunFlowerGIF;
    private Pair<Integer, Integer> position;
    private boolean hasSun;
    private final int costOfSunFlower;
    private Sun sun;

    public sunFlower(int x , int y){
        sunFlowerGIF = new Texture("SunFlower1Resized.gif");
        position = new Pair(x, y);
        costOfSunFlower = 50;
        hasSun = false;
    }

    public void setPosition(Pair<Integer, Integer> position) {
        this.position = position;
    }

    public int getCostOfSunFlower(){
        return costOfSunFlower;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sunTemp) {
        sun = sunTemp;
    }

    public boolean getHasSun(){
        return hasSun;
    }

    public void setHasSun(boolean temp){
        hasSun = temp;
    }

    public void PeaShoot(int timeToShoot){
    }

    public Texture getSunFlowerGIF(){
        return sunFlowerGIF;
    }

    public void render(SpriteBatch sb) {
        sb.draw(sunFlowerGIF, position.getKey(), position.getValue());
    }

    public Pair<Integer, Integer> getPosition(){
        return position;
    }

    public void dispose(){
        sunFlowerGIF.dispose();
    }
}