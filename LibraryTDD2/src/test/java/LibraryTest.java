import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    Library l;

    @Before

    public void before() {

        l = new Library("Manchester", 12, "GG");

    }



    @Test
    public void addItem() {

        Newspaper n = new Newspaper("Daily Name", "JK Rowling");
        l.addItem(n);
        ArrayList<Item> itemsTest = l.getItems();
        assertEquals(1, itemsTest.size());


    }


    @Test
    public void addMemberTest() {

        Person p1 = new Person("Bruce Wayne", 25, "CEO");

        l.addMember(p1);
        ArrayList<Person> test1 = l.getMembers();

        assertEquals(1, test1.size());


    }

    @Test

    public void removeMemberTest() {
        Person p1 = new Person("Bruce Wayne", 25, "CEO");
        Person p2 = new Person("Sam Fisher", 35, "Agent");

        l.addMember(p1);

        l.addMember(p2);


        l.removeMember("Sam Fisher");

        ArrayList<Person> membersTest = l.getMembers();

        assertEquals(1, membersTest.size());


    }


    @Test
    public void updateMember(){

        Person p1 = new Person("Bruce Wayne", 25, "CEO");


        l.addMember(p1);





        ArrayList<Person> membersTest = l.getMembers();
        for(Person p: membersTest){
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getJobTitle());

        }
        l.updateMember("Bruce Wayne","Bruce Banner",35,"Scientist");

        ArrayList<Person> membersTest2 = l.getMembers();

        for(Person p: membersTest2){
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getJobTitle());

        }

    }

}
