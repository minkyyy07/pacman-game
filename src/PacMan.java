import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Random;
import javax.swing.*;

public class PacMan extends JPanel {
    private int rowCount = 21;
    private int columnCount = 19;
    private int titleSize = 32;
    private int boardWidth = columnCount * titleSize;
    private int boardHeight = rowCount * titleSize;

    PacMan() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);
    }
}