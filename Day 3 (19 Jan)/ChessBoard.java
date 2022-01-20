// Write a method Boolean isKingSafe(int[][]chessBoard)
// Returns true if king in the given chess board is safe from the given enemies otherwise false;
// NOTE: Enemies are- Horse, Camel, Queen, Elephant only
// Do not consider the colour case of the chess board for traversal of camel and all.

//  Horse Moves = +/- (2+1(left/right))
//  Camel Moves = diagonals(left and right) X like shape
//  Elephant =  "+"  like shape 
//  Queen = both elephent and camel moves(X and +). 

public class ChessBoard {


    
 
    static boolean CamelMoves(char[][] board, char camel, int i, int j) {

      
       int index = 0;
       while (inRange(i + ++index, j + index)) {  // for the lower right diagonal

           if (board[i + index][j + index] == camel)
               return true;
           if (board[i + index][j + index] != '-')
               break;
       }

      
       index = 0;
       while (inRange(i + ++index, j - index)) {  // Check the lower left diagonal

           if (board[i + index][j - index] == camel)
               return true;
           if (board[i + index][j - index] != '-')
               break;
       }

     
       index = 0;
       while (inRange(i - ++index, j + index)) {    // upper right diagonal

           if (board[i - index][j + index] == camel)
               return true;
           if (board[i - index][j + index] != '-')
               break;
       }

       
       index = 0;
       while (inRange(i - ++index, j - index)) {   // upper left diagonal

           if (board[i - index][j - index] == camel)
               return true;
           if (board[i - index][j - index] != '-')
               break;
       }

       return false;
   }

    static boolean ElephantMoves(char[][] board,char elephant, int i, int j) {

       // for down
       int index = 0;
       while (inRange(i + ++index, j)) {
           if (board[i + index][j] == elephant)
               return true;
           if (board[i + index][j] != '-')
               break;
       }

       // for top
       index = 0;
       while (inRange(i + --index, j)) {
           if (board[i + index][j] == elephant)
               return true;
           if (board[i + index][j] != '-')
               break;
       }

       // for right
       index = 0;
       while (inRange(i, j + ++index)) {
           if (board[i][j + index] == elephant)
               return true;
           if (board[i][j + index] != '-')
               break;
       }

       // for left
       index = 0;
       while (inRange(i, j + --index)) {
           if (board[i][j + index] == elephant)
               return true;
           if (board[i][j + index] != '-')
               break;
       }
       return false;
   }

    static boolean HorseMoves(char[][] board,
           char horse, int i, int j) {

       int[] firstStep = { 2, 2, -2, -2, 1, 1, -1, -1 };
       int[] secStep = { 1, -1, 1, -1, 2, -2, 2, -2 };

       for (int k = 0; k < 8; k++) {

       
           int m = i + firstStep[k];
           int n = j + secStep[k];
           if (inRange(m, n) && board[m][n] == horse)
               return true;
       }
       return false;
   }
   
   static boolean QueenMoves(char[][] board, char queen, int i, int j) {

    if (CamelMoves(board, queen, i, j) || ElephantMoves(board, queen, i, j))
        return true;

    return false;
}

    static boolean inRange(int i, int j) {

        if (i >= 0 && i < 8 && j >= 0 && j < 8) {
            return true;
        }
        return false;
       
   }

   static boolean isKingSafe(char[][] board) {

       
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {

            if (board[i][j] == 'k') {
                
                
                if (HorseMoves(board, 'H', i, j))
                    return false;

                if (ElephantMoves(board, 'E', i, j))
                    return false;

                if (CamelMoves(board, 'C', i, j))
                    return false;

                if (QueenMoves(board, 'Q', i, j))
                    return false;

            }
        }
    }
    return true;
}

  
   public static void main(String[] args) {

 
       char[][] board = { 
               { '-', '-', '-', 'k', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', 'Q', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' } };

       
           System.out.println(isKingSafe(board)?"Safe":"not safe");
   }
}
