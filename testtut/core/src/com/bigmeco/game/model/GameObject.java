package com.bigmeco.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Polygon;


/**
 * Created by bigi on 19.11.2017.
 */

public abstract class GameObject {

    Polygon bounds;
    Sprite object;
    GameObject(Texture texture, float x, float y, float width, float height){
        bounds = new Polygon(new float[]{0f,0f,width,0f, width, height, 0f,height});
        object = new Sprite(texture);
        object.setSize(width,height);
        bounds.setPosition(x, y);

        bounds.setOrigin(width/2f,height/2f);
        object.setOrigin(width/2f,height/2f);
    }
    public void  draw (SpriteBatch batch){
        object.setPosition(bounds.getX(),bounds.getY());
        object.setRotation(bounds.getRotation());
        object.draw(batch);
    }
}
