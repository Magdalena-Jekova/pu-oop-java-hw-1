package pieces;

import java.awt.*;

public class GreenFrogsLeader extends Pieces {

    public GreenFrogsLeader(int row, int col){
        super(row, col, Color.GREEN);
    }

    /**
     * Метод за визуализиране на зелените жаби, лидер.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int greenFrogsLeaderX = this.col * (this.size * 2);
        int greenFrogsLeaderY = this.row * (this.size * 2);

        g.setColor(Color.GREEN);
        g.fillRect(greenFrogsLeaderX + 30,greenFrogsLeaderY + 20,this.size, this.size);
    }
}