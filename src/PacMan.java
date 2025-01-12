import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.random.*;
import javax.swing.*;

public class PacMan extends JPanel {

class Block{
    int x;
    int y;
    int width;
    int height;
    Image image;

    int starx;
    int starty;

    Block(Image image,int x, int y,int width, int height){
        this.image=image;
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.startx=x;
        this.starty=y;

    }
}
    private int rowCount =21;
    private int columnCount =19;
    private int tileSize = 32;
    private int boardWidth = columnCount*tileSize;
    private int bordHeight = rowCount*tileSize;

    private Image wallImage;
    private Image blueGhostImage;
    private Image orangeGhostImage;
    private Image pinkGhostImage;
    private Image redGhostImage;

    private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;

    HashSet<Block> walls;
    HashSet<Block> foods;
    HashSet<Block> ghost;
    Block pacman;

    PacMan(){
        setPreferredSize(new Dimension(boardWidth, bordHeight));
        setBackground(Color.black);

        //load images
        wallImage = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./redGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();

    }

}
