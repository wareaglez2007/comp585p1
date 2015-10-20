/**
 * Created by rostom on 10/15/2015.
 */
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class getImageNames  {
    private File folder;
    String path;
    public getImageNames(){
        path ="C:\\Users\\rostom\\Downloads\\PNG-cards-1.3\\PNG-cards-1.3";
        folder = new File(path);

        File[] listofImages = folder.listFiles();
        for(int i=0; i<listofImages.length; i++){
            if(listofImages[i].isFile()){
              ///  System.out.println("File "+listofImages[i].getName());
            }


            String[] token = listofImages[i].getName().split("([_^\\.])"); //REGEX CUT _ util .


            HashMap<String, String > SuitAndFace = new HashMap<String, String>();

            SuitAndFace.put(token[0],token[2]);

            Set set = SuitAndFace.entrySet();

            Iterator k = set.iterator();
            while (k.hasNext()){
                Map.Entry me = (Map.Entry)k.next();
                System.out.println("Key is: " + me.getKey()+ "  value is "+me.getValue());

            }

        }

    }

}
