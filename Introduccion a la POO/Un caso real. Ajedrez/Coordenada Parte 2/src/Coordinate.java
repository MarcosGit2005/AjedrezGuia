public class Coordinate {
    private char letter;
    private int number;

    public Coordinate(char letter, int number) {
        this.letter = String.valueOf(letter).toUpperCase().charAt(0);
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "(" + letter + "," + number + ")";
    }

    public Coordinate up(){
        return new Coordinate(letter,--number);
    }
    public Coordinate down(){
        return new Coordinate(letter,++number);
    }
    public Coordinate left(){
        return new Coordinate(--letter,number);
    }
    public Coordinate right(){
        return new Coordinate(++letter,number);
    }
    public Coordinate diagonalUpLeft(){
        return new Coordinate(--letter,--number);
    }
    public Coordinate diagonalUpRight(){
        return new Coordinate(++letter,--number);
    }
    public Coordinate diagonalDownLeft(){
        return new Coordinate(--letter,++number);
    }
    public Coordinate diagonalDownRight(){
        return new Coordinate(++letter,++number);
    }
}