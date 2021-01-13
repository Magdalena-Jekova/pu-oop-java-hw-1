package game;

import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

    ArrayList<Pieces> pieceCollection;

    public GameBoard(){
        this.pieceCollection = new ArrayList<>();

        //Yellow Frogs
        this.pieceCollection.add(new YellowFrogsLeader(0,4));
        this.pieceCollection.add(new YellowFrogsGuard(0,0));
        this.pieceCollection.add(new YellowFrogsGuard(0,1));
        this.pieceCollection.add(new YellowFrogsGuard(0,2));
        this.pieceCollection.add(new YellowFrogsGuard(0,3));

        //Green Frogs
        this.pieceCollection.add(new GreenFrogsLeader(4,0));
        this.pieceCollection.add(new GreenFrogsGuard(4,1));
        this.pieceCollection.add(new GreenFrogsGuard(4,2));
        this.pieceCollection.add(new GreenFrogsGuard(4,3));
        this.pieceCollection.add(new GreenFrogsGuard(4,4));

        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Метод за визуализиране на фигурите върху дъската,
     * както и на всички нейни полета.
     * @param g Graphics object
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

      for(int row = 0; row < 5; row++){
          for(int col = 0; col < 5; col++){
              BoardTile boardTile = new BoardTile(row, col);
              boardTile.render(g);

              ComplexTile complexTile = new ComplexTile(2, 2);
              complexTile.render(g);
          }
      }

        for(Pieces figure : pieceCollection){
            figure.render(g);
        }
    }
}