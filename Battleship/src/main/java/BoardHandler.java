public class BoardHandler {

    Board board;
    Player player;

    public BoardHandler(Board board, Player player) {
        this.board = board;
        this.player = player;
    }


   public void addShipToBoard(Ship s){

//        if(s.getShipOrientiation().toLowerCase().equals("horizontal")){
//            if(bh.board.getOccupationState(s.getStart_x,0) == 'b'
//
//       }



           this.board.setBoardState(s, 's');












   }
}
