import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

import static java.lang.System.*;

/**
 * Created by rostom on 10/15/2015.
 */
public class CardChooserControl extends JPanel {
    JComboBox face;
    JLabel of;
    JComboBox suit;
    CardImagePanel imagePanel;
    JButton jButton;
    BufferedImage loadImage;
    BufferedImage buffy;
    String dirPath;
    String imageName;
    SuitAndFace suitAndFace;
    File folder;
    File[] list_of_image_names;
    String name_of_images_in_dir;
    String[] token;
    HashMap<SuitAndFace, CardImagePanel> CardImage;
    CardImagePanel ace_hearts;
    CardImagePanel ace_clubs;
    CardImagePanel ace_spades;
    CardImagePanel ace_diamonds;
    CardImagePanel two_of_clubs;
    CardImagePanel two_of_diamonds;
    CardImagePanel two_of_hearts;
    CardImagePanel two_of_spades;

    CardImagePanel three_of_clubs;
    CardImagePanel three_of_diamonds;
    CardImagePanel three_of_hearts;
    CardImagePanel three_of_spades;

    CardImagePanel four_of_clubs;
    CardImagePanel four_of_diamonds;
    CardImagePanel four_of_hearts;
    CardImagePanel four_of_spades;

    CardImagePanel five_of_clubs;
    CardImagePanel five_of_diamonds;
    CardImagePanel five_of_hearts;
    CardImagePanel five_of_spades;

    CardImagePanel six_of_clubs;
    CardImagePanel six_of_diamonds;
    CardImagePanel six_of_hearts;
    CardImagePanel six_of_spades;

    CardImagePanel seven_of_clubs;
    CardImagePanel seven_of_diamonds;
    CardImagePanel seven_of_hearts;
    CardImagePanel seven_of_spades;

    CardImagePanel eight_of_clubs;
    CardImagePanel eight_of_diamonds;
    CardImagePanel eight_of_hearts;
    CardImagePanel eight_of_spades;

    CardImagePanel nine_of_clubs;
    CardImagePanel nine_of_diamonds;
    CardImagePanel nine_of_hearts;
    CardImagePanel nine_of_spades;

    CardImagePanel ten_of_clubs;
    CardImagePanel ten_of_diamonds;
    CardImagePanel ten_of_hearts;
    CardImagePanel ten_of_spades;

    CardImagePanel jack_of_clubs;
    CardImagePanel jack_of_diamonds;
    CardImagePanel jack_of_hearts;
    CardImagePanel jack_of_spades;

    CardImagePanel queen_of_clubs;
    CardImagePanel queen_of_diamonds;
    CardImagePanel queen_of_hearts;
    CardImagePanel queen_of_spades;

    CardImagePanel king_of_clubs;
    CardImagePanel king_of_diamonds;
    CardImagePanel king_of_hearts;
    CardImagePanel king_of_spades;

    BufferedImage ace_of_clubs_image;
    BufferedImage ace_of_diamonds_image;
    BufferedImage ace_of_hearts_image;
    BufferedImage ace_of_spades_image;

    BufferedImage two_of_clubs_image;
    BufferedImage two_of_diamonds_image;
    BufferedImage two_of_hearts_image;
    BufferedImage two_of_spades_image;

    BufferedImage three_of_clubs_image;
    BufferedImage three_of_diamonds_image;
    BufferedImage three_of_hearts_image;
    BufferedImage three_of_spades_image;

    BufferedImage four_of_clubs_image;
    BufferedImage four_of_diamonds_image;
    BufferedImage four_of_hearts_image;
    BufferedImage four_of_spades_image;

    BufferedImage five_of_clubs_image;
    BufferedImage five_of_diamonds_image;
    BufferedImage five_of_hearts_image;
    BufferedImage five_of_spades_image;

    BufferedImage six_of_clubs_image;
    BufferedImage six_of_diamonds_image;
    BufferedImage six_of_hearts_image;
    BufferedImage six_of_spades_image;

    BufferedImage seven_of_clubs_image;
    BufferedImage seven_of_diamonds_image;
    BufferedImage seven_of_hearts_image;
    BufferedImage seven_of_spades_image;

    BufferedImage eight_of_clubs_image;
    BufferedImage eight_of_diamonds_image;
    BufferedImage eight_of_hearts_image;
    BufferedImage eight_of_spades_image;

    BufferedImage nine_of_clubs_image;
    BufferedImage nine_of_diamonds_image;
    BufferedImage nine_of_hearts_image;
    BufferedImage nine_of_spades_image;

    BufferedImage ten_of_clubs_image;
    BufferedImage ten_of_diamonds_image;
    BufferedImage ten_of_hearts_image;
    BufferedImage ten_of_spades_image;

    BufferedImage jack_of_clubs_image;
    BufferedImage jack_of_diamonds_image;
    BufferedImage jack_of_hearts_image;
    BufferedImage jack_of_spades_image;

