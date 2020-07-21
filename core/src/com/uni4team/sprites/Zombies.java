package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.uni4team.states.GameOverState;
import com.uni4team.states.GameStateManager;

abstract public class Zombies {
    protected int hpPoint;
    protected float speed;
    protected int zombieState=1;
    boolean finished=false;
    protected Vector2 position;
    protected Texture zombieTexture,attackZombieTexture;
    protected Texture zombieHead;
    protected Animation animation,zombieHeadAnimation,attackZombie;
    public static Array<Zombies> arrayOfZombies;
    public static int distanceBetweenZombies = 500, deadCnt = 0;
    public static final int main5RowPositions[] = {30, 180, 330, 480, 630};
    public static final int hitCost=1;

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

    public Vector2 getPosition() {
        return position;
    }

    public int getZombieState() {
        return zombieState;
    }

    public void setZombieState(int zombieState) {
        this.zombieState = zombieState;
        convert();
    }

    public void setHpPoint(int hpPoint) {
        this.hpPoint = hpPoint;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean hit(int hp) {
        hpPoint -= hp;
        return (hpPoint > 0 ? false : true);
    }

    public static int getHitCost() {
        return hitCost;
    }

    public TextureRegion getZombieTexture() {
        return animation.getFrame();
    }
    public TextureRegion getZombieHeadTexture() {
        return zombieHeadAnimation.getFrame();
    }

    public void update(float dt, GameStateManager gsm) {
        animation.update(dt);
       if(this.zombieState==3){
           zombieHeadAnimation.update(dt);
       }
        if (position.x > 150)
            position.x -= speed;
        else
            gsm.set(new GameOverState(gsm));
    }

    public Animation getZombieHeadAnimation() {
        return zombieHeadAnimation;
    }
    public void render(SpriteBatch sb){
        if(this.zombieState==3){
            sb.draw(zombieHeadAnimation.getFrame(),position.x,position.y);
        }
            sb.draw(animation.getFrame(),position.x,position.y);
    }
    abstract public void convert();
    abstract public void dispose();
}
