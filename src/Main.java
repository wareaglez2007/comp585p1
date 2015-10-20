import javax.swing.*;
import java.io.IOException;

/**
 * Created by rostom on 10/11/2015.
 */
public class Main {

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

               //new getImageNames();
                try {
                    new DisplayFrame();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}


