package com.mygdx.game.game;

/**
 * Created by alejandroquiros on 27/2/18.
 */
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ball {
    Texture image;

    public Ball(){
        image= new Texture("ball.png");
    }

    // Le decimos que pinte lo que requiere el SpriteBatch en la clase principal
    public void paint(SpriteBatch batch, float x, float y){
        batch.draw(image,x,y);
    }
}
