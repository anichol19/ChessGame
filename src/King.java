import java.util.ArrayList;

public class King extends Piece {

	public King(int y, int x, boolean isWhite, String image)
	{
		super(y, x, isWhite, image);
	}
	
	public ArrayList<Move> findValidMoves(Board board)
	{
		ArrayList<Move> possMoves = new ArrayList<Move>();
		return possMoves;
	}
	
	public String toString()
	{
		return "K";
	}
}
