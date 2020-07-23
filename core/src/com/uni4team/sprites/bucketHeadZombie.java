package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class bucketHeadZombie extends Zombies {
    public bucketHeadZombie(int hpPoint, int x, int y, float speed) {
        super(hpPoint, x, y, speed);
        zombieAnimation = new Animation(new TextureRegion(zombieTexture2), 15, 8f);
        zombieAttackAnimation = new Animation(new TextureRegion(zombieAttackTexture2), 11, 4f);
        zombieDyingAnimation = new Animation(new TextureRegion(zombieDyingTexture), 10, 8f);
        zombieHeadAnimation = new Animation(new TextureRegion(zombieHeadTexture), 12, 4f);
        arrayOfZombies.add(this);
    }

    @Override
    public void dispose() {
        zombieTexture.dispose();
        //  zombieHead.dispose();
    }
}
