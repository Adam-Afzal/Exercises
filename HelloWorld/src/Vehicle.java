public abstract class Vehicle {

    String engineType;
    int tax;
    int wheels;
    Vehicle(String et, int t, int w){

this.engineType = et;
this.tax = t;
this.wheels = w;


    }



    public int getTax(){

        return this.tax;
    }


    public int getWheels(){

        return this.wheels;
    }


}
