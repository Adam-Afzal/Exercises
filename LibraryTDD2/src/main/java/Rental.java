public class Rental {


    Person p;
    Item i;
    int days;

    public Rental(Person p, Item i, int days) {
        this.p = p;
        this.i = i;
        this.days = days;
    }


    public Person getP() {
        return p;
    }

    public Item getI() {
        return i;
    }

    public int getDays() {
        return days;
    }


}
