package javaLevel2Lesson1;

import java.awt.*;

public class Background extends Sprite {
private  float time;
private static final float AMPLITUDE = 255f/2f;
private Color color;



    @Override
    public void update(MainCanvas canvas, float deltaTime) {
        time+=deltaTime;
        int red = Math.round( AMPLITUDE+AMPLITUDE* (float) Math.sin(time/2));
        int green= Math.round( AMPLITUDE+AMPLITUDE* (float) Math.sin(time/4));
        int blue = Math.round( AMPLITUDE+AMPLITUDE* (float) Math.sin(time));
        color= new Color(red,green,blue);
    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {

        canvas.setBackground(color);
    }
}
