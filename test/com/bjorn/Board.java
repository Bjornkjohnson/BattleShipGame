package com.bjorn;

import java.util.HashMap;

/**
 * Created by bjornjohnson on 1/11/16.
 */
public class Board {
    private HashMap<String, String> boardState;
    public Board() {
        boardState = new HashMap<String, String>();
    }

    public HashMap<String, String> getBoardState() {
        return boardState;
    }

    public void placeShip(String startingPoint, String orientation, int shipSize) {
        boardState.put("a1", "shipOne" );
        boardState.put("a2", "shipOne" );
    }
}
