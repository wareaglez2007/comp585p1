import javafx.scene.control.ComboBox;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by rostom on 10/11/2015.
 */
public class DisplayPanel extends JPanel {
    JButton Btn;
    CardImagePanel imagePanel;
    JFileChooser jFile;
    String path;
    FileFilter filter;
    BufferedImage img;
    CardChooserControl Cardc;


    public DisplayPanel() throws IOException {

        Cardc = new CardChooserControl();
        Cardc.loadCardImage();
        this.add(Cardc);

        imagePanel = new CardImagePanel();






    }
}
