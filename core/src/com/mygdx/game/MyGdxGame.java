package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.game.Game;

// Este es el codigo que hara que el juego funcione, el cual cuando hara que se creen los objetos, y se eliminen con el dispose.

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int x=0;
	int y=0;
	Game game;

	int I_ESTADO_MENU=1;
	int iEstadoJuego=0;

	// Elementos que vamos a utilizar
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game();
	}

	// Bucle donde se pintan los elementos
	@Override
	public void render () {

		// Métodos de limpiado de la pantalla
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// Pintado y su preparación a través de Batch
		batch.begin();
		// Coordenadas Acceleration
		float accelX = Gdx.input.getAccelerometerX();
		float accelY = Gdx.input.getAccelerometerY();
		Gdx.app.log("GameMain", "--> "+accelY);
		game.paint(batch,x,y);
		batch.end();
		// Sensores
		if(accelY>0){
			x++;
			x++;
			x++;
			x++;
		}
		if(accelY<0) {
			x--;
			x--;
			x--;
			x--;
		}
		if(accelX>0){
			y--;
			y--;
			y--;
			y--;
		}
		if(accelX<0){
			y++;
			y++;
			y++;
			y++;
		}
	}

	// Método dispose que cierra y destruye los elementos
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
