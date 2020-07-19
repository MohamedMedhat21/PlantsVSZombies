package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class StandardZombie extends Zombies {
    public StandardZombie(int hpPoint,int x,int y,int speed) {
        super(hpPoint, x,y,speed);
        zombieTexture=new Texture("testzombie.png");
        animation=new Animation(new TextureRegion(zombieTexture),6,1f);
        arrayOfZombies.add(this);
    }



    @Override
    public void dispose() {
        zombieTexture.dispose();
    }
}
