public class Car  extends Vehicle{
    String name;
    int doors;
    String fuelType;

    Car(String n,int d, String f, String e, int t, int w){
        super(e,t,w);
        this.name = n;
        this.doors = d;
        this.fuelType = f;


    }
public String getName() {
    return this.name;
}
    public String getFuelType(){

        return this.fuelType;
    }

    public int getdoors(){

        return this.doors;
    }
}
