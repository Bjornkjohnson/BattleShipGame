package com.bjorn;

/**
 * Created by bjornjohnson on 1/14/16.
 */
public class Player {
    private Ship[] fleet = new Ship[5];

    public Player(Ship newFleet[]) {
        System.arraycopy( newFleet, 0, fleet, 0, newFleet.length );
    }

    public int getShips() {

        return fleet.length;
    }
}
