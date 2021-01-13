package game;

import java.awt.*;

public class BoardTile {

    private int row;
    private int col;
    private int size;

    public BoardTile(int row, int col){
        this.row=row;
        this.col=col;
        this.size=100;
    }

    /**
     * Метод за визуализиране на полетата на дъската.
     * @param g Graphics object
     */
    public void render (Graphics g){

        if ((row == 0 && (col == 0 || col == 4)) || (row == 4 && (col == 1 || col == 3))) {
            g.setColor(Color.ORANGE);
        } else if ((row == 0 && (col == 1 || col == 3) || (row == 4 && (col == 0 || col == 4)))){
            g.setColor(Color.BLACK);
        }else if((row == 1 && (col == 0 || col == 1 || col == 3 || col == 4))
                || (row == 3 && (col == 0 || col == 1 || col == 3 ||col ==4))){
            g.setColor(Color.GRAY);
        }else{
            g.setColor(Color.WHITE);
        }

        int boardTileX = this.col * this.size;
        int boardTileY = this.row * this.size;

        g.fillRect(boardTileX, boardTileY, this.size - 1, this.size - 1);
    }
}