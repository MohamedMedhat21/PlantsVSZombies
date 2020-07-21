package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Lawnmowers {
    private Texture lawnmowerGIF;
    private Vector2 position;
    int velocity;
    public Lawnmowers(int x, int y) {
        position = new Vector2(x, y);
        lawnmowerGIF = new Texture("PeaShooter2.gif");
        velocity = 0;
    }
    public Texture getLawnmowerGIF() {
        return lawnmowerGIF;
    }
    public Vector2 getPosition() {
        return position;
    }
    public void setPosition(Vector2 position) {
        this.position = position;
    }
    public int getVelocity() {
        return velocity;
    }
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    public void render(SpriteBatch sb) {
        sb.draw(lawnmowerGIF, position.x, position.y);
    }
    public void dispose() {
        lawnmowerGIF.dispose();
    }
    public void update(float dt) {

    }
}
