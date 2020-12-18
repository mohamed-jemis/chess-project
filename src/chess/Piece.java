package chess;

public abstract class Piece {

    private boolean eaten  = false;
    public boolean white = false ;

    public Piece(boolean white) {
        this.white = white;
    }
     public abstract boolean MoveIsValid (Piece[][] board,Spot current_position , Spot new_position );
     
    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

   

}

