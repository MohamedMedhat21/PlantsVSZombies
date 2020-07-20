package com.uni4team.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.uni4team.PlantsVSZombiesGame;
import com.uni4team.sprites.PeaShooter;
import com.uni4team.sprites.StandardZombie;
import com.uni4team.sprites.Zombies;
import javafx.util.Pair;

import java.util.*;


public class PlayState extends States {
    private Texture bg;
    private int backgroundWidth, backgroundHeight;
    private int gardenWidth, gardenHeight;
    private Rectangle rectangle;
    private ShapeRenderer shape;
    private PeaShooter peaShooter;
    private Map<Pair<Integer, Integer>, Boolean> positions;
    private int posx, posy;
    private boolean selectPeashooter;
    private List<PeaShooter> peaOnScreen;
    //------------------------------------------------------
    private StandardZombie standardZombie;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        bg = new Texture("backyardResized.jpg");
        backgroundWidth = bg.getWidth();
        backgroundHeight = bg.getHeight();
        gardenWidth = 81;
        gardenHeight = 139;
        selectPeashooter = false;
        peaOnScreen = new ArrayList<>();
        rectangle = new Rectangle();
        shape = new ShapeRenderer();
        rectangle.setHeight(gardenHeight);
        rectangle.setWidth(gardenWidth);
        rectangle.setPosition(250, 35);
        peaShooter = new PeaShooter(2, 250);
        positions = new HashMap<>();
        Zombies.arrayOfZombies = new Array<Zombies>();
        Random rand=new Random();
        for (int i = 5; i >= 1; i--) {
            Zombies.arrayOfZombies.add(new StandardZombie(1200, 1000+i*rand.nextInt(200), 150*i-120, 0.2f));
        }
        for (int w = (int) (rectangle.getX()); w < backgroundWidth - 5; w += rectangle.width) {
            for (int h = (int) (rectangle.getY()); h < backgroundHeight; h += rectangle.height) {
                positions.put(new Pair(w, h), true);
            }
        }

    }


    @Override
    public void handleInput() {

    }

    //TODO: check if zombie entered the house, call GameOverState
    @Override
    public void update(float dt) {
        handleInput();
        for (Zombies zombie : Zombies.arrayOfZombies) {
            zombie.update(dt,gsm);
        }
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(bg, 0, 0);
        for (Zombies zombie : Zombies.arrayOfZombies) {
            sb.draw(zombie.getZombieTexture(), zombie.getPostion().x, zombie.getPostion().y);
        }
        peaShooter.render(sb);

        for (int i = 0; i < peaOnScreen.size(); i++) {
            peaOnScreen.get(i).render(sb);
        }
        sb.end();

        if (Gdx.input.justTouched()) {
            posx = Gdx.input.getX();
            posy = Gdx.input.getY();
            System.out.printf("%d , %d\n", posx, posy);
            if (posx >= peaShooter.position.getKey() && posx <= peaShooter.position.getKey() - peaShooter.peaShooterGIF.getWidth() && posy >= peaShooter.position.getValue() && posy <= -1 * peaShooter.peaShooterGIF.getHeight() + peaShooter.position.getValue()) {
                System.out.println("yes");
                selectPeashooter = true;
            } else if (selectPeashooter) {
                selectPeashooter = false;
                Set<Pair<Integer, Integer>> st = positions.keySet();
                for (Pair<Integer, Integer> pr : st) {
                    if (positions.get(pr) == true && posx >= pr.getKey() && posx <= pr.getKey() + gardenWidth && posy >= pr.getValue() && posy <= gardenHeight + pr.getValue()) {
                        PeaShooter pea = new PeaShooter(pr.getKey(), pr.getValue());
                        peaOnScreen.add(pea);
                        positions.remove(pr);
                        positions.put(pr, false);
                        break;
                    }
                }
            }
        }

        if (selectPeashooter) {
            System.out.println("hello");
            shape.begin(ShapeRenderer.ShapeType.Line);
            shape.rect(peaShooter.position.getKey(), peaShooter.position.getValue(), peaShooter.peaShooterGIF.getWidth(), peaShooter.peaShooterGIF.getHeight());
            shape.setColor(Color.BLUE);
            shape.end();
        }

//        shape.begin(ShapeRenderer.ShapeType.Line);
//        shape.rect(rectangle.getX(), rectangle.getY(), rectangle.width, rectangle.height);
//        shape.setColor(Color.PURPLE);
//        shape.end();

    }

    @Override
    public void dispose() {
        shape.dispose();
        peaShooter.dispose();
        bg.dispose();
        System.out.println("Play state dispose");
    }

//    private void updateGround() {
//    }
//    int posX, posY;
//    @Override
//    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//        //posX = screenX - backgroundWidth/2;
//        //posY = Gdx.graphics.getHeight() - screenY - backgroundHeight/2;
//        posX = Gdx.graphics.getWidth()/2 - backgroundWidth/2;
//        posY = Gdx.graphics.getHeight()/2 - backgroundHeight/2;
//        return false;
//    }
}
