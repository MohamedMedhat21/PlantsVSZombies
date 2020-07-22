package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StandardZombie extends Zombies {
    public StandardZombie(int hpPoint, int x, int y, float speed) {
        super(hpPoint, x, y, speed);
        zombieTexture = new Texture("standard zombie sprite sheet.png");
        animation = new Animation(new TextureRegion(zombieTexture), 15, 8f);
        arrayOfZombies.add(this);
    }

    @Override
    public void convert() {
        if (this.zombieState == 1) {
            zombieTexture = new Texture("standard zombie sprite sheet.png");
            animation = new Animation(new TextureRegion(zombieTexture), 15, 8f);
        } else if (this.zombieState == 2) {
            attackZombieTexture = new Texture("attackzombie.png");
            animation = new Animation(new TextureRegion(attackZombieTexture), 15, 8f);
        } else {
            zombieTexture = new Texture("dyingzombie.png");
            animation = new Animation(new TextureRegion(zombieTexture), 10, 8f);
            zombieHead = new Texture("ZombieHead.png");
            zombieHeadAnimation = new Animation(new TextureRegion(zombieHead), 12, 4f);
        }
    }

    @Override
    public void dispose() {
        zombieTexture.dispose();
        //  zombieHead.dispose();
    }
}
