import java.util.ArrayList;

public class Garage {

    int priceperhour;
int labourPrice = 0;

    ArrayList<Vehicle> customers = new ArrayList<Vehicle>();

    Garage(int price){
  this.priceperhour = price;
    }

    public ArrayList<String> calculatePrice(){

        ArrayList<String> responses = new ArrayList<>();

        for(Vehicle v : customers) {


            if (v instanceof Car) {

                this.labourPrice = (priceperhour + v.getWheels()) * ((Car) v).getdoors();
                responses.add("Price of the job for the " + ((Car)v).getName() + " " + v.getClass().getName() + " is: " + this.labourPrice);

            } else if (v instanceof Motorcycle) {

                this.labourPrice = (priceperhour + ((Motorcycle) v).getClutches()) * ((Motorcycle) v).getSeats();
                responses.add("Price of the job for the " + ((Motorcycle)v).getName() + " " + v.getClass().getName() + " is: " + this.labourPrice);
            }




        }

        return responses;

    }

    public void addCustomer(Vehicle v){
        customers.add(v);

    }

    public String findCustomer(String name){
        String result = "";
        for(Vehicle h: customers){

            if(h instanceof Car){


                if(((Car) h).getName() == name){
                    result =  "Name: " + ((Car) h).getName() + " doors: " + ((Car) h).getdoors() + " fuel type: " + ((Car) h).getFuelType();
                }



            }

            if(h instanceof Motorcycle){


                if(((Motorcycle) h).getName() == name){
                    result =  "Name: " + ((Motorcycle) h).getName() + " Seats: " + ((Motorcycle) h).getSeats() + " Clutches: " + ((Motorcycle) h).getClutches();
                }



            }
        }

        return result;



    }
}
