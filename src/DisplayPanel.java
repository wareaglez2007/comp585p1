
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;


/**
 * Created by rostom on 10/11/2015.
 */
public class DisplayPanel extends JPanel {

    CardImagePanel imagePanel;
    ChooseControl choose;

/*
    CardChooserControl Card_Chooser;
*/
/*
    MouseEvent e;
*/


    public DisplayPanel() throws IOException {
        this.setLayout(null);

        choose = new ChooseControl();




    }
}
        //imagePanel = new CardImagePanel();
/*

        Card_Chooser = new CardChooserControl();


        add(Card_Chooser);
        add(Card_Chooser.imagePanel);

        add(Card_Chooser.ace_clubs);
        add(Card_Chooser.ace_diamonds);
        add(Card_Chooser.ace_hearts);
        add(Card_Chooser.ace_spades);


        Insets insets = this.getInsets();
        Card_Chooser.setBounds(25 + insets.left, 5 + insets.top, 500, 75);

        Card_Chooser.ace_clubs.setBounds(200 + insets.left, 150 + insets.top, 73, 98);
        Card_Chooser.ace_clubs.getLocation();

        Card_Chooser.ace_diamonds.setBounds(300 + insets.left, 150 + insets.top, 73, 98);
        Card_Chooser.ace_diamonds.getLocation();

        Card_Chooser.ace_hearts.setBounds(400 + insets.left, 150 + insets.top, 73, 98);
        Card_Chooser.ace_hearts.getLocation();

        Card_Chooser.ace_spades.setBounds(500 + insets.left, 150 + insets.top, 73, 98);
        Card_Chooser.ace_spades.getLocation();

        System.out.println(Card_Chooser.imagePanel.getLocation());
        Card_Chooser.loadCardImage();







/*

    }
}
*/
