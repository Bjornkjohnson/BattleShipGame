package com.bjorn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bjornjohnson on 1/13/16.
 */
public class PlayerTest {
    private Player newPlayer;

    @Before
    public void setUp() {
        Ship ships[] = new Ship[5];
        ships[0] = new Ship(2, 0, 0);
        ships[1] = new Ship(3, 10, 0);
        ships[2] = new Ship(3, 20, 0);
        ships[3] = new Ship(4, 30, 0);
        ships[4] = new Ship(5, 40, 0);

        newPlayer = new Player(ships);
    }

    @Test
    public void newPlayerShouldHaveFiveShips() throws Exception {
        assertEquals(5, newPlayer.getFleet());
    }
}
