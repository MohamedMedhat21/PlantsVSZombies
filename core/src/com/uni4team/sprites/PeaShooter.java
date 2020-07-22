package com.uni4team.sprites;

import com.badlogic.gdx.graphics.Texture;
import javafx.util.Pair;

public class PeaShooter extends plant {

    public PeaShooter(int x, int y) {
        picOfPlant = new Texture("PeaShooter2.gif");
        position = new Pair(x, y);
        costOfPlant = 25;
        this.setHpPoints(1000);
    }

}
