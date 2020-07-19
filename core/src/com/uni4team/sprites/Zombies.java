package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;


abstract public class Zombies {
    protected int hpPoint, speed;
    protected Vector2 position;
    protected Texture zombieTexture;
    protected Animation animation;
    public static Array<Zombies> arrayOfZombies;

    public Zombies(int hpPoint, int x, int y, int speed) {
        this.hpPoint = hpPoint;
        position = new Vector2(x, y);
        this.speed = speed;
    }
    public Vector2 getPostion(){
        return position;
    }
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

    public TextureRegion getZombieTexture() {
        return animation.getFrame();
    }

    public void update(float dt) {
        animation.update(dt);
        position.x-=speed;
    }
    abstract public void dispose();
}
