import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class Library implements Checkout {


    private String name;

    private int monthlyMembership;
    private String location;


    private ArrayList<Person> members = new ArrayList<>();
   private ArrayList<Item> items = new ArrayList<>();
   private ArrayList<Rental> rentals = new ArrayList<>();


    public Library(String n, int mem){
        this.name = n;
        this.monthlyMembership = mem;

    }

    public Library(String n, int mem, String loc){
        this.name = n;
        this.monthlyMembership = mem;
        this.location = loc;

    }





    public void addMember(Person p){



        members.add(p);
    }



    public void removeMember(String name){

        Iterator<Person> itr = members.iterator();
        while(itr.hasNext()){

            Person p3 = itr.next();

            if(p3.getName().equals(name)){
                itr.remove();
            }


        }






    }

    public ArrayList<Person> getMembers(){

        return this.members;
    }


    @Override
    public void checkoutItem(Person p, Item i, int days) {

        Rental r = new Rental(p,i,days);
        rentals.add(r);

    }

    public ArrayList<Rental> returnRentals(){

        return this.rentals;
    }


    @Override
    public void checkInItem(String iName, String pName) {
        for (Rental r: rentals){

            if((r.i.getItem_name().equals(iName)) && (r.p.getName().equals(pName)) ){

                rentals.remove(r);
            }
        }

    }

    @Override
    public void addItem(Item i) {
        items.add(i);
    }

    public ArrayList<Item> getItems(){

        return this.items;


    }

    @Override
    public void removeItem(String name) {

        for(Item i: items){

            if (i.getItem_name().equals(name)){
                items.remove((i));
            }

        }

    }

    @Override
    public void updateItem(String Name, String newName, int newAge, String newJob) {

    }


    public void updateMember(String Name,String newName, int newAge, String newJob) {
        Iterator<Person> itr = members.iterator();
        while(itr.hasNext()){

            Person p3 = itr.next();

            if(p3.getName().equals(Name)){
                p3.setName(newName);
                p3.setAge(newAge);
                p3.setJobTitle(newJob);
            }


        }
    }
}
