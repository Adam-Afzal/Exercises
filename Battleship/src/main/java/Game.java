import java.util.Scanner;

public class Game {




    public void begin(){

        int x_choice = 0;
        int y_choice = 0;
        String ori = "";
        String type="";

        Player player = new Player(1);
        Board board = new Board("Player",5,5);

        BoardHandler bh = new BoardHandler(board,player);





        board.createBoard();


        while(true){

            Scanner choice = new Scanner(System.in);
            x_choice = choice.nextInt();
            y_choice = choice.nextInt();
            ori = choice.next();
            type = choice.next().toLowerCase();

            switch(type){
                case "battleship":
                    Battleship b = new Battleship(x_choice,y_choice,ori);
                    bh.addShipToBoard(b);

                    break;
            }





            board.getBoardState();





        }



    }

}
