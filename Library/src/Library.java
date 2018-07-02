import java.util.ArrayList;

public class Library implements Checkout{

    private String name;

    private int monthlyMembership;
    private String location;


ArrayList<Person> members = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Rental> rentals = new ArrayList<>();


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
        for(Person p: members){

            if (p.getName().equals(name)){
                members.remove(p);
            }

        }



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

    @Override
    public void removeItem(String name) {

        for(Item i: items){

            if (i.getItem_name().equals(name)){
                items.remove((i));
            }

        }

    }

    @Override
    public void updateItem(String Name) {
for(Item i: items){

    i.setItem_name(Name);


}
    }
}
