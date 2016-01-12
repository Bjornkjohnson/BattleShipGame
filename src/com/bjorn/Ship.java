package com.bjorn;

/**
 * Created by bjornjohnson on 1/12/16.
 */
public class Ship {
    private int length;
    private int hits;
    private boolean sunk;

    public Ship(int initializeLength) {
        length = initializeLength;
        hits = 0;
        sunk = false;
    }

    public int getLength() {
        return length;
    }

    public void IncrementHits() {
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
