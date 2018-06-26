import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Main form = new Main();

System.out.println(form.closestTo21(2, 10));
        System.out.println(form.uniqueSum(3, 1,1));
System.out.println(form.weatherCheck(20,false));
Person p = new Person("Bruce Wayne","25","CEO of Wayne Industries");
Person p2 = new Person("Bruce Banner","35","GAMMA LABS");

ArrayList<Person> people = new ArrayList<Person>();

people.add(p);
people.add(p2);

for(Person p1: people){
    System.out.println(p1);

}

        for(Person p1: people){
            if(p1.name.contains("Wayne")){

                System.out.println(p1);
            }

        }




    }


    public int closestTo21(int a, int b){

        int result = 0;

        if((21 - a) < (21 - b)){

            result = a;
        } else if((21-a) > (21 - b)){

            result = b;
        } else{

            result = 0;
        }
return result;

    }


    public int uniqueSum(int a, int b, int c){
int result = 0;
        if((a == b && a==c && b==c)) {

            return 0;


        }else if(a==b){
            result = c;
            return result;
        }else if(a==c) {

            result = b;
            return result;

        }else if(b==c){
            result = a;
            return result;
        } else{
            result = a + b + c;
            return result;

        }

    }


    public boolean weatherCheck(int temp, boolean isSummer) {
        if (isSummer) {

            if (temp > 60 && temp <= 100) {

                return true;
            }


        } else {


            if(temp > 60 && temp <= 90){
                return true;
        }





        }
return false;
    }






}
