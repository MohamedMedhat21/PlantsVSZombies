package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Lawnmowers {
    private final Texture lawnmowerGIF;
    private Vector2 position;
    int speed;

    public Lawnmowers(int x, int y) {
        position = new Vector2(x, y);
        lawnmowerGIF = new Texture("lawnmower.png");
        speed = 0;
    }


    public Vector2 getPosition() {
        return position;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void render(SpriteBatch sb) {
        sb.draw(lawnmowerGIF, position.x, position.y);
    }

    public void dispose() {
        lawnmowerGIF.dispose();
    }

    public void update(float dt) {
        position.x += speed;
        if (position.x > 1000) {
            position.y = 5000;
            dispose();
        }
    }
}
