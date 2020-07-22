package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.uni4team.states.GameStateManager;
import javafx.util.Pair;

public class Sun {
    private Texture sunForFlower;
    private Texture sunRandom;
    private Pair<Integer, Integer> position;
    private Boolean fromTop;
    private int speed;

    public Sun(int x, int y, Boolean fromTop) {
        sunForFlower = new Texture("sun.png");
        sunRandom = new Texture("sunRandom.png");
        position = new Pair(x, y);
        this.fromTop = fromTop;
    }

    public Texture getTexture() {
        return sunForFlower;
    }

    public Pair<Integer, Integer> getPostion() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position = new Pair<>(x, y);
    }

    public void update(float dt, GameStateManager gsm) {
        if(fromTop == true){
            speed = 4;
            if (position.getValue() < -70)
                this.dispose();
            else
                position = new Pair<Integer, Integer>(position.getKey(), position.getValue() - (int)(speed));
        }
    }

    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    public void render(SpriteBatch sb) {
        if(fromTop == true)
            sb.draw(sunRandom, position.getKey(), position.getValue());
        else
            sb.draw(sunForFlower, position.getKey(), position.getValue());
    }

    public void dispose() {
        sunForFlower.dispose();
        sunRandom.dispose();
    }
}
