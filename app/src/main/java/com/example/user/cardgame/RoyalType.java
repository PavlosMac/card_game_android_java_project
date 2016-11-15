package com.example.user.cardgame;

/**
 * Created by user on 15/11/2016.
 */

public enum RoyalType{
    ACE (11),
    KING (10),
    QUEEN (10),
    JACK (10);

    private final int value;


    RoyalType(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}