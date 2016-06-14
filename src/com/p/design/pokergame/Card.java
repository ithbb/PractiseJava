package com.p.design.pokergame;

import java.util.Comparator;

/**
 * Created by xguo on 6/14/2016.
 */
public class Card {



    private CardColor color;



    private int point;

    public Card(CardColor color, int point) {
        this.color = color;
        this.point = point;
    }

    public CardColor getColor() {
        return color;
    }

    public int getPoint() {
        return point;
    }

    public static class CardComparator implements Comparator<Card> {

        @Override
        public int compare(Card c1, Card c2) {

            if (c1.point > c2.point) {
                return 1;
            } else if (c1.point < c2.point) {
                return -1;
            } else {
                if (c1.color.ordinal() > c2.color.ordinal()) {
                    return 1;
                } else if (c1.color.ordinal() < c2.color.ordinal()) {
                    return -1;
                }
            }
            return 0;
        }
    }

}
