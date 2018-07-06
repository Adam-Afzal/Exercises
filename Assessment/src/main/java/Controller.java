import java.lang.reflect.Array;
import java.util.ArrayList;

public class Controller {

    public static void main(String[] args) {




    }


    public String doubleChar(String input) {
String response="";
ArrayList<String> doubles = new ArrayList<>();

String[] splitted = input.split("");

for(String s: splitted){
    doubles.add(s);
    doubles.add(s);
}

for(String s:doubles){
    response+=s;
}

return response;

    }


    public String getSandwich(String input) {

        String[] splitted = input.split("bread");



        return splitted[1];
     }


    public boolean evenlySpaced(int a, int b, int c) {
        int max= 0;
        int min=0;
        int mid=0;

        if(a>b && a>c){
            max = a;
        } else if(b>a && b>c){

            max = b;
        } else if(c>a && c>b){

            max = c;
        }

        if(a<b && a<c){
            min=a;
        } else if(b<a && b<c){
min=b;

        } else if(c<a && c<b){

            min=c;
        }

        if((a>b && a<c) || (a>c && a<b)){
            mid=a;
        } else if((b>a && b<c) || (b>c && b<a)){
            mid=b;
        }  else if((c>a && c<b) || (c>b && c<a)){
        mid=c;
    }

        if(max-min==mid){
            return true;



        }







        return false;
        }

    public String nTwice(String input, int a) {

        return input.substring(0,a).concat(input.substring((input.length())-a));
    }


    public boolean endsly(String input) {
        if(input.charAt(input.length()-2) =='l' && input.charAt(input.length()-1) == 'y'){
            return true;
        }

        return false;
    }





    public String stringClean(String input) {



if(input.charAt(0) ==input.charAt(1)){
    String cut = input.substring(1,input.length());



    return stringClean(cut);
} else if(input.charAt(1)==input.charAt(2)){

    String cut = input.substring(0,1);
    String cut2 = input.substring(2,input.length());
String cut3 = cut + cut2;

    return stringClean(cut3);
}

        return input;




    }

    public int fibonacci(int input) {


        return 0;
    }


}
