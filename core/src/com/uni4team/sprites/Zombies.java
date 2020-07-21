package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.uni4team.states.GameOverState;
import com.uni4team.states.GameStateManager;

abstract public class Zombies {
    protected int hpPoint;
    protected float speed;
    protected Vector2 position;
    protected Texture zombieTexture;
    protected Texture zombieHead;
    protected Animation animation,zombieHeadAnimation;
    public static Array<Zombies> arrayOfZombies;
    public static final int main5RowPositions[] = {30, 180, 330, 480, 630};

    public void setZombieHead(Texture zombieHead) {
        this.zombieHead = zombieHead;
    }

    public Zombies(int hpPoint, int x, int y, float speed) {
        this.hpPoint = hpPoint;
        position = new Vector2(x, y);
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }

    public int getHpPoint() {
        return hpPoint;
    }

    public Vector2 getPostion() {
        return position;
    }

    public void setHpPoint(int hpPoint) {
        this.hpPoint = hpPoint;
    }

    public boolean hit(int hp) {
        hpPoint -= hp;
        return (hpPoint > 0 ? false : true);
    }

    public TextureRegion getZombieTexture() {
        return animation.getFrame();
    }
    public TextureRegion getZombieHeadTexture() {
        return zombieHeadAnimation.getFrame();
    }

    public void update(float dt, GameStateManager gsm) {
        animation.update(dt);
       if(this.speed==0){
           zombieHeadAnimation.update(dt);
       }
        if (position.x > 150)
            position.x -= speed;
        else
            gsm.set(new GameOverState(gsm));
    }
    abstract public void convert();
    abstract public void dispose();
}
