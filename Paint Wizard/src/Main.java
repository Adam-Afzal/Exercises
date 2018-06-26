public class Main {

    public static void main(String[] args) {
        Paint cheapoMax = new Paint("CheapoMax",20,19.99,10);
        Paint averageJoes = new Paint("Average Joes",15,17.99,11);
        Paint duluxuriousPaint = new Paint("Duluxurious Paint",10,25.00,20);

        PaintManager managerOne = new PaintManager(100);
        managerOne.addPaint(cheapoMax);
        managerOne.addPaint(averageJoes);
        managerOne.addPaint(duluxuriousPaint);
        System.out.println(managerOne.cheapestPaint());
    }





}
