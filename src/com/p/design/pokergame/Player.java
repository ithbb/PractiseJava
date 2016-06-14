package com.p.design.pokergame;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xguo on 6/14/2016.
 */
public class Player {

    private List<Card> cards;

    private String name;

    public Player(String name) {
        this.name = name;
        cards = new LinkedList<Card>();
    }

    public void getCard(Card card) {
        if(cards.size() <= 5) {
            cards.add(card);
        }
    }

    public void sendCard(Card card) {
        if(cards.size() >= 4) {
            cards.remove(card);
        }
    }

    public static class PlayerCardComparator implements Comparator<List<Card>> {

        @Override
        public int compare(List<Card> cardList1, List<Card> cardList2) {

            Collections.sort(cardList1, new Card.CardComparator());
            Collections.sort(cardList2, new Card.CardComparator());

            int rt = isSequence(cardList1) - isSequence(cardList2);
            if (rt != 0) {
                return rt;
            }

            rt = isTripple(cardList1) - isTripple(cardList2);

            if(rt != 0) {
                return rt;
            }

            rt = isDouble(cardList1) - isDouble(cardList2);

            if(rt != 0) {
                return rt;
            }

            Card.CardComparator comparator = new Card.CardComparator();

            return comparator.compare(cardList1.get(cardList1.size() - 1), cardList2.get(cardList2.size() - 1));
        }
    }


    private static int isSequence(List<Card> cardList) {
        for(int i = 0; i < cardList.size() - 1; i++) {
            if(cardList.get(i).getPoint() + 1 != cardList.get(i+1).getPoint()) {
                return -1;
            }
            return cardList.get(i).getPoint();
        }
        return -1;
    }


    private static int isTripple(List<Card> cardList) {

        if (cardList.size()  < 3) {
            return -1;
        }

        int rt = -1;

        for(int i = 0; i < cardList.size() - 2; i = i + 2) {
            if (cardList.get(i).getPoint() == cardList.get(i + 1).getPoint() ||
                    cardList.get(i).getPoint() == cardList.get(i + 2).getPoint()) {

                rt = cardList.get(i).getPoint();

            }

        }
        return rt;
    }

    private static int isDouble(List<Card> cardList) {

        return -1;
    }

}
