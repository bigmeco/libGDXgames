package com.bigmeco.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bigmeco.game.control.CarControler;

/**
 * Created by bigi on 19.11.2017.
 */

public class Car extends GameObject {
    private CarControler carControler;
    public Car(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
        carControler = new CarControler(bounds);
    }

    @Override
    public void draw(SpriteBatch batch) {
        super.draw(batch);
        carControler.handle();
    }
}
