
import java.util.ArrayList;

public class IntegersList {
   public static void main(String [] args) {
      ArrayList<Integer> userVals = new ArrayList<Integer>();
      int i;

      userVals.add(3);
      userVals.add(4);
      userVals.add(7);

      userVals.set(1, userVals.get(0));
      userVals.set(0, userVals.get(1));

      for (i = 0; i < userVals.size(); ++i) {
         System.out.println(userVals.get(i));
      }
   }
}