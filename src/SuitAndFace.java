import java.io.File;
import java.util.*;

/**
 * Created by rostom on 10/17/2015.
 */

enum Suit{diamonds, spades, clubs, hearts};

enum Face{king, queen, jack,ten,nine,eight,seven, six, five, four, three, two, ace };
public class SuitAndFace {


    Suit suit;
    Face face;
    private static final List<SuitAndFace> deck = new ArrayList<SuitAndFace>();

    public SuitAndFace(Suit suit, Face face){
        this.suit =suit;
        this.face =face;


        }
       static {
           for (Suit suit : Suit.values())
               for (Face face : Face.values())
                   deck.add(new SuitAndFace(suit, face));


       }


    public Suit getSuit(){
        return suit;
    }
    public  Face getFace(){
        return face;
    }

   public String toString() {
       return getFace() + " of " + getSuit();

   }
  public static ArrayList<SuitAndFace> newDeck(){
        return new ArrayList<SuitAndFace>(deck);
    }





}
