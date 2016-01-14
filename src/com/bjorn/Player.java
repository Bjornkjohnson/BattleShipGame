package com.bjorn;

/**
 * Created by bjornjohnson on 1/14/16.
 */
public class Player {
    private Ship[] fleet = new Ship[5];
    private Board board;

    public Player(Ship newFleet[], Board newBoard) {
        System.arraycopy( newFleet, 0, fleet, 0, newFleet.length );
        board = newBoard;
    }

    public int getFleet() {
        return fleet.length;
    }

    public Board getBoard() {
        return board;
    }
}
