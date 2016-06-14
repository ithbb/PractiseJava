package com.p.design.snailmove;

/**
 * Created by xguo on 6/8/2016.
 */
public class Snail {

    private int speedUp;
    private int speedDown;
    private int location;

    public Snail(int speedUp, int speedDown) {
        this.speedUp = speedUp;
        this.speedDown = speedDown;
    }
    public void move() {
        location = location + speedUp;
    }

    public void drop() {
        location = location - speedDown;
    }

    public int getLocation() {
        return location;
    }
}
