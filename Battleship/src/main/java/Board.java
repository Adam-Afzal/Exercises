public class Board {


    private String boardName;
    private char[][] shipField;

    private int size_x;
    private int size_y;


    public Board(String bName, int size_x, int size_y) {
        this.size_x = size_x;
        this.size_y = size_y;
        this.boardName = bName;

        this.shipField = new char[size_x][size_y];

    }

    public void createBoard(){
        for(int i=0;i<this.size_x;i++){
            for(int j=0; j<this.size_y;j++){

                this.shipField[i][j] = 'x';

            }


        }

    }

    public char getOccupationState(int x, int y) {

        return this.shipField[x][y];
    }

    public String getBoardName(){

        return this.boardName;
    }

    public void getBoardState(){

        for(int i=0;i<this.size_x;i++){
            for(int j=0; j<this.size_y;j++){


                System.out.print("[" + this.shipField[i][j] +"]");
            }

            System.out.println();
        }
    }

    public void setBoardState(Ship s, char ship){



        if(s.getShipOrientiation().toLowerCase().equals("horizontal")){


            if(s.getStart_y()+ s.getSize() > this.size_x){

                System.out.println("Ship falls off the board. Pick somewhere else!");
            } else {


                this.shipField[s.getStart_x()][s.getStart_y()] = ship;

                for (int i = s.getStart_y(); i < s.getStart_y() + s.getSize(); i++) {

                    this.shipField[s.getStart_x()][i] = ship;
                }

            }







        } else if(s.getShipOrientiation().toLowerCase().equals("vertical")){



            if(s.getStart_x()+ s.getSize() > this.size_y){

                System.out.println("Ship falls off the board. Pick somewhere else!");
            } else {


                this.shipField[s.getStart_x()][s.getStart_y()] = ship;

                for (int i = s.getStart_x(); i < s.getStart_x() + s.getSize(); i++) {

                    this.shipField[i][s.getStart_y()] = ship;
                }

            }
        }
    }
}
