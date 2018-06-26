public class Motorcycle extends Vehicle {
    String name;

    int seats;
    int clutches;

    Motorcycle(String n,int se, int cl, String e, int t, int w) {

        super(e,t,w);
this.name = n;
        this.seats = se;
        this.clutches = cl;


    }
public String getName(){

        return this.name;
}
    public int getSeats(){

        return this.seats;
    }

    public int getClutches(){

        return clutches;
    }
}
