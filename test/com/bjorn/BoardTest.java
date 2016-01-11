package com.bjorn;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by bjornjohnson on 1/11/16.
 */
public class BoardTest {
    @Test
    public void getNewBoardState() throws Exception {
        Board newBoard = new Board();
        HashMap<String, String> boardState = new HashMap<String, String>();
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void getBoardwithSingleShip() throws Exception {
        Board newBoard = new Board();
        HashMap<String, String> boardState = new HashMap<String, String>();
        boardState.put("a1", "shipOne" );
        boardState.put("a2", "shipOne" );
        newBoard.placeShip("a1", "right", 2);
        assertEquals(boardState, newBoard.getBoardState());
    }
}
