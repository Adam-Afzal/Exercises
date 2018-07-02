
public class UniqueSum {

    public UniqueSum(){

    }


    public int uniqueSum(int a, int b, int c) {
        int result = 0;
        if ((a == b && a == c && b == c)) {

            return 0;


        } else if (a == b) {
            result = c;
            return result;
        } else if (a == c) {

            result = b;
            return result;

        } else if (b == c) {
            result = a;
            return result;
        } else {
            result = a + b + c;
            return result;

        }
    }


}
