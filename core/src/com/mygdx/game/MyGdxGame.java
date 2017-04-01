package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class MyGdxGame extends Game {
	OrthographicCamera camera;
	SpriteBatch batch;
	Texture img;
	Rectangle rectangle;
	float x;
	float g;
	@Override
	public void create () {
		setScreen(new Menu());

////		camera = new OrthographicCamera();
////		camera.setToOrtho(false,1280,720);
//		batch = new SpriteBatch();
////		rectangle = new Rectangle();
////		rectangle.x = 1280/2;
////		rectangle.y = 720/2;
////		rectangle.width= 128;
////		rectangle.height= 128;
//
//		img = new Texture("badlogic.jpg");
	}



//
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(0, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		x += Gdx.graphics.getDeltaTime();
//
////		camera.update();
////		batch.setTransformMatrix(camera.combined);
//		batch.begin();
//
//		batch.draw(img,x*20, x*10);
//		batch.end();
//	}
//
//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
//
//	@Override
//	public void resize(int width, int height) {
//		super.resize(1280, 720);
//		System.out.println(width+"   "+height);
//
//	}
//
//	@Override
//	public void pause() {
//		super.pause();
//	}
//
//	@Override
//	public void resume() {
//		super.resume();
//	}
}
