import java.util.*;

public class Question21 {
    
    public ArrayList<String> reverse(String[] wizards) throws Exception{

        if(wizards.length == 0) throw new Exception("Wizards list is empty");

        ArrayList<String> reverseList = new ArrayList<String>();

        for(int i = wizards.length-1; i>=0; i--) reverseList.add(wizards[i]);

        return reverseList;

    }
    public static void main(String[] args) {
        
        Question21 t = new Question21();

        String[] wizards = {"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"};

        ArrayList<String> reverseWizard = new ArrayList<String>();
        
        try{
            reverseWizard = t.reverse(wizards);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println(reverseWizard);

    }

}
