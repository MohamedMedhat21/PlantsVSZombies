package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class StandardZombie extends Zombies {
    public StandardZombie(int hpPoint,int x,int y,float speed) {
        super(hpPoint, x,y,speed);
        zombieTexture=new Texture("standard zombie sprite sheet.png");
        animation=new Animation(new TextureRegion(zombieTexture),20,8f);
        arrayOfZombies.add(this);
    }



    @Override
    public void dispose() {
        zombieTexture.dispose();
    }
}
