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

for(Person personTest: people){
    System.out.println(personTest);

}

        for(Person personNext: people){
            if(personNext.name.contains("Wayne")){

                System.out.println(personNext);
            }

        }


Garage g1 = new Garage(12);
Car c1 = new Car("Aygo",5,"Unleaded","1L",1200,4);
Motorcycle m1 = new Motorcycle("Ninja",4,6,"3L",1200,2);
g1.addCustomer(c1);
g1.addCustomer(m1);

System.out.println(g1.findCustomer("Aygo"));
System.out.println(g1.findCustomer("Ninja"));
ArrayList<String> prices = new ArrayList<String>();
prices = g1.calculatePrice();
for(String pric: prices){

    System.out.println(pric);
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
