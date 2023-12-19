public class Cell {
    private Piece piece;
    private Board board;
    private Coordinate coordinate;
    public Cell(Coordinate coordinate,Board board){
        this.coordinate = coordinate;
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public Board getBoard() {
        return board;
    }

    public Coordinate getCoordiante() {
        return coordinate;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public boolean isEmpty(){
        return piece==null;
    }
}
