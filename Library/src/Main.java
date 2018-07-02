import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Newspaper n = new Newspaper("Daily Mail","JK Rowling");
        Library l = new Library("Manchester",12,"Oxford Road");
        l.items.add(n);
        Person p = new Person("Bruce",12,"CEO");
        Person p1 = new Person("Diana",12,"Cleaner");
        l.members.add(p);
        l.members.add(p1);
        l.checkoutItem(p,n,20);
        l.checkoutItem(p1,n,22);


        ArrayList<Rental> RENTALS = l.returnRentals();

        for(Rental r: RENTALS){

            System.out.println(r.getP().getName()+ " " + r.i.getItem_name() + " " + r.getDays());
        }

        l.checkInItem("Daily Mail","Diana");

        ArrayList<Rental> rentalsnew = l.returnRentals();

        for(Rental r: rentalsnew){

            System.out.println(r.getP().getName()+ " " + r.i.getItem_name() + " " + r.getDays());
        }
    }
}
