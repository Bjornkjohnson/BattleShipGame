package com.bjorn;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by bjornjohnson on 1/11/16.
 */
public class Board {
    private HashMap<Integer, String> boardState;
    public Board() {
        boardState = new HashMap<>();
    }

    public HashMap<Integer, String> getBoardState() {
        return boardState;
    }

    public void placeShip(int startingPoint, String orientation, int shipSize, String shipName) {
        if (boardState.containsKey(startingPoint)) {
            throw new IllegalArgumentException();
        }

        if (Objects.equals(orientation, "horizontal")){
            int endPoint = startingPoint + shipSize;
            for (; startingPoint < endPoint; startingPoint++) {
                boardState.put(startingPoint, shipName );
            }
        }
        if (Objects.equals(orientation, "vertical")){
            int endPoint = startingPoint + 10*shipSize;
            for (; startingPoint < endPoint; startingPoint += 10) {
                boardState.put(startingPoint, shipName );
            }
        }
    }

    public String updateBoardState(int shotCoordinates) {
        String status = "miss";
        if (isHit(shotCoordinates)){
            String shipName = getShipName(shotCoordinates);
            markAsHit(shotCoordinates);
            return shipName;
        }
        markAsMiss(shotCoordinates);
        return status;
    }

    private boolean isHit(int shotCoordinates) {
        return boardState.containsKey(shotCoordinates);
    }

    private void markAsHit(int shotCoordinates) {
        boardState.put(shotCoordinates, "hit");
    }

    private void markAsMiss(int shotCoordinates) {
        boardState.put(shotCoordinates, "miss");
    }

    private String getShipName(int shotCoordinates) {
        return boardState.get(shotCoordinates);
    }
}
