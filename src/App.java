import java.awt.Image;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount =21;
        int columnCount =19;
        int tileSize = 32;
        int boardWidth = columnCount*tileSize;
        int bordHeight = rowCount*tileSize;

        JFrame frame = new JFrame("Pac Man");
        frame.setVisible(true);
        frame.setSize(boardWidth, bordHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacManGame = new PacMan();
        frame.add(pacManGame);
        frame.pack();
        frame.setVisible(true);


    }
}
