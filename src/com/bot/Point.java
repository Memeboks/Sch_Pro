package com.bot;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nurgalievtr.18 on 10.04.2017.
 */
public class Point extends JPanel {
    int x;
    int y;
    int color = 0;

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void paint(Graphics g){
        if (color == 0)
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.RED);
        g.fillRect(0,0,3,3);
        g.setColor(Color.BLACK);
    }
}
