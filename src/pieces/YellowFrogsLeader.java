package pieces;

import java.awt.*;

public class YellowFrogsLeader extends Pieces {

    public YellowFrogsLeader(int row, int col){
        super(row, col, Color.YELLOW);
    }

    /**
     * Метод за визуализиране на жълтите жаби, лидер.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int yellowFrogsLeaderX = this.col * (this.size * 2);
        int yellowFrogsLeaderY = this.row * (this.size * 2);

        g.setColor(Color.YELLOW);
        g.fillRect(yellowFrogsLeaderX + 20,yellowFrogsLeaderY + 30,this.size, this.size);
    }
}