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
    private HashMap<Integer, String> boardState;

    @Before
    public void setUp() {
        newBoard = new Board();
        boardState = new HashMap<Integer, String>();
    }

    @Test
    public void getNewBoardState() throws Exception {
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void getBoardwithSingleShip() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "shipOne" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void getBoardwithTwoShips() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "shipOne" );
        boardState.put(10, "shipTwo" );
        boardState.put(11, "shipTwo" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        newBoard.placeShip(10, "horizontal", 2, "shipTwo");
        assertEquals(boardState, newBoard.getBoardState());
    }
}
