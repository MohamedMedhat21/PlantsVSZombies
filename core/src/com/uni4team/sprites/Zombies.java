package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.uni4team.states.GameOverState;
import com.uni4team.states.GameStateManager;

abstract public class Zombies {
    private int hpPoint, zombieState = 1;
    private float speed;
    private Vector2 position;
    protected static Texture zombieTexture, zombieTexture2, zombieAttackTexture, zombieAttackTexture2, zombieDyingTexture, zombieHeadTexture;
    protected Animation zombieAnimation, zombieAttackAnimation, zombieDyingAnimation, zombieHeadAnimation;
    public static Array<Zombies> arrayOfZombies;
    public static int deadCnt = 0;
    public static final int hitCost = 1, main5RowPositions[] = {30, 180, 330, 480, 630};


    public Zombies(int hpPoint, int x, int y, float speed) {
        this.hpPoint = hpPoint;
        position = new Vector2(x, y);
        this.speed = speed;
    }

    public static void setTextures() {
        zombieTexture = new Texture("standard zombie sprite sheet.png");
        zombieAttackTexture = new Texture("attackzombie.png");
        zombieDyingTexture = new Texture("dyingzombie.png");
        zombieHeadTexture = new Texture("ZombieHead.png");
        zombieTexture2 = new Texture("Bucketheadzombie.png");
        zombieAttackTexture2 = new Texture("BucketheadZombieAttack.png");
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setPosition(int x, int y) {
        this.position.x = x;
        this.position.y = y;
    }

    public Vector2 getPosition() {
        return position;
    }

    public int getZombieState() {
        return zombieState;
    }

    public void setZombieState(int zombieState) {
        this.zombieState = zombieState;
        //convert();
    }

    public void setHpPoint(int hpPoint) {
        this.hpPoint = hpPoint;
    }


    public boolean hit(int hp) {
        hpPoint -= hp;
        return (hpPoint > 0 ? false : true);
    }

    public static int getHitCost() {
        return hitCost;
    }

    public void update(float dt, GameStateManager gsm) {
        if (this.zombieState == 1) {
            zombieAnimation.update(dt);
        }
        if (this.zombieState == 2) {
            zombieAttackAnimation.update(dt);
        }
        if (this.zombieState == 3) {
            zombieDyingAnimation.update(dt);
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

    public void render(SpriteBatch sb) {
        if (this.zombieState == 1) {
            sb.draw(zombieAnimation.getFrame(), position.x, position.y);
        }
        if (this.zombieState == 2) {
            sb.draw(zombieAttackAnimation.getFrame(), position.x, position.y);
        }
        if (this.zombieState == 3) {
            sb.draw(zombieDyingAnimation.getFrame(), position.x, position.y);
            sb.draw(zombieHeadAnimation.getFrame(), position.x, position.y);
        }
    }
    //abstract protected void convert();
    abstract public void dispose();
}
