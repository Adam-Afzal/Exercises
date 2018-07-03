public abstract class  Ship {
    private int size;
    private int start_x;
    private int start_y;
    private String shipOrientiation;


    public Ship(int size, int start_x, int start_y, String shipOrientiation) {
        this.size = size;
        this.start_x = start_x;
        this.start_y = start_y;
        this.shipOrientiation = shipOrientiation;
    }


    public int getSize() {
        return size;
    }

    public int getStart_x() {
        return start_x;
    }

    public int getStart_y() {
        return start_y;
    }

    public String getShipOrientiation() {
        return shipOrientiation;
    }
}
