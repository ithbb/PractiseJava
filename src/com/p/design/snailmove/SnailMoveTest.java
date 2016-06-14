package com.p.design.snailmove;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xguo on 6/8/2016.
 */
public class SnailMoveTest {
    @Test
    public void isSnailOut() throws Exception {

    }

    @Test
    public void getDaysToUp() throws Exception {
        SnailMove game = new SnailMove();
        int days = game.getDaysToUp();
        System.out.println(days);
    }

}