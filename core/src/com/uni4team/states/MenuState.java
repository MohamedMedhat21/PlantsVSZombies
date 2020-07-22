package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends States {
    private final Texture background;
    private int backgroundWidth, backgroundHeight;
    private final int stx, width, sty, height;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("Background.png");
        backgroundWidth = background.getWidth();
        backgroundHeight = background.getHeight();
        stx = 360;
        width = 360 + 300;
        sty = 35;
        height = 35 + 50;
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            int posx = Gdx.input.getX();
            int posy = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (posx >= stx && posx <= width && posy >= sty && posy <= height)
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
