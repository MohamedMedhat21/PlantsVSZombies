package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class PlayState extends States{
    private Texture bg;
    private int backyardWidth, backyardHeight;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        bg = new Texture("backyardResized.jpg");
        backyardWidth = bg.getWidth();
        backyardHeight = bg.getHeight();
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new GameOverState(gsm));
        }
    }

    //TODO: check if zombie entered the house, call GameOverState
    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.graphics.setWindowedMode(1024, 768);
        sb.begin();
        sb.draw(bg, 0, 0);
        sb.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        System.out.println("Play state dispose");
    }

    private void updateGround() {
    }
}
