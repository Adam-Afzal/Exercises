public class Paint {
    int size;
    double price;
    int coveragePerM2;
    String name;

    Paint(String n, int s, Double p, int cov){

        this.size = s;
        this.price = p;
        this.coveragePerM2 = cov;

        this.name = n;

    }

    public String getName(){

        return this.name;
    }
    public int getSize(){

        return this.size;

    }

    public double getPrice(){

        return this.price;

    }


    public int getCov(){

        return this.coveragePerM2;

    }









}
