package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import javafx.util.Pair;

import java.util.*;

public class PlayState extends States{
    private Texture bg;
    private Texture peaShooter;
    private int backyardWidth, backyardHeight;
    private int addNewPea = 0;
    private Map<Pair<Integer, Integer>, Boolean> mp;
    private List<Pair<Integer, Integer>> drawPeaShooter;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        bg = new Texture("backyardResized.jpg");
        peaShooter = new Texture("PeaShooter2.gif");
        backyardWidth = bg.getWidth();
        backyardHeight = bg.getHeight();
        drawPeaShooter = new ArrayList<>();
        mp = new HashMap<>();
        mp.put(new Pair(3, 150), false);
        mp.put(new Pair(3, 250), false);
        mp.put(new Pair(3, 350), false);
        mp.put(new Pair(3, 450), false);
        mp.put(new Pair(3, 550), false);
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
        addNewPea++;
        Gdx.graphics.setWindowedMode(1024, 768);
        sb.begin();
        sb.draw(bg, 0, 0);
        if(addNewPea % 500 == 0){
            int minY = 10000;
            Boolean foundSpace = false;
            Set<Pair<Integer, Integer>> st = mp.keySet();
            for(Pair<Integer, Integer> pr : st){
                if(mp.get(pr) == false){
                    minY = Math.min(pr.getValue(), minY);
                    foundSpace = true;
                }
            }
            if(foundSpace == true){
                mp.remove(new Pair(3, minY));
                mp.put(new Pair(3, minY), true);
                drawPeaShooter.add(new Pair(3, minY));
            }
        }
        for(Pair<Integer, Integer> pr: drawPeaShooter)
            sb.draw(peaShooter, pr.getKey(), pr.getValue());
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
