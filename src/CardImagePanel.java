
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;


/**
 * Created by rostom on 10/11/2015.
 */
public class CardImagePanel extends JPanel implements MouseListener, MouseMotionListener{
    BufferedImage image;
    private int x;
    private int y;


    public CardImagePanel() {
        image = new BufferedImage(10,10, BufferedImage.TYPE_INT_ARGB);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setBackground(Color.RED);

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

            g.dispose();
        }
    }

    public Dimension getPreferredSize() {
        if (image == null) {
            return new Dimension(20, 52);
        } else {
            return new Dimension(image.getWidth()/4  , image.getHeight()/4);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
       if(this.contains(e.getPoint())){
           x = e.getX ();
           y = e.getY();
           ///this.getLocation();


       }



    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e){
        int x = e.getXOnScreen()-this.x;
        int y = e.getYOnScreen() -this.y;
        this.setLocation(x,y);
        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}
