package com.p.design.chessgame;

import java.util.ArrayList;

/**
 * Created by xguo on 6/5/2016.
 */
public class Board {

    private Spot[][] spots = new Spot[8][8];

    public void initBoard() {

    }

    class Spot {
        int x;
        int y;
        private Piece piece;

        public void occupySpot(Piece piece) {
            this.piece = piece;
        }

        public boolean isOccupied() {
            if (piece == null) {
                return false;
            }
            return true;
        }
    }

    class Piece {
        private String name;
        private String color;

        private boolean isAvailable = true;

        private int locX;
        private int locY;

        public void moveTo(int x, int y) {
            locX = x;
            locY = y;
        }
    }
}
