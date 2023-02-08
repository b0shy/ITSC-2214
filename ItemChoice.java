
public class ItemChoice {

   public static <T extends Comparable<T>>
   T chooseItem(T item1, T item2, T item3) {
      T chosenItem = item1;

      if (item2.compareTo(chosenItem) < 0) {
         chosenItem = item2;
      }
      if (item3.compareTo(chosenItem) < 0) {
         chosenItem = item3;
      }
      return chosenItem;
   }

   public static void main(String[] args) {
      Integer i1 = 9;
      Integer i2 = 2;
      Integer i3 = 3;

      Character c1 = 'y';
      Character c2 = 'o';
      Character c3 = 'v';

      String s1 = "purple";
      String s2 = "khaki";
      String s3 = "cyan";

      System.out.println(chooseItem(c1, c2, c3));
      System.out.println(chooseItem(i1, i2, i3));
      System.out.println(chooseItem(s1, s2, s3));
   }
}