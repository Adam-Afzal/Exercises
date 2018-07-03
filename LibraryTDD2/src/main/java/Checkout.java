public interface Checkout {

    public void checkoutItem(Person p, Item i, int days);
    public void checkInItem(String iName, String pName);
    public void addItem(Item i);
    public void removeItem(String name);
    public void updateItem(String Name,String newName, int newAge, String newJob);
}
