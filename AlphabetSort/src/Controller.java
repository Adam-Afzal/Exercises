import java.util.ArrayList;

public class Controller {

    public static void main(String[] args) {
        char[] alphabetOrder = {'a','b','c','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        String ab = "abcdefghijlkmnopqrstuvxyz";
        String s = "i am adam";

        String[] splitted = s.split(" ");

        ArrayList<String> sList = new ArrayList<>();

        //through my array
        //add things to list
        //sort list


        for(String s6: splitted){

            sList.add(s6);
        }

        sList.sort(String::compareToIgnoreCase);

        for (String s5: sList){

            System.out.println(s5);
        }




//       for(int i=0;i<s.length();i++){
//           for(int j=0;j<s.length();j++){
//
//if(ab.indexOf(s.charAt(i)) < ab.indexOf(s.charAt(j))){
//
//    s.replace(s)
//
//}
//           }
//
//       }
    }
}
