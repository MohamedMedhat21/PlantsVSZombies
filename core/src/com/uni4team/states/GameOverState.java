package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.graphics.Color;

import java.awt.*;


public class GameOverState extends States {
    private Label GameOver;
    private Label score;
    private Label scoreINT;
    private Texture bg;
    Stage stage = new Stage();

    public GameOverState(GameStateManager gsm) {
        super(gsm);
        stage = new Stage();
        bg = new Texture("GameOverBackground2.jpg");

        //GameOver = new Label("Game Over", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        //GameOver.setPosition(1024/2,768/2);
        //stage.addActor(GameOver);

        score = new Label("SCORE", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        //TODO : add score class here
        scoreINT = new Label("SCORE", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
    }

    @Override
    protected void handleInput() {
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        stage.act(Gdx.graphics.getDeltaTime());
        stage.getBatch().begin();
        stage.getBatch().draw(bg, 0, 0);
        stage.getBatch().end();
        stage.draw();
        sb.end();
    }

    @Override
    public void dispose() {
        bg.dispose();
        stage.dispose();
        System.out.println("Game Over dispose");
    }
}
