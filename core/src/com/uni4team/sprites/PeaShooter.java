package com.uni4team.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import javafx.util.Pair;

import java.util.Set;

public class PeaShooter extends plant {
    public Texture peaShooterGIF;
    //public Rectangle bounds;
    public Pair<Integer ,Integer> position;

    public PeaShooter(int x , int y){
        peaShooterGIF = new Texture("PeaShooter2.gif");
        position = new Pair(x, y);
//        bounds = new Rectangle();
//        bounds.setPosition(x - (peaShooterGIF.getWidth()/2), y - (peaShooterGIF.getHeight()/ 2));
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
