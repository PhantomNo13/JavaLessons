import java.util.*;

public class HaziqTicTacToe
{
    static ArrayList<Integer> availableMoves = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char board[][]={{' ', '|', ' ','|',' '}, {'-','+','-','+','-'},{' ', '|', ' ','|',' '},{'-','+','-','+','-'},{' ', '|', ' ','|',' '},};
        Board b = new Board();
        b.displayBoard(board);

        System.out.println("Enter Pos(1-9)");
        int count = 0;

        Random rand = new Random();
        while (count<9) {
            int countPlayer = 0;
            int countCPU = 0;

            while(countPlayer<1) {
                int playerPos = scan.nextInt();
                int a = b.checkWinningState(board, "Player");
                    if (a >= 1) {
                        countPlayer++;
                        countCPU++;
                        count+=10;
                        b.displayBoard(board);
                        System.exit(0);
                    }
                 else if(playerPos>=10||playerPos<=0)
                {
                    System.out.println("Invalid position");
                }

                    else if (availableMoves.get(playerPos - 1) == 0) {
                        System.out.println("Invalid position");
                    }
                    else {
                        b.insertChar(board, playerPos, "Player");
                        b.displayBoard(board);
                        availableMoves.set(playerPos - 1, 0);
                        countPlayer++;
                        count++;

                    }


            }


            while(countCPU<1) {

                int cpuposition = scan.nextInt();
                int c = b.checkWinningState(board, "CPU");

                if(c>=1)
                {
                    countCPU++;
                    countPlayer++;
                    count+=10;
                    b.displayBoard(board);

                }
                else if (availableMoves.get(cpuposition - 1) == 0) {
                    System.out.println("Invalid position");
                }
                    else{
                        b.insertChar(board, cpuposition, "CPU");
                        b.displayBoard(board);
                        availableMoves.set(cpuposition-1,0);

                        countCPU++;
                        count++;
                    }
            }


        }
        System.out.println("END OF GAME MAFAKAS");
    }
}


class Board
{
    enum XO{
        X,O
    }
    /*
    public static void winningCondition() {
        List toprow = Arrays.asList(1, 2, 3);
        List midrow = Arrays.asList(4, 5, 6);
        List botrow = Arrays.asList(7, 8, 9);
        List fircol = Arrays.asList(1, 4, 7);
        List seccol = Arrays.asList(2, 5, 8);
        List thicol = Arrays.asList(3, 6, 9);
        List diag1 = Arrays.asList(1, 5, 9);
        List diag2 = Arrays.asList(3, 5, 7);


        ArrayList<List> winningcond = new ArrayList<List>();
        winningcond.add(toprow);
        winningcond.add(midrow);
        winningcond.add(botrow);
        winningcond.add(fircol);
        winningcond.add(seccol);
        winningcond.add(thicol);
        winningcond.add(diag1);
        winningcond.add(diag2);
    }

     */


    static void displayBoard(char board[][])
    {
        for (char row[] : board)
        {
            for (char x : row)
            {
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    static int checkWinningState(char board[][], String ptype)
    {

        int P1score=0;
        int endGame = 0;
        int stalemate=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]!=' ')
                {
                    stalemate++;
                }

            }

        }

