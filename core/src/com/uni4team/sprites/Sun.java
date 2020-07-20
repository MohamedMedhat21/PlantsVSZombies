package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.uni4team.states.GameStateManager;
import javafx.util.Pair;

public class Sun {
    private Texture sunGIF;
    private Pair<Integer, Integer> position;

    public Sun(int x, int y) {
        sunGIF = new Texture("sun.png");
        position = new Pair(x, y);
    }

    public Texture getTexture()
    {
        return sunGIF;
    }

    public Pair<Integer, Integer> getPostion() {
        return position;
    }

    public void update(float dt, GameStateManager gsm) {
    }

    public Pair<Integer, Integer> getPosition(){
        return position;
    }

    public void render(SpriteBatch sb, int x, int y) {
        sb.draw(sunGIF, x, y);
    }

    public void dispose(){
        sunGIF.dispose();
    }
}
