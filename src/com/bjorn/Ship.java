package com.bjorn;

/**
 * Created by bjornjohnson on 1/12/16.
 */
public class Ship {
    private int length;
    private int hits;
    private boolean sunk;
    private int position;
    private int orientationIterator;

    public Ship(int initializeLength, int startingCoordinate, int orientation) {
        length = initializeLength;
        hits = 0;
        sunk = false;
        position = startingCoordinate;
        setOrientationIterator(orientation);
    }

    private void setOrientationIterator(int orientation) {
        if (orientation == 0) {
            orientationIterator = 1;
        } else  {
            orientationIterator = 10;
        }
    }

    public int getLength() {
        return length;
    }


    public boolean checkHit(int coordinate) {
        for (int i = position; i < length; i += orientationIterator) {
            if (i == coordinate){
                incrementHits();
                return true;
            }
        }
        return false;
    }

    private void incrementHits() {
        hits++;
        if (hits == length) {
            sunk = true;
        }
    }

    public int getHits() {
        return hits;
    }

    public boolean isSunk() {
        return sunk;
    }

}
