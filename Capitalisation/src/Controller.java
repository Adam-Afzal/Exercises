public class Controller {

    public static void main(String[] args) {
        String s = "you are short";

        String t = "";

        String[] splitted = s.split(" ");

        for(int i=0;i<splitted.length;i++){

            //splitted[i] = Character.toUpperCase(splitted[i].charAt(0)) + splitted[i].substring(1); Here are we capitalising every first letter of every word
            splitted[i] = splitted[i].substring(0,splitted[i].length()-1) + Character.toUpperCase(splitted[i].charAt(splitted[i].length()-1)); //capitalising every last letter of every word

            t+=splitted[i] + " ";

        }

        System.out.println(t);
    }
}