    BufferedImage queen_of_clubs_image;
    BufferedImage queen_of_diamonds_image;
    BufferedImage queen_of_hearts_image;
    BufferedImage queen_of_spades_image;

    BufferedImage king_of_clubs_image;
    BufferedImage king_of_diamonds_image;
    BufferedImage king_of_hearts_image;
    BufferedImage king_of_spades_image;

    public CardChooserControl() {


        face = new JComboBox();
        suit = new JComboBox();
        of = new JLabel("of");
        imagePanel = new CardImagePanel();

        ace_clubs = new CardImagePanel();
        ace_hearts = new CardImagePanel();
        ace_diamonds = new CardImagePanel();
        ace_spades = new CardImagePanel();

        two_of_clubs = new CardImagePanel();
        two_of_diamonds = new CardImagePanel();
        two_of_hearts = new CardImagePanel();
        two_of_spades = new CardImagePanel();

        three_of_clubs = new CardImagePanel();
        three_of_diamonds = new CardImagePanel();
        three_of_hearts = new CardImagePanel();
        three_of_spades = new CardImagePanel();

        four_of_clubs = new CardImagePanel();
        four_of_diamonds = new CardImagePanel();
        four_of_hearts = new CardImagePanel();
        four_of_spades = new CardImagePanel();

        five_of_clubs = new CardImagePanel();
        five_of_diamonds = new CardImagePanel();
        five_of_hearts = new CardImagePanel();
        five_of_spades = new CardImagePanel();

        six_of_clubs = new CardImagePanel();
        six_of_diamonds = new CardImagePanel();
        six_of_hearts = new CardImagePanel();
        six_of_spades = new CardImagePanel();

        seven_of_clubs = new CardImagePanel();
        seven_of_diamonds = new CardImagePanel();
        seven_of_hearts = new CardImagePanel();
        seven_of_spades = new CardImagePanel();

        eight_of_clubs = new CardImagePanel();
        eight_of_diamonds = new CardImagePanel();
        eight_of_hearts = new CardImagePanel();
        eight_of_spades = new CardImagePanel();

        nine_of_clubs = new CardImagePanel();
        nine_of_diamonds = new CardImagePanel();
        nine_of_hearts = new CardImagePanel();
        nine_of_spades = new CardImagePanel();

        ten_of_clubs = new CardImagePanel();
        ten_of_diamonds = new CardImagePanel();
        ten_of_hearts = new CardImagePanel();
        ten_of_spades = new CardImagePanel();

        jack_of_clubs = new CardImagePanel();
        jack_of_diamonds = new CardImagePanel();
        jack_of_hearts = new CardImagePanel();
        jack_of_spades = new CardImagePanel();

        queen_of_clubs = new CardImagePanel();
        queen_of_diamonds = new CardImagePanel();
        queen_of_hearts = new CardImagePanel();
        queen_of_spades = new CardImagePanel();

        king_of_clubs = new CardImagePanel();
        king_of_diamonds = new CardImagePanel();
        king_of_hearts = new CardImagePanel();
        king_of_spades = new CardImagePanel();

        ace_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ace_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ace_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ace_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        two_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        two_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        two_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        two_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        three_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        three_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        three_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        three_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        four_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        four_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        four_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        four_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        five_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        five_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        five_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        five_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        six_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        six_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        six_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        six_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        seven_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        seven_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        seven_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        seven_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        eight_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        eight_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        eight_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        eight_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        nine_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        nine_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        nine_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        nine_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        ten_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ten_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ten_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        ten_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        jack_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        jack_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        jack_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        jack_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        queen_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        queen_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        queen_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        queen_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);

