public class Car  extends Vehicle{
    int doors;
    String fuelType;

    Car(int d, String f, String e, int t, int w){
        super(e,t,w);
        this.doors = d;
        this.fuelType = f;


    }

    public String getFuelType(){

        return this.fuelType;
    }
}
