import javax.swing.*;
import java.awt.*;

public class Duel extends JFrame {

    private static final int WIDTH = 1250;//Width of the frame
    private static final int HEIGHT = 900;//Height of the frame
    private static final int symbolW = 250;//Width of the Symbol
    private static final int symbolH = 150;//Height of the Symbol
    private static final int duelW = 400;//Width of the gif
    private static final int duelH = 350;//Height of the gif
    ImageIcon sith = new ImageIcon("C:\\Users\\arist\\IdeaProjects\\Lords\\symbol\\sith.jpg");//Icon
    ImageIcon fight = new ImageIcon("C:\\Users\\arist\\IdeaProjects\\Lords\\Sith vs Jedi\\Malgus.gif");//Gif
    JLabel symbol = new JLabel(sith);
    JLabel duel = new JLabel(fight);

    /*
     *Necessary labels to store the jpg and the gif
     * Now you know that gifs can be stored as an ImageIcon
     */

    Duel(){

        symbol.setSize(new Dimension(symbolW,symbolH));//Size1
        symbol.setLocation(525,100);//Location1

        duel.setSize(new Dimension(duelW,duelH));//Size2
        duel.setLocation(450,400);//Location2

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(WIDTH,HEIGHT));
        this.setLocationRelativeTo(null);
        this.setTitle("Sith Lords");//Title
        this.setLayout(null);
        this.setResizable(false);
        this.setIconImage(sith.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));
        this.add(symbol);
        this.add(duel);
        this.setVisible(true);

    }

}
