package pieces;

import java.awt.*;

public class YellowFrogsGuard extends Pieces {

    public YellowFrogsGuard(int row, int col){
        super(row, col, Color.YELLOW);
    }

    /**
     * Метод за визуализиране на жълтите жаби, гардове.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int yellowFrogsGuardX = this.col * (this.size * 2);
        int yellowFrogsGuardY = this.row * (this.size * 2);

        g.setColor(Color.GREEN);
        g.fillOval(yellowFrogsGuardX + 20,yellowFrogsGuardY + 30,60,60);

        g.setColor(Color.YELLOW);
        g.fillOval(yellowFrogsGuardX + 25,yellowFrogsGuardY + 35, this.size, this.size);
    }
}