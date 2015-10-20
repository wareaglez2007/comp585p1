
import javax.swing.*;

import java.io.IOException;


/**
 * Created by rostom on 10/11/2015.
 */
public class DisplayPanel extends JPanel {

    CardImagePanel imagePanel;

    CardChooserControl Card_Chooser;


    public DisplayPanel() throws IOException {

        imagePanel = new CardImagePanel();


        Card_Chooser = new CardChooserControl();



        Card_Chooser.loadCardImage();

        imagePanel.add(Card_Chooser);


        imagePanel.add(Card_Chooser.imagePanel);






    }
}
