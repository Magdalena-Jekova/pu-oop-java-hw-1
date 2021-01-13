package pieces;

import java.awt.*;

public class Pieces {

    int row;
    int col;
    Color color;
    int size;

    public Pieces(int row, int col, Color color){
        this.row   = row;
        this.col   = col;
        this.color = color;
        this.size  = 50;
    }

    /**
     * Метод за визуализиране на фигурите върху полетата на дъската.
     * @param g Graphics object
     */
    public void render(Graphics g){
        g.setColor(color);
    }
}