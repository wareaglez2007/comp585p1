import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by rostom on 10/11/2015.
 */
public class DisplayFrame extends JFrame{

    DisplayPanel deckOfCards;

    public DisplayFrame() throws IOException {
        super("Cards");
        this.setBackground(Color.green);



        deckOfCards = new DisplayPanel();
        Insets insets = deckOfCards.getInsets();
        deckOfCards.setSize(250 + insets.left + insets.right,
                90 + insets.top + insets.bottom);

        add(deckOfCards);

        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
