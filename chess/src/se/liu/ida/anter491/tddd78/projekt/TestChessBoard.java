package se.liu.ida.anter491.tddd78.projekt;

import javax.swing.*;

public class TestChessBoard {

    private static final int BOARD_HIEGHT = 8; // Standard size of chess board
    private static final int BOARD_WIDTH = 8;


    public static void main(String[] args) {
	Board testBoard = new Board(BOARD_HIEGHT, BOARD_WIDTH);
        JFrame testFrame = new chessFrame("YOLO", testBoard);
        //System.out.println(BoardToTextConverter.convertToText(testBoard));

    }
}
