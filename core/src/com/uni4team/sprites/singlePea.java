package com.uni4team.sprites;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.uni4team.states.GameStateManager;
import javafx.util.Pair;


public class singlePea {
    private float speed;
    private Pair<Integer, Integer> position;
    private Texture peaTexture;
    private PeaShooter peaShooterOfPea;
    private static final int hitCost=600;
    public static int getHitCost() {
        return hitCost;
    }

    public singlePea(int x, int y, float speed, PeaShooter shooter) {
        peaTexture = new Texture("SinglePea.png");
        position = new Pair(x, y);
        this.peaShooterOfPea = shooter;
        this.speed = speed;
    }

    public Texture getTexture()
    {
        return peaTexture;
    }

    public void setPosition(int x,int y) {
        this.position = new Pair(x, y);
    }

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void update(float dt, GameStateManager gsm) {
        if(position.getKey() >= Gdx.graphics.getWidth())
            position = new Pair<>(peaShooterOfPea.getPosition().getKey()  + (peaShooterOfPea.getPeaShooterGIF().getWidth() + 20)  / 2 , peaShooterOfPea.getPosition().getValue() + (peaShooterOfPea.getPeaShooterGIF().getHeight() + 20) / 2);
        else
            position = new Pair<Integer, Integer>(position.getKey() + (int)(speed), position.getValue());
    }

    public void dispose(){
        peaTexture.dispose();
    }
}