        for (int i = 0; i < board.length; i++) {
            if (i % 2 != 1) {
                if (board[i][i] != ' ') {
                    System.out.println("checking");

                    if (board[i][0] == board[i][2] && board[i][2] == board[i][4]) {
                        if (ptype.equals("Player")) {
                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        endGame++;
                    } else if (board[0][i] == board[2][i] && board[2][i] == board[4][i]) {
                        if (ptype.equals("Player")) {

                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        endGame++;
                    } else if (board[0][0] == board[2][2] && board[4][4] == board[2][2]) {
                        if (ptype.equals("Player")) {
                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        endGame++;
                    } else if (board[4][0] == board[2][2] && board[0][4] == board[2][2]) {
                        if (ptype.equals("Player")) {

                            System.out.println("Player 1 wins");
                        } else {
                            System.out.println("Player 2 wins");
                        }
                        endGame++;
                    } else if (stalemate == 25) {
                        endGame++;
                        System.out.println("Lel, stalemate");

                    }
                }
            }
        }











/*
        if(board[2][0]=='o'&&board[2][2]=='o'&&board[2][4]=='o') {
            System.out.println("Player 2 Wins");
            endGame++;
        }
            else if(board[4][0]=='o'&&board[4][2]=='o'&&board[4][4]=='o') {
            System.out.println("Player 2 Wins");
            endGame++;
        }
                else if(board[0][0]=='o'&&board[0][2]=='o'&&board[0][4]=='o')
                {
                    System.out.println("Player 2 Wins");
                    endGame++;
                }
                else if(board[0][0]=='o'&&board[2][0]=='o'&&board[4][0]=='o')
                {
                    System.out.println("Player 2 Wins");
                    endGame++;
                }
            else if(board[0][2]=='o'&&board[2][2]=='o'&&board[4][2]=='o')
            {
                System.out.println("Player 2 Wins");
                endGame++;
            }
            else if(board[0][4]=='o'&&board[2][4]=='o'&&board[4][4]=='o')
            {
                System.out.println("Player 2 Wins");
                endGame++;
            }
        else if(board[0][0]=='o'&&board[2][2]=='o'&&board[4][4]=='o')
        {
            System.out.println("Player 2 Wins");
            endGame++;
        }
        else if(board[4][0]=='o'&&board[2][2]=='o'&&board[0][4]=='o')
        {
            System.out.println("Player 2 Wins");
            endGame++;
        }
        else if(board[2][0]=='x'&&board[2][2]=='x'&&board[2][4]=='x') {
            System.out.println("Player 1 Wins");
            endGame++;
        }
        else if(board[4][0]=='x'&&board[4][2]=='x'&&board[4][4]=='x') {
            System.out.println("Player 1 Wins");
            endGame++;
        }
        else if(board[0][0]=='x'&&board[0][2]=='x'&&board[0][4]=='x')
        {
            System.out.println("Player 1 Wins");
            endGame++;
        }
        else if(board[0][0]=='x'&&board[2][0]=='x'&&board[4][0]=='x')
        {
            System.out.println("Player 1 Wins");
            endGame++;
        }
        else if(board[0][2]=='x'&&board[2][2]=='x'&&board[4][2]=='x')
        {
            System.out.println("Player 1 Wins");
            endGame++;
        }
        else if(board[0][4]=='x'&&board[2][4]=='x'&&board[4][4]=='x')
        {
            System.out.println("Player 1 Wins");
            endGame++;
        }


                else if (stalemate == 25) {
                endGame++;
                System.out.println("Lel, stalemate");
                }

 */



        /*else if(board[0][0]!=' '&& board[0][2]!=' '&& board[0][4]!=' '&& board[2][0]!=' '&& board[2][2]!=' '&& board[2][4]!=' '&& board[4][0]!=' '&& board[4][2]!=' '&& board[4][4]!=' ')
        {
            System.out.println("No one wins :<");
            endGame++;
        }*/





        return endGame;
    }
    static void insertChar(char board[][], int playerPos, String ptype)
    {
        char c = ' ';
        if(ptype.equals("Player"))
        {
            c = 'x';
        }
        else if(ptype.equals("CPU"))
        {
            c = 'o';
        }
        switch (playerPos)
            {
                case 1:
                    board[0][0] = c;

                    break;

                case 2:

                        board[0][2] = c;

                    break;

                case 3:
                    board[0][4] = c;


                    break;

                case 4:

                        board[2][0] = c;


                    break;

                case 5:

                        board[2][2] = c;

                    break;


                case 6:

                        board[2][4] = c;

                    break;

                case 7:

                        board[4][0] = c;

                    break;
                case 8:

                        board[4][2] = c;

                    break;

                case 9:

                        board[4][4] = c;

                    break;

                default:
                    System.out.println("Invalid position");
                    break;



            }
        }
    }







