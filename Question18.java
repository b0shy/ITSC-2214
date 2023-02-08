public class Question18{

    public static void main(String[] args) {

        System.out.println(isPalindromic("Mom"));

    }

    public static int isPalindromic(String str){

        String strUpper = str.toUpperCase();

        if (strUpper == null) 
        return -1;
        int len  = strUpper.length();
        
        for (int i=0;i<len/2 ; i++){
            if (strUpper.charAt(i) != strUpper.charAt(len - i - 1)){
                return 0;
            }
        }       
    
            return 1;
    }

}