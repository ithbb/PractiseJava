package com.p.design.chessgame;

import com.p.design.chessgame.Board;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xguo on 6/5/2016.
 */
public class Player {

    private String name;

    private String color;

    private List<Board.Piece> pieces = new ArrayList<>();

    public void move(Board.Piece piece, int newX, int newY) {
        piece.moveTo(newX, newY);
    }
}
