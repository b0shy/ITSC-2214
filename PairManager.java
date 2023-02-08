public class PairManager {
   public static void main(String[] args) {
      Pair<Integer> twoInts = new Pair<Integer>(11, 22); 
      Pair<Double> twoDbls = new Pair<Double>(49.3, 34.4);
      Pair<Character> twoChars = new Pair<Character>('a', 't');

      System.out.println(twoInts.chooseItem());
      System.out.println(twoDbls.chooseItem());
      System.out.println(twoChars.chooseItem());
   }
}