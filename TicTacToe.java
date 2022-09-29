import java.util.*;
public class TicTacToe {
    String board[][] = new String[3][3];

    TicTacToe(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=" ";
            }
        }
    }
    public String winnerCheck(){
    for(int i=0;i<8;i++){
        String line="";
        switch(i){
            case 0:
            line = board[0][0]+board[0][1]+board[0][2];
            break;

            case 1:
            line = board[1][0]+board[1][1]+board[1][2];
            break;

            case 2:
            line = board[2][0]+board[2][1]+board[2][2];
            break;

            case 3:
            line = board[0][0]+board[1][1]+board[2][2];
            break;

            case 4:
            line = board[0][2]+board[1][1]+board[2][0];
            break;

            case 5:
            line = board[0][0]+board[1][0]+board[2][0];
            break;

            case 6:
            line = board[0][1]+board[1][1]+board[2][1];
            break;

            case 7:
            line = board[0][2]+board[1][2]+board[2][2];
            break;
        }
        if(line.equals("XXX"))
            return "X";
        else if(line.equals("OOO"))
            return "O";
    }
    return "1";
}
    public boolean inputValidationCheck(int pos, int player){
        String element="";
        int x=0,y=0;
        switch(pos){
            case 7:
            element = board[0][0];
            x=0; y=0;
            break;
            
            case 8:
            element = board[0][1];
            x=0; y=1;
            break;

            case 9:
            element = board[0][2];
            x=0; y=2;
            break;

            case 4:
            element = board[1][0];
            x=1; y=0;
            break;

            case 5:
            element = board[1][1];
            x=1; y=1;
            break;

            case 6:
            element = board[1][2];
            x=1; y=2;
            break;

            case 1:
            element = board[2][0];
            x=2; y=0;
            break;

            case 2:
            element = board[2][1];
            x=2; y=1;
            break;

            case 3:
            element = board[2][2];
            x=2; y=2;
            break;
        }
        if(element == " "){
            if(player == 0)
            board[x][y]="X";
            else
            board[x][y]="O";
            return true;
        }
        else{
            return false;
        }
    }


    public void display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==1){
                    System.out.print(" | "+board[i][j]+" | ");
                }
                else{
                    System.out.print(board[i][j]);
                }
            }
            if(i!=2)
            System.out.println("\n---------");
        }
    }
    public static void main(String[] args) {
        TicTacToe t1 = new TicTacToe();
        t1.display();
    }
    
}

