package com.bjorn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by bjornjohnson on 1/12/16.
 */
public class ShipTest {
    private Ship newShip;

    @Test
    public void makeNewShipOfLengthTwo() throws Exception {
        newShip = new Ship(2);
        assertEquals(2, newShip.getLength());
    }

    @Test
    public void makeNewShipOfLengthThree() throws Exception {
        newShip = new Ship(3);
        assertEquals(3, newShip.getLength());
    }

    @Test
    public void newShipsHitsShouldBeZero() throws Exception {
        newShip = new Ship(2);
        assertEquals(0, newShip.getHits());
    }

    @Test
    public void shipShouldReturnOneIfHitOnce() throws Exception {
        newShip = new Ship(2);
        newShip.IncrementHits();
        assertEquals(1, newShip.getHits());
    }

    @Test
    public void shipShouldReturnThreeIfHitThreeTimes() throws Exception {
        newShip = new Ship(5);
        newShip.IncrementHits();
        newShip.IncrementHits();
        newShip.IncrementHits();
        assertEquals(3, newShip.getHits());
    }

    @Test
    public void shipIsSunkIfHitsEqualLength() throws Exception {
        newShip = new Ship(2);
        newShip.IncrementHits();
        newShip.IncrementHits();
        assertEquals(true, newShip.isSunk());
    }


}
