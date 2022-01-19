// Write a method Boolean isKingSafe(int[][]chessBoard)
// Returns true if king in the given chess board is safe from the given enemies otherwise false;
// NOTE: Enemies are- Horse, Camel, Queen, Elephant only
// Do not consider the colour case of the chess board for traversal of camel and all.

//  Horse Moves = +/- (2+1(left/right))
//  Camel Moves = diagonals(left and right) X like shape
//  Elephant =  "+"  like shape 
//  Queen = both elephent and camel moves(X and +). 

public class ChessBoard {


    static boolean isKingSafe(char[][] board) {

       
       for (int i = 0; i < 8; i++) {
           for (int j = 0; j < 8; j++) {

               if (board[i][j] == 'k') {

                   if (lookForHourse(board, 'H', i, j))
                       return false;

                   if (lookForElep(board, 'E', i, j))
                       return false;

                   if (lookForCamel(board, 'C', i, j))
                       return false;

                   if (lookForQueen(board, 'Q', i, j))
                       return false;

               }
           }
       }
       return true;
   }

   

   // Function to check if Queen can attack the King
    static boolean lookForQueen(char[][] board, char c, int i, int j) {

       if (lookForCamel(board, c, i, j) || lookForElep(board, c, i, j))
           return true;

       return false;
   }

   // Function to check if camel can attack the king
    static boolean lookForCamel(char[][] board, char c, int i, int j) {

       // Check the lower right diagonal
       int k = 0;
       while (inBounds(i + ++k, j + k)) {

           if (board[i + k][j + k] == c)
               return true;
           if (board[i + k][j + k] != '-')
               break;
       }

       // Check the lower left diagonal
       k = 0;
       while (inBounds(i + ++k, j - k)) {

           if (board[i + k][j - k] == c)
               return true;
           if (board[i + k][j - k] != '-')
               break;
       }

       // Check the upper right diagonal
       k = 0;
       while (inBounds(i - ++k, j + k)) {

           if (board[i - k][j + k] == c)
               return true;
           if (board[i - k][j + k] != '-')
               break;
       }

       // Check the upper left diagonal
       k = 0;
       while (inBounds(i - ++k, j - k)) {

           if (board[i - k][j - k] == c)
               return true;
           if (board[i - k][j - k] != '-')
               break;
       }

       return false;
   }

   // Check if
    static boolean lookForElep(char[][] board,char c, int i, int j) {

       // Check downwards
       int k = 0;
       while (inBounds(i + ++k, j)) {
           if (board[i + k][j] == c)
               return true;
           if (board[i + k][j] != '-')
               break;
       }

       // Check upwards
       k = 0;
       while (inBounds(i + --k, j)) {
           if (board[i + k][j] == c)
               return true;
           if (board[i + k][j] != '-')
               break;
       }

       // Check right
       k = 0;
       while (inBounds(i, j + ++k)) {
           if (board[i][j + k] == c)
               return true;
           if (board[i][j + k] != '-')
               break;
       }

       // Check left
       k = 0;
       while (inBounds(i, j + --k)) {
           if (board[i][j + k] == c)
               return true;
           if (board[i][j + k] != '-')
               break;
       }
       return false;
   }

   // Check if the Hourse can attack the king
    static boolean lookForHourse(char[][] board,
           char c, int i, int j) {

       // All possible moves of the Hourse
       int[] x = { 2, 2, -2, -2, 1, 1, -1, -1 };
       int[] y = { 1, -1, 1, -1, 2, -2, 2, -2 };

       for (int k = 0; k < 8; k++) {

           // Incrementing index values
           int m = i + x[k];
           int n = j + y[k];

           // Checking boundary conditions
           // and character match
           if (inBounds(m, n) && board[m][n] == c)
               return true;
       }
       return false;
   }

   // Check if the indices are within
   // the matrix or not
    static boolean inBounds(int i, int j) {

       // Checking boundary conditions
       return i >= 0 && i < 8 && j >= 0 && j < 8;
   }

   // Driver Code
   public static void main(String[] args) {

       // Chessboard instance
       char[][] board = { 
               { '-', '-', '-', 'k', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' },
               { '-', '-', '-', '-', '-', '-', '-', '-' } };

       
           System.out.println(isKingSafe(board)?"Safe":"not safe");
   }
}
