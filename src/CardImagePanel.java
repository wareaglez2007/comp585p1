
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;


/**
 * Created by rostom on 10/11/2015.
 */
public class CardImagePanel extends JPanel {
    BufferedImage image;


    public CardImagePanel() {
        image = new BufferedImage(10,10, BufferedImage.TYPE_INT_ARGB);


    }

    public BufferedImage getImage() {
        return image;


    }

    public void setImage(BufferedImage img) {

        this.image = img;
        this.getImage();
        revalidate();
        repaint();


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {

            g.drawImage(image, 0, 0, 73, 98, null);

           // g.dispose();
        }
    }

    public Dimension getPreferredSize() {
        if (image == null) {
            return new Dimension(20, 52);
        } else {
            return new Dimension(image.getWidth()/6  , image.getHeight()/6);
        }
    }

}
