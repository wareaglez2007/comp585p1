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
        setLayout(new FlowLayout());
        deckOfCards = new DisplayPanel();
        add(deckOfCards);

        setSize(900,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
