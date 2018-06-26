import java.util.ArrayList;

public class PaintManager {

    ArrayList<Paint> paints = new ArrayList<>();

    int roomSize;

    PaintManager(int room){
        this.roomSize = room;


    }
public void addPaint(Paint p){

        paints.add(p);


}



    public String cheapestPaint(){

        Paint value = null;

        double cheapest = 0;

        for(Paint p: paints){
            int numberofTins = (int) Math.ceil(roomSize/p.getCov());
            double priceOfPaint = numberofTins * p.getPrice();

            if(cheapest ==0){

                cheapest = priceOfPaint;
                value = p;
            } else if(priceOfPaint < cheapest){

                cheapest = priceOfPaint;
                value = p;

            }


        }

        return "The cheapest paint is " + value.getName();
    }
}
