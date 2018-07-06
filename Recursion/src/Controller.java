public class Controller {

    int factorialNumber = 5;


    public static void main(String[] args) {
        Controller x = new Controller();

        System.out.println(x.factorial(x.factorialNumber));

    }


    public int factorial(int x){

        if(x==0){

            return 1;


        }
        if(x>0){

            return x*factorial(x-1);


        }

        return 0;
    }
}
