package com.bot;

public class TheA {
    int length;
    int  points_x [] = new int[length];
    int  points_y [] = new int[length];

    void setPoints_y(int [] points_y,int length) {
        for (int i = 0; i < length; i++) {
            this.points_y[i] = points_y[i];
        }
    }
    void setPoints_x(int [] points_x,int length) {
        for (int i = 0; i < length; i++) {
            this.points_x[i] = points_x[i];
        }
    }

    int [] getPoints_x() {
            return points_x;
    }

    int[] getPoints_y() {
            return points_y;
        }

    TheA (int length, int  points_x [], int  points_y []) {
        this.length = length;
        this.points_x = points_x;
        this.points_y = points_y;
    }
}
