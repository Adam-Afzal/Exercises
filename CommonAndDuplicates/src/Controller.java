import java.util.ArrayList;

public class Controller {

    public static String s1 = "sassyi";
    public static String s2 = "sassyiiiiiiii";
    public static ArrayList<Character> commonChars = new ArrayList<>();
   public static ArrayList<Character> noDuplicates = new ArrayList<>();


    public static void main(String[] args) {
        for(int i=0;i<s1.length();i++){

            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){

                    commonChars.add(s1.charAt(i));
                }

            }
        }

        for(char c: commonChars){

            if(noDuplicates.contains(c)){


            } else{

                noDuplicates.add(c);
                System.out.println(c);
            }
        }

        String[] splitted = s1.split("");
        for(String s: splitted){

        }
    }
}
