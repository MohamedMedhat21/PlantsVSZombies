package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.graphics.Color;


public class GameOverState extends States {
    private final Label GameOver;
    private final Texture bg;
    BitmapFont playerScoreFont;

    CharSequence playerStr;
    Stage stage;

    public GameOverState(GameStateManager gsm) {
        super(gsm);
        stage = new Stage();
        bg = new Texture("GameOverBackground2.jpg");
        playerScoreFont = new BitmapFont();
        playerStr = String.valueOf(PlayState.playerScore);
        playerScoreFont.getData().setScale(5f, 5f);
        GameOver = new Label(playerStr, new Label.LabelStyle(playerScoreFont, Color.YELLOW));
        GameOver.setPosition(685, 200);
        stage.addActor(GameOver);


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
    }
}
