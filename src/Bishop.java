import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop(int y, int x, boolean isWhite)
	{
		super(y, x, isWhite);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		return possMoves;
	}
}
