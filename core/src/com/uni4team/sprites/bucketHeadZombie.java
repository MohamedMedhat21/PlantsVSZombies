package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class bucketHeadZombie extends Zombies {
    public bucketHeadZombie(int hpPoint,int x,int y,float speed) {
        super(hpPoint, x,y,speed);
        zombieTexture=new Texture("Bucketheadzombie.png");
        animation=new Animation(new TextureRegion(zombieTexture),15,8f);
        arrayOfZombies.add(this);
    }

    @Override
    public void convert() {
        if (this.zombieState == 1) {
            zombieTexture=new Texture("Bucketheadzombie.png");
            animation=new Animation(new TextureRegion(zombieTexture),15,8f);
        }
        else if(this.zombieState==2){
            attackZombieTexture=new Texture("BucketheadZombieAttack.png");
            animation=new Animation(new TextureRegion(attackZombieTexture),11,4f);
        }
        else {
            zombieTexture=new Texture("dyingzombie.png");
            animation=new Animation(new TextureRegion(zombieTexture),10,8f);
            zombieHead=new Texture("ZombieHead.png");
            zombieHeadAnimation=new Animation(new TextureRegion(zombieHead),12,4f);
        }
    }
    @Override
    public void dispose() {
        zombieTexture.dispose();
        zombieHead.dispose();
    }
}
