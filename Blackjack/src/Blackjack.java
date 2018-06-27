public class Blackjack {


    public static int closestTo21(int a, int b){

        int result = 0;

        if(a==21){
            result = a;
        } else if(b==21){
            result = b;
        }else if(a > 21 && b > 21){
            result = 0;
        } else if(a > 21 && b<=21){
            result = b;

        } else if(a<= 21 && b>21){
            return a;
        } else{
            if(21-a <  21-b){
                return a;
            } else{
                return b;
            }
        }


        return result;

    }
}
