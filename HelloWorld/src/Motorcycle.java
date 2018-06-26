public class Motorcycle extends Vehicle {

    int seats;
    int clutches;

    Motorcycle(int se, int cl, String e, int t, int w) {

        super(e,t,w);

        this.seats = se;
        this.clutches = cl;


    }

    public int getSeats(){

        return this.seats;
    }

    public int getClutches(){

        return clutches;
    }
}
