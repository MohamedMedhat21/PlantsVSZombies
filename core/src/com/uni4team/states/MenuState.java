package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.uni4team.PlantsVSZombiesGame;

public class MenuState extends States {
    private Texture background;
    private int backgroundWidth, backgroundHeight;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("Background.png");
        backgroundWidth = background.getWidth();
        backgroundHeight = background.getHeight();
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.graphics.setWindowedMode(1024, 768);
        sb.begin();
        sb.draw(background, 0, 0);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        System.out.println("Menu state disposed");
    }
}
