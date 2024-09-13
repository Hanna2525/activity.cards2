package com.example.cards;

public interface Deck {
    void shuffle();
    void cut(int index);
    Card deal();
    Card turnover();
    int search(Card card);
    void newOrder (Deck Cards);
    int size();












}
