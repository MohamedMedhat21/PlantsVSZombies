package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.uni4team.states.GameOverState;
import com.uni4team.states.GameStateManager;
import com.uni4team.states.PlayState;


abstract public class Zombies {
    protected int hpPoint;
    protected float speed;
    protected Vector2 position;
    protected Texture zombieTexture;
    protected Animation animation;
    public static Array<Zombies> arrayOfZombies;

    public Zombies(int hpPoint, int x, int y, float speed) {
        this.hpPoint = hpPoint;
        position = new Vector2(x, y);
        this.speed = speed;
    }

    public Vector2 getPostion() {
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

    public void update(float dt, GameStateManager gsm) {
        animation.update(dt);
        if (position.x > 150)
            position.x -= speed;
        else
            gsm.set(new GameOverState(gsm));
    }

    abstract public void dispose();
}
