import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Board {


    private Cell[][] cells;
    public Board(){
        cells = new Cell[8][8];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(this,new Coordinate((char)(i+65),j+1));
            }
        }
    }

    public boolean contains(Coordinate c) {
        return !(c.getNumber()<1) && !(c.getNumber()>8) && !(c.getLetter()<'A') && !(c.getLetter()>'H');
    }

    public Cell getCellAt(Coordinate c) {
        if (!contains(c))
            return null;
        int charToNum = (int)(c.getLetter())-65;
        int num = c.getNumber()-1;
        return cells[charToNum][num];
    }
    @Override
    public String toString(){
        String chain = colorize("    A  B  C  D  E  F  G  H    \n", Attribute.BLACK_TEXT(),Attribute.BRIGHT_WHITE_BACK());
        int num = 1;
        for(Cell[] cellRow:cells){
            chain += colorize(" "+num+" ", Attribute.BLACK_TEXT(),Attribute.BRIGHT_WHITE_BACK());
            for(Cell cell:cellRow){
                chain += cell.toString();
            }
            chain += colorize(" "+(num++)+" ", Attribute.BLACK_TEXT(),Attribute.BRIGHT_WHITE_BACK()) + "\n";
        }
        chain += colorize("    A  B  C  D  E  F  G  H    \n", Attribute.BLACK_TEXT(),Attribute.BRIGHT_WHITE_BACK());
        return chain;
    }
}

