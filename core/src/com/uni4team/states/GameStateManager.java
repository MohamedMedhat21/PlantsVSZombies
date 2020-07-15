package com.uni4team.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

public class GameStateManager {
    private Stack<States> states;

    public GameStateManager(){
        states = new Stack<States>();
    }

    public void push(States state){
        this.states.push(state);
    }

    public void pop(){
        this.states.pop().dispose();
    }

    public void set(States state){
        this.states.pop().dispose();
        this.states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}

