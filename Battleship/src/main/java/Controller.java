import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {

        int x_choice = 0;
        int y_choice = 0;

        Player player = new Player(1);
        Board board = new Board("Player",5,5);

        BoardHandler bh = new BoardHandler(board,player);





        board.createBoard();


        while(true){

            Scanner choice = new Scanner(System.in);
             x_choice = choice.nextInt();
            y_choice = choice.nextInt();

            Battleship b = new Battleship(x_choice,y_choice,"vertical");
            bh.addShipToBoard(b);


            board.getBoardState();





        }







    }

}
