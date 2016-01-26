package com.bjorn;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by bjornjohnson on 1/14/16.
 */
public class GameTest {
    @Test
    public void checkIfGameClass() {
        Game newGame = new Game();
        assertThat(newGame, instanceOf(Game.class));
    }


}
