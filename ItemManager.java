public class ItemManager {
   public static void main(String[] args) {
      Item<Integer> itemInt = new Item<Integer>(30);
      Item<Character> itemChar = new Item<Character>('t');

      itemInt.updateCount(30); 
      itemInt.updateCount(6); 

      itemChar.updateCount('t'); 
      itemChar.updateCount('v'); 
   }
}