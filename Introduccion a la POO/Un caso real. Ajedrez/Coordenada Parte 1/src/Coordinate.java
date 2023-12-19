public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public char getLetter(){
        return this.letter;
    }
    @Override
    public String toString(){
        return "(" + letter + "," + number + ")";
    }
}