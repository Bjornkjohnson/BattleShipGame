package com.bjorn;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by bjornjohnson on 1/11/16.
 */
public class BoardTest {
    private Board newBoard;
    private HashMap<String, String> boardState;

    @Before
    public void setUp() {
        newBoard = new Board();
        boardState = new HashMap<String, String>();
    }

    @Test
    public void getNewBoardState() throws Exception {
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void getBoardwithSingleShip() throws Exception {
        boardState.put("a1", "shipOne" );
        boardState.put("a2", "shipOne" );
        newBoard.placeShip("a1", "right", 2);
        assertEquals(boardState, newBoard.getBoardState());
    }
}
