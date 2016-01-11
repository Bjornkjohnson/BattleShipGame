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

        if (orientation == "horizontal"){
            int endPoint = startingPoint + shipSize;
            for (; startingPoint < endPoint; startingPoint++) {
                boardState.put(startingPoint, shipName );
            }
        }
        if (orientation == "vertical"){
            int endPoint = startingPoint + 10*shipSize;
            for (; startingPoint < endPoint; startingPoint += 10) {
                boardState.put(startingPoint, shipName );
            }
        }
    }
}
