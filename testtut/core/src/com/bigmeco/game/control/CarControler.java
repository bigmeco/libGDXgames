package com.bigmeco.game.control;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import com.bigmeco.game.model.GameObject;
import com.bigmeco.game.view.GameScreen;

/**
 * Created by bigi on 19.11.2017.
 */

public class CarControler {
    private Polygon carBounds;
    public CarControler(Polygon carBounds){
        this.carBounds = carBounds;
    }
    float speed,velocity= 0.2f ;
    public  void handle(){
        if (Gdx.input.isKeyPressed(Input.Keys.UP)){
            speed+= velocity;
        } else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            speed-= velocity;
        }
        carBounds.rotate(-2f);
carBounds.setPosition(carBounds.getX()+ MathUtils.cos(carBounds.getRotation()+90)*speed*GameScreen.deltaCff,
                    carBounds.getY()+ MathUtils.cos(carBounds.getRotation()+90)*speed*GameScreen.deltaCff);
    }
}
