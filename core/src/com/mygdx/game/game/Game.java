package com.mygdx.game.game;

/**
 * Created by alejandroquiros on 27/2/18.
 */
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game {
    Ball ball;

    public Game(){
        ball = new Ball();
    }

    public void paint(SpriteBatch batch, float x, float y){
        ball.paint(batch,x,y);
    }
}