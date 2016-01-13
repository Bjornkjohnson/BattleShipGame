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
        boardState = new HashMap<>();
    }

    @Test
    public void getNewEmptyBoard() throws Exception {
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void placeOneHorizantalShip() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "shipOne" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void placeTwoHorizantalShips() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "shipOne" );
        boardState.put(10, "shipTwo" );
        boardState.put(11, "shipTwo" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        newBoard.placeShip(10, "horizontal", 2, "shipTwo");
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test
    public void placeOneHorizantalOneVerticalShip() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "shipOne" );
        boardState.put(10, "shipTwo" );
        boardState.put(20, "shipTwo" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        newBoard.placeShip(10, "vertical", 2, "shipTwo");
        assertEquals(boardState, newBoard.getBoardState());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkForErrorIfPiecesOverlap(){
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        newBoard.placeShip(0, "vertical", 2, "shipTwo");
    }


    @Test
    public void boardShouldUpdateAfterShot() throws Exception {
        boardState.put(0, "shipOne" );
        boardState.put(1, "hit" );
        newBoard.placeShip(0, "horizontal", 2, "shipOne");
        newBoard.updateBoardState(1, "hit");
        assertEquals(boardState, newBoard.getBoardState());
    }
}
