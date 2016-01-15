package com.bjorn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bjornjohnson on 1/13/16.
 */
public class PlayerTest {
    private Board newBoard;
    private Player newPlayer;

    @Before
    public void setUp() {
        Ship ships[] = new Ship[5];
        ships[0] = new Ship(2, 0, 0, "D");
        ships[1] = new Ship(3, 2, 0, "S");
        ships[2] = new Ship(5, 5, 0, "A");
        ships[3] = new Ship(3, 10, 0, "C");
        ships[4] = new Ship(4, 13, 0, "B");

        newBoard = new Board();
        newPlayer = new Player(ships, newBoard);
    }

    @Test
    public void newPlayerShouldHaveFiveShips() throws Exception {
        assertEquals(5, newPlayer.getFleet());
    }

    @Test
    public void newPlayerShouldHaveGameBoard() throws Exception {
        assertEquals(newBoard, newPlayer.getBoard());
    }

    @Test
    public void shouldReturnTrueIfShipIsHit() throws Exception {
        assertEquals(true, newPlayer.checkIfHit(1));
    }

    @Test
    public void fleetDestroyedIfallShipsSunk() throws Exception {
        for (int i = 0; i < 17; i++) {
            newPlayer.checkIfHit(i);
        }
        assertEquals(true, newPlayer.fleetDestroyed());
    }
}
