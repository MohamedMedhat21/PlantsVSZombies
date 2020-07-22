package com.uni4team;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.uni4team.states.GameStateManager;
import com.uni4team.states.MenuState;

public class PlantsVSZombiesGame extends ApplicationAdapter {
    public static final int WIDTH = 1024, HEIGHT = 768;
    private GameStateManager gsm;
    private SpriteBatch batch;
    private Music music;

    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(WIDTH, HEIGHT);
        batch = new SpriteBatch();
        gsm = new GameStateManager();
        music = Gdx.audio.newMusic(Gdx.files.internal("MenuSound.wav"));
        music.setLooping(true);
        music.setVolume(0.1f);
        music.play();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        gsm.push(new MenuState(gsm));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
    }

    @Override
    public void dispose() {
        batch.dispose();
        music.dispose();
    }

    @Override
    public void resize(int width, int height) {
    }
}
