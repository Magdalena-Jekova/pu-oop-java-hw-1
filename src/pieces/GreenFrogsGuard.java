package pieces;

import java.awt.*;

public class GreenFrogsGuard extends Pieces {

    public GreenFrogsGuard(int row, int col){
        super(row, col, Color.GREEN);
    }

    /**
     * Метод за визуализиране на зелените жаби, гардове.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int greenFrogsGuardX = this.col * (this.size * 2);
        int greenFrogsGuardY = this.row * (this.size * 2);

        g.setColor(Color.YELLOW);
        g.fillOval(greenFrogsGuardX + 20,greenFrogsGuardY + 20 ,60,60);

        g.setColor(Color.GREEN);
        g.fillOval(greenFrogsGuardX + 25,greenFrogsGuardY + 25, this.size, this.size);
    }
}