import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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

    }
}
