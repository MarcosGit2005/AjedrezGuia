
public class Piece {

    private Type type;

    public Piece(Type type) {
        this.type = type;
    }

    public enum Color {
        WHITE("Blanco"), BLACK("Negro");
        private String color;
        Color(String text){
            this.color=text;
        }
        public String getColor(){
            return color;
        }
    }

    public enum Type {
        WHITE_KING("KING",Color.WHITE), WHITE_QUEEN("QUEEN",Color.WHITE),
        WHITE_ROOK("ROOK",Color.WHITE), WHITE_BISHOP("BISHOP",Color.WHITE),
        WHITE_KNIGHT("KNIGHT",Color.WHITE), WHITE_PAWN("PAWN",Color.WHITE),
        BLACK_KING("KING",Color.BLACK), BLACK_QUEEN("QUEEN",Color.BLACK),
        BLACK_ROOK("ROOK",Color.BLACK), BLACK_BISHOP("BISHOP",Color.BLACK),
        BLACK_KNIGHT("KNIGHT",Color.BLACK), BLACK_PAWN("PAWN",Color.BLACK);
        private String shape;
        private Color color;
        Type(String shape,Color color){
            this.shape = shape;
            this.color = color;
        }
        public String getShape(){
            return shape;
        }
        public Color getColor(){
            return color;
        }
    }

}

