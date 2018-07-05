import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        String Sentence = in.nextLine();
        int length = Sentence.length();





        String[] splitted = Sentence.split(" ");
        StringBuilder temp = new StringBuilder(splitted[0]);
        System.out.println(temp.charAt(temp.length()-1));

        for(int i=0;i<splitted.length;i++){

       try {


           StringBuilder sb = new StringBuilder(splitted[i]);
           for(int j=sb.length()-1;j==0;j--){
               try{

                   StringBuilder sb2 = new StringBuilder(splitted[i+1]);

                   try {


                        for(int p=0;p<sb2.length()-1;p++){
                            if ((sb.charAt(j) == sb2.charAt(p)) && (sb.charAt(j+1) == sb2.charAt(p+1))) {


                                StringBuilder sb3 = new StringBuilder();
                                sb3.setCharAt(j+1,sb2.charAt(i-1));
                                sb3.append(sb.charAt(i));
                                System.out.println(sb3.toString());

                            }

                        }



                   }catch(StringIndexOutOfBoundsException sioob2){

                       continue;
                   }

               }catch(ArrayIndexOutOfBoundsException aioobe){

break;
               }
           }


       }catch (StringIndexOutOfBoundsException sioobe){
continue;

            }

            // StringBuilder sb = new StringBuilder(splitted[i]);
            // System.out.println(sb.charAt(3));



            System.out.println();
        }






    }



}
