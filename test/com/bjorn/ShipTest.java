package com.bjorn;

import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import static org.junit.Assert.assertEquals;


/**
 * Created by bjornjohnson on 1/12/16.
 */
public class ShipTest {
    private Ship newShip;

    @Before
    public void setUp() {
        newShip = new Ship(2, 0, 0);
    }

    @Test
    public void makeNewShipOfLengthTwo() throws Exception {
        assertEquals(2, newShip.getLength());
    }

    @Test
    public void makeNewShipOfLengthThree() throws Exception {
        newShip = new Ship(3, 0, 0);
        assertEquals(3, newShip.getLength());
    }

    @Test
    public void newShipsHitsShouldBeZero() throws Exception {
        assertEquals(0, newShip.getHits());
    }

    @Test
    public void shouldReturnTrueIfHit() throws Exception {
        assertEquals(true, newShip.checkHit(1));
    }

    @Test
    public void shouldReturnFalseIfNotHit() throws Exception {
        assertEquals(false, newShip.checkHit(9));
    }

    @Test
    public void shipShouldReturnOneIfHitOnce() throws Exception {
        newShip.checkHit(1);
        assertEquals(1, newShip.getHits());
    }

    @Test
    public void testLastPositionIsHitInMiddleOfBoard() throws Exception {
        newShip = new Ship(4, 13, 0);
        assertEquals(true, newShip.checkHit(15));

    }

    @Test
    public void shipShouldReturnThreeIfHitThreeTimes() throws Exception {
        newShip = new Ship(5, 0, 0);
        newShip.checkHit(1);
        newShip.checkHit(2);
        newShip.checkHit(3);
        assertEquals(3, newShip.getHits());
    }

    @Test
    public void shipIsSunkIfHitsEqualLength() throws Exception {
        newShip.checkHit(0);
        newShip.checkHit(1);
        assertEquals(true, newShip.isSunk());
    }


}
