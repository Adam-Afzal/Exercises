public class Board {



    private char[][] shipField;

    private int size_x;
    private int size_y;


    public Board(int size_x, int size_y) {
        this.size_x = size_x;
        this.size_y = size_y;

        this.shipField = new char[size_x][size_y];

    }

    public void createBoard(){
        for(int i=0;i<this.size_x;i++){
            for(int j=0; j<this.size_y;j++){

                this.shipField[i][j] = 'x';
                System.out.print("[" + this.shipField[i][j] +"]");
            }

            System.out.println();
        }

    }

    public void getBoardState(){

        for(int i=0;i<this.size_x;i++){
            for(int j=0; j<this.size_y;j++){


                System.out.print("[" + this.shipField[i][j] +"]");
            }

            System.out.println();
        }
    }

    public void setBoardState(char ship){

        for(int i=0;i<this.size_x;i++){
            for(int j=0; j<this.size_y;j++){

                this.shipField[i][j] = ship;
                System.out.print("[" + this.shipField[i][j] +"]");
            }

            System.out.println();
        }
    }
}
