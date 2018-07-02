import org.junit.Before;
import org.junit.Test;

public class LibraryClassTest {
Library l;
Member m1;
    @Before
    public void instantiatingObjects(){

        l  = new Library();
        m1 = new Member();
    }


    @Test
    public void addItem(){
       Newspaper n = new Newspaper();
       l.addItem(n);
       assertEquals(1,l.items.size());



    }



    @Test
    public void addMember(){

        l.addMember(m1);


    }


}