        king_of_clubs_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        king_of_diamonds_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        king_of_hearts_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        king_of_spades_image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);


        jButton = new JButton("Get Card");
        this.add(face);
        //this.add(imagePanel);

        this.add(of);


        DefaultComboBoxModel suitModel = new DefaultComboBoxModel();

        suitModel.addElement("hearts");
        suitModel.addElement("spades");
        suitModel.addElement("diamonds");
        suitModel.addElement("clubs");
        suit.setModel(suitModel);

        DefaultComboBoxModel faceModel = new DefaultComboBoxModel();
        faceModel.addElement("ace");
        faceModel.addElement("king");
        faceModel.addElement("queen");
        faceModel.addElement("jack");
        faceModel.addElement("ten");
        faceModel.addElement("nine");
        faceModel.addElement("eight");
        faceModel.addElement("seven");
        faceModel.addElement("six");
        faceModel.addElement("five");
        faceModel.addElement("four");
        faceModel.addElement("three");
        faceModel.addElement("two");


        face.setModel(faceModel);

        this.add(suit);
        this.add(jButton);


    }
    public File[] getList_of_image_names(){

        return list_of_image_names;
    }

    public void loadCardImage() throws IOException {
        /*Create a File object to represent the directory containing card images */
        dirPath = "C:\\Users\\rostom\\Downloads\\PNG-cards-1.3\\PNG-cards-1.3\\";
        folder = new File(dirPath);
        list_of_image_names = folder.listFiles();


              /*Loop through */
        for(int i = 0; i<list_of_image_names.length;i++){

            name_of_images_in_dir =list_of_image_names[i].getName();
            System.out.println(list_of_image_names[i].getName());


            /*Ace of Clubs*/
            if(name_of_images_in_dir.toString().equals("ace_of_clubs.png")) {
                ace_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
       /*         ace_clubs.setImage(ace_of_clubs_image);
                ace_clubs.revalidate();
                ace_clubs.repaint();

                System.out.println(ace_of_hearts_image);*/

            }
            /*Ace of Diamonds*/
            else if(name_of_images_in_dir.toString().equals("ace_of_diamonds.png")){
                ace_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  ace_diamonds.setImage(ace_of_diamonds_image);
               ace_diamonds.revalidate();
               ace_diamonds.repaint();
                System.out.println(ace_of_diamonds_image);*/


            }
            /*Ace of Hearts*/
            else if(name_of_images_in_dir.toString().equals("ace_of_hearts.png")){
                ace_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
               /* ace_hearts.setImage(ace_of_hearts_image);
                ace_hearts.revalidate();
                ace_hearts.repaint();
                System.out.println(ace_of_hearts_image);*/


            }
            /*Ace of Spades*/
            else if(name_of_images_in_dir.toString().equals("ace_of_spades.png")){
                ace_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*   ace_spades.setImage(ace_of_spades_image);
                ace_spades.revalidate();
                ace_spades.repaint();
                System.out.println(ace_of_spades_image);*/


            }
            /*two of Clubs*/
            else if(name_of_images_in_dir.toString().equals("2_of_clubs.png")){
                two_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   two_of_clubs.setImage(two_of_clubs_image);
                two_of_clubs.revalidate();
                two_of_clubs.repaint();
                System.out.println(two_of_clubs_image);*/


            }
            /*two of Diamonds*/
            else if(name_of_images_in_dir.toString().equals("2_of_diamonds.png")){
                two_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
         /*       two_of_diamonds.setImage(two_of_diamonds_image);
                two_of_diamonds.revalidate();
                two_of_diamonds.repaint();
                System.out.println(two_of_diamonds_image);*/


            }
            /*two of Hearts*/
            else if(name_of_images_in_dir.toString().equals("2_of_hearts.png")){
                two_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    two_of_hearts.setImage(two_of_hearts_image);
                two_of_hearts.revalidate();
                two_of_hearts.repaint();
                System.out.println(two_of_hearts_image);*/


            }
            /*two of Spades*/
            else if(name_of_images_in_dir.toString().equals("2_of_spades.png")){
                two_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
               /* two_of_spades.setImage(two_of_spades_image);
                two_of_spades.revalidate();
                two_of_spades.repaint();
                System.out.println(two_of_spades_image);*/


            }
            /*three of clubs*/
            else if(name_of_images_in_dir.toString().equals("3_of_clubs.png")){
                three_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    three_of_clubs.setImage(three_of_clubs_image);
                three_of_clubs.revalidate();
                three_of_clubs.repaint();
                System.out.println(three_of_clubs_image);*/


            }
            /*Three of diamonds*/
            else if(name_of_images_in_dir.toString().equals("3_of_diamonds.png")){
                three_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
        /*        three_of_diamonds.setImage(three_of_diamonds_image);
                three_of_diamonds.revalidate();
                three_of_diamonds.repaint();
                System.out.println(three_of_diamonds_image);*/


            }
            /*Three of hearts*/
            else if(name_of_images_in_dir.toString().equals("3_of_hearts.png")){
                three_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
           /*     three_of_hearts.setImage(two_of_hearts_image);
                three_of_hearts.revalidate();
                three_of_hearts.repaint();
                System.out.println(three_of_hearts_image);*/


            }
            /*Three of Spades*/
            else if(name_of_images_in_dir.toString().equals("3_of_spades.png")) {
                three_of_spades_image = ImageIO.read(new File(dirPath + "\\" + name_of_images_in_dir));
        /*        three_of_spades.setImage(three_of_spades_image);
                three_of_spades.revalidate();
                three_of_spades.repaint();
                System.out.println(three_of_spades_image);*/


            }
            /*four of clubs*/
            else if(name_of_images_in_dir.toString().equals("4_of_clubs.png")){
                four_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  four_of_clubs.setImage(four_of_clubs_image);
                four_of_clubs.revalidate();
                four_of_clubs.repaint();
                System.out.println(four_of_clubs_image);*/


            }
            /*four of diamonds*/
            else if(name_of_images_in_dir.toString().equals("4_of_diamonds.png")){
                four_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   four_of_diamonds.setImage(four_of_diamonds_image);
                four_of_diamonds.revalidate();
                four_of_diamonds.repaint();
                System.out.println(four_of_diamonds_image);*/


            }
            /*four of hearts*/
            else if(name_of_images_in_dir.toString().equals("4_of_hearts.png")){
                four_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  four_of_hearts.setImage(four_of_hearts_image);
                four_of_hearts.revalidate();
                four_of_hearts.repaint();
                System.out.println(four_of_hearts_image);*/


            }
            /*four of Spades*/
            else if(name_of_images_in_dir.toString().equals("4_of_spades.png")){
                four_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
          /*      four_of_spades.setImage(four_of_spades_image);
                four_of_spades.revalidate();
                four_of_spades.repaint();
                System.out.println(four_of_spades_image);*/


            }
            /*five of clubs*/
            else if(name_of_images_in_dir.toString().equals("5_of_clubs.png")){
                five_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
   /*             five_of_clubs.setImage(five_of_clubs_image);
                five_of_clubs.revalidate();
                five_of_clubs.repaint();
                System.out.println(five_of_clubs_image);*/


            }
            /*five of diamonds*/
            else if(name_of_images_in_dir.toString().equals("5_of_diamonds.png")){
                five_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    five_of_diamonds.setImage(five_of_diamonds_image);
                five_of_diamonds.revalidate();
                five_of_diamonds.repaint();
                System.out.println(five_of_diamonds_image);*/


            }
            /*five of hearts*/
            else if(name_of_images_in_dir.toString().equals("5_of_hearts.png")){
                five_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    five_of_hearts.setImage(five_of_hearts_image);
                five_of_hearts.revalidate();
                five_of_hearts.repaint();
                System.out.println(five_of_hearts_image);*/


            }
            /*five of Spades*/
            else if(name_of_images_in_dir.toString().equals("5_of_spades.png")){
                five_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
               /* five_of_spades.setImage(five_of_spades_image);
                five_of_spades.revalidate();
                five_of_spades.repaint();
                System.out.println(five_of_spades_image);*/


            }
            /*six of clubs*/
            else if(name_of_images_in_dir.toString().equals("6_of_clubs.png")){
                six_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   six_of_clubs.setImage(six_of_clubs_image);
                six_of_clubs.revalidate();
                six_of_clubs.repaint();
                System.out.println(six_of_clubs_image);*/


            }
            /*six of diamonds*/
            else if(name_of_images_in_dir.toString().equals("6_of_diamonds.png")){
                six_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
          /*      six_of_diamonds.setImage(six_of_diamonds_image);
                six_of_diamonds.revalidate();
                six_of_diamonds.repaint();
                System.out.println(six_of_diamonds_image);*/


            }
            /*six of hearts*/
            else if(name_of_images_in_dir.toString().equals("6_of_hearts.png")){
                six_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
          /*      six_of_hearts.setImage(six_of_hearts_image);
                six_of_hearts.revalidate();
                six_of_hearts.repaint();
                System.out.println(six_of_hearts_image);*/


            }
            /*six of Spades*/
            else if(name_of_images_in_dir.toString().equals("6_of_spades.png")){
                six_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
                six_of_spades.setImage(six_of_spades_image);
                six_of_spades.revalidate();
                six_of_spades.repaint();
                System.out.println(six_of_spades_image);


            }
            /*seven of clubs*/
            else if(name_of_images_in_dir.toString().equals("7_of_clubs.png")){
                seven_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  seven_of_clubs.setImage(seven_of_clubs_image);
                seven_of_clubs.revalidate();
                seven_of_clubs.repaint();
                System.out.println(seven_of_clubs_image);*/


            }
            /*seven of diamonds*/
            else if(name_of_images_in_dir.toString().equals("7_of_diamonds.png")){
                seven_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
               /* seven_of_diamonds.setImage(seven_of_diamonds_image);
                seven_of_diamonds.revalidate();
                seven_of_diamonds.repaint();
                System.out.println(seven_of_diamonds_image);*/


            }
            /*seven of hearts*/
            else if(name_of_images_in_dir.toString().equals("7_of_hearts.png")){
                seven_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   seven_of_hearts.setImage(seven_of_hearts_image);
                seven_of_hearts.revalidate();
                seven_of_hearts.repaint();
                System.out.println(seven_of_hearts_image);*/


            }
            /*seven of Spades*/
            else if(name_of_images_in_dir.toString().equals("7_of_spades.png")){
                seven_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
         /*       seven_of_spades.setImage(seven_of_spades_image);
                seven_of_spades.revalidate();
                seven_of_spades.repaint();
                System.out.println(seven_of_spades_image);*/


            }
            /*eight of clubs*/
            else if(name_of_images_in_dir.toString().equals("8_of_clubs.png")){
                eight_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  eight_of_clubs.setImage(eight_of_clubs_image);
                eight_of_clubs.revalidate();
                eight_of_clubs.repaint();
                System.out.println(eight_of_clubs_image);*/


            }
            /*eight of diamonds*/
            else if(name_of_images_in_dir.toString().equals("8_of_diamonds.png")){
                eight_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
           /*     eight_of_diamonds.setImage(eight_of_diamonds_image);
                eight_of_diamonds.revalidate();
                eight_of_diamonds.repaint();
                System.out.println(eight_of_diamonds_image);*/


            }
            /*eight of hearts*/
            else if(name_of_images_in_dir.toString().equals("8_of_hearts.png")){
                eight_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
          /*      eight_of_hearts.setImage(eight_of_hearts_image);
                eight_of_hearts.revalidate();
                eight_of_hearts.repaint();
                System.out.println(eight_of_hearts_image);*/


            }
            /*eight of Spades*/
            else if(name_of_images_in_dir.toString().equals("8_of_spades.png")){
                eight_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    eight_of_spades.setImage(eight_of_spades_image);
                eight_of_spades.revalidate();
                eight_of_spades.repaint();
                System.out.println(eight_of_spades_image);*/


            }
            /*nine of clubs*/
            else if(name_of_images_in_dir.toString().equals("9_of_clubs.png")){
                nine_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
           /*     nine_of_clubs.setImage(nine_of_clubs_image);
                nine_of_clubs.revalidate();
                nine_of_clubs.repaint();
                System.out.println(nine_of_clubs_image);
*/

            }
            /*nine of diamonds*/
            else if(name_of_images_in_dir.toString().equals("9_of_diamonds.png")){
                nine_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
           /*     nine_of_diamonds.setImage(nine_of_diamonds_image);
                nine_of_diamonds.revalidate();
                nine_of_diamonds.repaint();
                System.out.println(nine_of_diamonds_image);*/


            }
            /*nine of hearts*/
            else if(name_of_images_in_dir.toString().equals("9_of_hearts.png")){
                nine_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    nine_of_hearts.setImage(nine_of_hearts_image);
                nine_of_hearts.revalidate();
                nine_of_hearts.repaint();
                System.out.println(nine_of_hearts_image);*/


            }
            /*nine of Spades*/
            else if(name_of_images_in_dir.toString().equals("9_of_spades.png")){
                nine_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    nine_of_spades.setImage(nine_of_spades_image);
                nine_of_spades.revalidate();
                nine_of_spades.repaint();
                System.out.println(nine_of_spades_image);*/


            }
            /*ten of clubs*/
            else if(name_of_images_in_dir.toString().equals("10_of_clubs.png")){
                ten_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  ten_of_clubs.setImage(ten_of_clubs_image);
                ten_of_clubs.revalidate();
                ten_of_clubs.repaint();
                System.out.println(ten_of_clubs_image);*/


            }
            /*ten of diamonds*/
            else if(name_of_images_in_dir.toString().equals("10_of_diamonds.png")){
                ten_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   ten_of_diamonds.setImage(ten_of_diamonds_image);
                ten_of_diamonds.revalidate();
                ten_of_diamonds.repaint();
                System.out.println(ten_of_diamonds_image);*/


            }
            /*ten of hearts*/
            else if(name_of_images_in_dir.toString().equals("10_of_hearts.png")){
                ten_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   ten_of_hearts.setImage(ten_of_hearts_image);
                ten_of_hearts.revalidate();
                ten_of_hearts.repaint();
                System.out.println(ten_of_hearts_image);*/


            }
            /*ten of Spades*/
            else if(name_of_images_in_dir.toString().equals("10_of_spades.png")){
                ten_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
           /*     ten_of_spades.setImage(ten_of_spades_image);
                ten_of_spades.revalidate();
                ten_of_spades.repaint();
                System.out.println(ten_of_spades_image);*/


            }
            /*jack of clubs*/
            else if(name_of_images_in_dir.toString().equals("jack_of_clubs.png")){
                jack_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    jack_of_clubs.setImage(jack_of_clubs_image);
                jack_of_clubs.revalidate();
                jack_of_clubs.repaint();
                System.out.println(jack_of_clubs_image);*/


            }
            /*jack of diamonds*/
            else if(name_of_images_in_dir.toString().equals("jack_of_diamonds.png")){
                jack_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    jack_of_diamonds.setImage(jack_of_diamonds_image);
                jack_of_diamonds.revalidate();
                jack_of_diamonds.repaint();
                System.out.println(jack_of_diamonds_image);*/


            }
            /*jack of hearts*/
            else if(name_of_images_in_dir.toString().equals("jack_of_hearts.png")){
                jack_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
              /*  jack_of_hearts.setImage(jack_of_hearts_image);
                jack_of_hearts.revalidate();
                jack_of_hearts.repaint();
                System.out.println(jack_of_hearts_image);*/


            }
            /*jack of Spades*/
            else if(name_of_images_in_dir.toString().equals("jack_of_spades.png")){
                jack_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
         /*       jack_of_spades.setImage(jack_of_spades_image);
                jack_of_spades.revalidate();
                jack_of_spades.repaint();
                System.out.println(jack_of_spades_image);*/


            }
            /*queen of clubs*/
            else if(name_of_images_in_dir.toString().equals("queen_of_clubs.png")){
                queen_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
        /*        queen_of_clubs.setImage(queen_of_clubs_image);
                queen_of_clubs.revalidate();
                queen_of_clubs.repaint();
                System.out.println(queen_of_clubs_image);*/


            }
            /*queen of diamonds*/
            else if(name_of_images_in_dir.toString().equals("queen_of_diamonds.png")){
                queen_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    queen_of_diamonds.setImage(queen_of_diamonds_image);
                queen_of_diamonds.revalidate();
                queen_of_diamonds.repaint();
                System.out.println(queen_of_diamonds_image);
*/

            }
            /*queen of hearts*/
            else if(name_of_images_in_dir.toString().equals("queen_of_hearts.png")){
                queen_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
         /*       queen_of_hearts.setImage(queen_of_hearts_image);
                queen_of_hearts.revalidate();
                queen_of_hearts.repaint();
                System.out.println(queen_of_hearts_image);*/


            }
            /*queen of Spades*/
            else if(name_of_images_in_dir.toString().equals("queen_of_spades.png")){
                queen_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   queen_of_spades.setImage(queen_of_spades_image);
                queen_of_spades.revalidate();
                queen_of_spades.repaint();
                System.out.println(queen_of_spades_image);*/


            }
            /*king of clubs*/
            else if(name_of_images_in_dir.toString().equals("king_of_clubs.png")){
                king_of_clubs_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    king_of_clubs.setImage(king_of_clubs_image);
                king_of_clubs.revalidate();
                king_of_clubs.repaint();
                System.out.println(king_of_clubs_image);*/


            }
            /*king of diamonds*/
            else if(name_of_images_in_dir.toString().equals("king_of_diamonds.png")){
                king_of_diamonds_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
          /*      king_of_diamonds.setImage(king_of_diamonds_image);
                king_of_diamonds.revalidate();
                king_of_diamonds.repaint();
                System.out.println(king_of_diamonds_image);*/


            }
            /*king of hearts*/
            else if(name_of_images_in_dir.toString().equals("king_of_hearts.png")){
                king_of_hearts_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
            /*    king_of_hearts.setImage(king_of_hearts_image);
                king_of_hearts.revalidate();
                king_of_hearts.repaint();
                System.out.println(king_of_hearts_image);*/


            }
            /*king of Spades*/
            else if(name_of_images_in_dir.toString().equals("king_of_spades.png")){
                king_of_spades_image = ImageIO.read(new File(dirPath+"\\"+name_of_images_in_dir));
             /*   king_of_spades.setImage(king_of_spades_image);
                king_of_spades.revalidate();
                king_of_spades.repaint();
                System.out.println(king_of_spades_image);*/


            }
             token = list_of_image_names[i].getName().split("([_^\\.])"); //REGEX CUT _ util .


            if (token[0].equals("2")) {
                token[0] = "two";
            } else if (token[0].equals("3")) {
                token[0] = "three";
            } else if (token[0].equals("4")) {
                token[0] = "four";
            } else if (token[0].equals("5")) {
                token[0] = "five";
            } else if (token[0].equals("6")) {
                token[0] = "six";
            } else if (token[0].equals("7")) {
                token[0] = "seven";
            } else if (token[0].equals("8")) {
                token[0] = "eight";
            } else if (token[0].equals("9")) {
                token[0] = "nine";
            } else if (token[0].equals("10")) {
                token[0] = "ten";
            }

            imageName = token[0].toString() + " of " + token[2].toString();
            List<SuitAndFace> deck = this.suitAndFace.newDeck();
            suitAndFace = deck.get(i);

            CardImage = new HashMap<SuitAndFace, CardImagePanel>();

            if(suitAndFace.toString().equals("ace of clubs")){
                CardImage.put(suitAndFace,ace_clubs);
                
            }
            else if(suitAndFace.toString().equals("ace of diamonds")){
                CardImage.put(suitAndFace,ace_diamonds);
                
            }
            else if(suitAndFace.toString().equals("ace of hearts")){
                CardImage.put(suitAndFace,ace_hearts);
                
            }
            else if(suitAndFace.toString().equals("ace of spades")){
                CardImage.put(suitAndFace,ace_spades);
                


            } else if(suitAndFace.toString().equals("two of clubs")){
                CardImage.put(suitAndFace,two_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("two of diamonds")){
                CardImage.put(suitAndFace,two_of_diamonds);

                
            }
            else if(suitAndFace.toString().equals("two of hearts")){
                CardImage.put(suitAndFace,two_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("two of spades")){
                CardImage.put(suitAndFace,two_of_spades);
                
            }


            else if(suitAndFace.toString().equals("three of clubs")){
                CardImage.put(suitAndFace,three_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("three of diamonds")){
                CardImage.put(suitAndFace,three_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("three of hearts")){
                CardImage.put(suitAndFace,three_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("three of spades")){
                CardImage.put(suitAndFace,three_of_spades);
                
            }

            else if(suitAndFace.toString().equals("four of clubs")){
                CardImage.put(suitAndFace,four_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("four of diamonds")){
                CardImage.put(suitAndFace,four_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("four of hearts")){
                CardImage.put(suitAndFace,four_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("four of spades")){
                CardImage.put(suitAndFace,four_of_spades);
                
            }

            else if(suitAndFace.toString().equals("five of clubs")){
                CardImage.put(suitAndFace,five_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("five of diamonds")){
                CardImage.put(suitAndFace,five_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("five of hearts")){
                CardImage.put(suitAndFace,five_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("five of spades")){
                CardImage.put(suitAndFace,five_of_spades);
                
            }

            else if(suitAndFace.toString().equals("six of clubs")){
                CardImage.put(suitAndFace,six_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("six of diamonds")){
                CardImage.put(suitAndFace,six_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("six of hearts")){
                CardImage.put(suitAndFace,six_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("six of spades")){
                CardImage.put(suitAndFace,six_of_spades);
                
            }

            else if(suitAndFace.toString().equals("seven of clubs")){
                CardImage.put(suitAndFace,seven_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("seven of diamonds")){
                CardImage.put(suitAndFace,seven_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("seven of hearts")){
                CardImage.put(suitAndFace,seven_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("seven of spades")){
                CardImage.put(suitAndFace,seven_of_spades);
                
            }

            else if(suitAndFace.toString().equals("eight of clubs")){
                CardImage.put(suitAndFace,eight_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("eight of diamonds")){
                CardImage.put(suitAndFace,eight_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("eight of hearts")){
                CardImage.put(suitAndFace,eight_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("eight of spades")){
                CardImage.put(suitAndFace,eight_of_spades);
                
            }

            else if(suitAndFace.toString().equals("nine of clubs")){
                CardImage.put(suitAndFace,nine_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("nine of diamonds")){
                CardImage.put(suitAndFace,nine_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("nine of hearts")){
                CardImage.put(suitAndFace,nine_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("nine of spades")){
                CardImage.put(suitAndFace,nine_of_spades);
                
            }

            else if(suitAndFace.toString().equals("ten of clubs")){
                CardImage.put(suitAndFace,ten_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("ten of diamonds")){
                CardImage.put(suitAndFace,ten_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("ten of hearts")){
                CardImage.put(suitAndFace,ten_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("ten of spades")){
                CardImage.put(suitAndFace,ten_of_spades);
                
            }

            else if(suitAndFace.toString().equals("jack of clubs")){
                CardImage.put(suitAndFace,jack_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("jack of diamonds")){
                CardImage.put(suitAndFace,jack_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("jack of hearts")){
                CardImage.put(suitAndFace,jack_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("jack of spades")){
                CardImage.put(suitAndFace,jack_of_spades);
                
            }

            else if(suitAndFace.toString().equals("queen of clubs")){
                CardImage.put(suitAndFace,queen_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("queen of diamonds")){
                CardImage.put(suitAndFace,queen_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("queen of hearts")){
                CardImage.put(suitAndFace,queen_of_hearts);
                
            }
            else if(suitAndFace.toString().equals("queen of spades")){
                CardImage.put(suitAndFace,queen_of_spades);
                
            }

            else if(suitAndFace.toString().equals("king of clubs")){
                CardImage.put(suitAndFace,king_of_clubs);
                
            }
            else if(suitAndFace.toString().equals("king of diamonds")){
                CardImage.put(suitAndFace,king_of_diamonds);
                
            }
            else if(suitAndFace.toString().equals("king of hearts")){
                CardImage.put(suitAndFace,king_of_hearts);

                
            }
            else if(suitAndFace.toString().equals("king of spades")){
                CardImage.put(suitAndFace,king_of_spades);
                
            }




            Set set = CardImage.entrySet();
            Iterator k = set.iterator();
            while (k.hasNext()) {


                Map.Entry suitFacepanel = (Map.Entry) k.next();

                System.out.println(suitFacepanel.getKey() + "  " + suitFacepanel.getValue());





                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == jButton) {
                            String suitValue = (String) suit.getSelectedItem();
                            String faceValue = (String) face.getSelectedItem();
                            String selection = faceValue + " of " + suitValue;


                            String image = faceValue + "_of_" + suitValue + ".png";

                            if (selection.toString().equals(suitFacepanel.getKey().toString())) {

                                for (int n = 0; n < CardImage.size(); n++) {
                                    if (suitFacepanel.getValue().equals(ace_clubs)) {
                                        imagePanel.setImage(ace_of_clubs_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(ace_diamonds)) {
                                        imagePanel.setImage(ace_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(ace_hearts)) {
                                        imagePanel.setImage(ace_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(ace_spades)) {
                                        imagePanel.setImage(ace_of_spades_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(king_of_clubs)) {
                                        imagePanel.setImage(king_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(king_of_diamonds)) {
                                        imagePanel.setImage(king_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(king_of_hearts)) {
                                        imagePanel.setImage(king_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(king_of_spades)) {
                                        imagePanel.setImage(king_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(queen_of_clubs)) {
                                        imagePanel.setImage(queen_of_clubs_image);
                                        add(imagePanel);

                                    } else if (suitFacepanel.getValue().equals(queen_of_diamonds)) {
                                        imagePanel.setImage(queen_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(queen_of_hearts)) {
                                        imagePanel.setImage(queen_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(queen_of_spades)) {
                                        imagePanel.setImage(queen_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(jack_of_clubs)) {
                                        imagePanel.setImage(jack_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(jack_of_diamonds)) {
                                        imagePanel.setImage(jack_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(jack_of_hearts)) {
                                        imagePanel.setImage(jack_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(jack_of_spades)) {
                                        imagePanel.setImage(jack_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(ten_of_clubs)) {
                                        imagePanel.setImage(ten_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(ten_of_diamonds)) {
                                        imagePanel.setImage(ten_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(ten_of_hearts)) {
                                        imagePanel.setImage(ten_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(ten_of_spades)) {
                                        imagePanel.setImage(ten_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(nine_of_clubs)) {
                                        imagePanel.setImage(nine_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(nine_of_diamonds)) {
                                        imagePanel.setImage(nine_of_diamonds_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(nine_of_hearts)) {
                                        imagePanel.setImage(nine_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(nine_of_spades)) {
                                        imagePanel.setImage(nine_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(eight_of_clubs)) {
                                        imagePanel.setImage(eight_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(eight_of_diamonds)) {
                                        imagePanel.setImage(eight_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(eight_of_hearts)) {
                                        imagePanel.setImage(eight_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(eight_of_spades)) {
                                        imagePanel.setImage(eight_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(seven_of_clubs)) {
                                        imagePanel.setImage(seven_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(seven_of_diamonds)) {
                                        imagePanel.setImage(seven_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(seven_of_hearts)) {
                                        imagePanel.setImage(seven_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(seven_of_spades)) {
                                        imagePanel.setImage(seven_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(six_of_clubs)) {
                                        imagePanel.setImage(six_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(six_of_diamonds)) {
                                        imagePanel.setImage(six_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(six_of_hearts)) {
                                        imagePanel.setImage(six_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(six_of_spades)) {
                                        imagePanel.setImage(six_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(five_of_clubs)) {

                                        imagePanel.setImage(five_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(five_of_diamonds)) {
                                        imagePanel.setImage(five_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(five_of_hearts)) {
                                        imagePanel.setImage(five_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(five_of_spades)) {
                                        imagePanel.setImage(five_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(four_of_clubs)) {
                                        imagePanel.setImage(four_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(four_of_diamonds)) {
                                        imagePanel.setImage(four_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(four_of_hearts)) {
                                        imagePanel.setImage(four_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(four_of_spades)) {
                                        imagePanel.setImage(four_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(three_of_clubs)) {
                                        imagePanel.setImage(three_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(three_of_diamonds)) {
                                        imagePanel.setImage(three_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(three_of_hearts)) {
                                        imagePanel.setImage(three_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(three_of_spades)) {
                                        imagePanel.setImage(three_of_spades_image);
                                        add(imagePanel);



                                    }
                                    else if (suitFacepanel.getValue().equals(two_of_clubs)) {
                                        imagePanel.setImage(two_of_clubs_image);
                                        add(imagePanel);


                                    } else if (suitFacepanel.getValue().equals(two_of_diamonds)) {
                                        imagePanel.setImage(two_of_diamonds_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(two_of_hearts)) {
                                        imagePanel.setImage(two_of_hearts_image);
                                        add(imagePanel);



                                    } else if (suitFacepanel.getValue().equals(two_of_spades)) {
                                        imagePanel.setImage(two_of_spades_image);
                                        add(imagePanel);



                                    }

                                    revalidate();
                                    repaint();



                                }

                            }

                        }
                    }
                });



        }







        }


    }




}
