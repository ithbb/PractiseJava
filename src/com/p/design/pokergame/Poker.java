package com.p.design.pokergame;

/**
 * Created by xguo on 6/14/2016.
 */
public class Poker {

    private Card[] cards = new Card[52];

    public  Poker() {

        for(CardColor color : CardColor.values()) {
            initCards(color);
        }

    }

    private void initCards(CardColor color) {
        for (int i = 0; i < 13; i++) {
            Card card = new Card(color, i);
        }
    }
}
