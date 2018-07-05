
import org.junit.Test;


import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class BattleshipTest {

    @Test
    public void makeBoardTest(){



      Board board = new Board();
              assertEquals(3,board.getBoardSize());

    }
    @Test
    public void addShipToBoardTest(){

      //  PatrolBoat pat = new PatrolBoat(0,1,"Horizontal", 3);
        Player player = new Player(1);
        Destroyer des = new Destroyer(0,0,0,"Horizontal");
        Board board = new Board(3,3);
        BoardHandler bh = new BoardHandler(board,player);
        bh.add(des);





    }

    @Test
    public void fireTest(){
        Player player = new Player(1);
        Board board = new Board();
        Destroyer des = new Destroyer(0,0,0,"Horizontal");
        Board board = new Board(3,3);
        BoardHandler bh = new BoardHandler(board,player);
        bh.add(des);

        assertEquals("s",bh.fire(0,0));




    }

    @Test




}
