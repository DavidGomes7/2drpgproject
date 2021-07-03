package com.rpgproject.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RpgProjectGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
        Texture background;
        Texture player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
                background = new Texture("background.jpg");
                player = new Texture("Zayn.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 1, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
                batch.draw(background, 0, 0, 640, 480);
                batch.draw(player, 100, 100, 64, 64);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		player.dispose();
	}
}
