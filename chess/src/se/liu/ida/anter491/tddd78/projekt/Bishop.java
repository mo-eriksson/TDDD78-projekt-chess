package se.liu.ida.anter491.tddd78.projekt;

public class Bishop implements ChessPiece {
    private Board board;
    private Piece piece;

    public Bishop(final Board board, final Piece piece) {
        this.board = board;
        this.piece = piece;
    }

    @Override public boolean isMovable() {
	return false;
    }

    @Override public int getXCoordinate() {
	return 0;
    }

    @Override public int getYCoordinate() {
	return 0;
    }

    @Override public void getType() {

    }
}
