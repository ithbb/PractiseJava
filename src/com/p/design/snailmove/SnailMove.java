package com.p.design.snailmove;

/**
 * Created by xguo on 6/8/2016.
 */
public class SnailMove {

    private int days = 0;

    private Well well;

    private Snail snail;

    public boolean isSnailOut() {
        if (snail.getLocation() >= well.getWellHight()) {
            return true;
        } else {
            return false;
        }

    }

    public SnailMove() {
        well = new Well(10);
        snail = new Snail(3, 2);
    }

    public int getDaysToUp() {
        while(isSnailOut() == false) {
            days++;
            snail.move();
            if(isSnailOut() == false) {
                snail.drop();
            }
        }
        return days;
    }
}
