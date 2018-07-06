import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {

@Test
public void doubleCharTest() {
    Controller m = new Controller();

    String inputTest = "Hi-There";
    assertEquals("HHii--TThheerree",m.doubleChar("Hi-There"));



    }

    @Test
    public void getSandwichTest(){

    String test ="xxxxhoneybreadjambreadhoneyxx";
    Controller x = new Controller();

    assertEquals("jam",x.getSandwich(test));
    }


    @Test
    public void evenlySpacedTest(){

        Controller m=  new Controller();
        int a=2;
        int b=4;
        int c=6;

        assertEquals(true,m.evenlySpaced(a,b,c));
    }
@Test
public void nTwice(){

        String test = "chocolate";
        Controller m = new Controller();

        assertEquals("choate",m.nTwice(test,3));
}

    @Test
    public void endslyTest(){
        Controller m = new Controller();

        String test = "eloquently";

        assertEquals(true,m.endsly(test));

    }

    @Test
    public void cleanStringTest(){

        Controller m = new Controller();
        String test = "yyzzza";

        assertEquals("yza",m.stringClean(test));
    }








}
