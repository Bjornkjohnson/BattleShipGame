package com.bjorn;

import java.util.HashMap;

/**
 * Created by bjornjohnson on 1/11/16.
 */
public class Board {
    private HashMap<Integer, String> boardState;
    public Board() {
        boardState = new HashMap<Integer, String>();
    }

    public HashMap<Integer, String> getBoardState() {
        return boardState;
    }

    public void placeShip(int startingPoint, String orientation, int shipSize, String shipName) {
        int endPoint = startingPoint + shipSize;
        if (orientation == "horizontal"){
            for (; startingPoint < endPoint; startingPoint++) {
                boardState.put(startingPoint, shipName );
            }
        } else {

        }
    }
}
