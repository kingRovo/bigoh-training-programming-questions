
public class test2 {

	// Function to check if any of the two
	// kings is unsafe or not
	private static int checkBoard(char[][] board) {

		// Find the position of both the kings
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				// Check for all pieces which
				// can attack White King
				if (board[i][j] == 'k') {

					// Check for Hourse
					if (lookForHourse(board, 'H', i, j))
						return 1;

					// Check for Elephant
					if (lookForElep(board, 'E', i, j))
						return 1;

					// Check for camel
					if (lookForCamel(board, 'C', i, j))
						return 1;

					// Check for Queen
					if (lookForQueen(board, 'Q', i, j))
						return 1;

					// Check for King
					if (lookForking(board, 'K', i, j))
						return 1;
				}
			}
		}
		return 0;
	}

	private static boolean lookForking(char[][] board,
			char c, int i, int j) {

		// Store all possible moves of the king
		int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

		for (int k = 0; k < 8; k++) {

			// incrementing index values
			int m = i + x[k];
			int n = j + y[k];

			// checking boundary conditions
			// and character match
			if (inBounds(m, n) && board[m][n] == c)
				return true;
		}
		return false;
	}

	// Function to check if Queen can attack the King
	private static boolean lookForQueen(char[][] board,
			char c, int i, int j) {

		if (lookForCamel(board, c, i, j) || lookForElep(board, c, i, j))
			return true;

		return false;
	}

	// Function to check if camel can attack the king
	private static boolean lookForCamel(char[][] board, char c, int i, int j) {

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
	private static boolean lookForElep(char[][] board,char c, int i, int j) {

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
	private static boolean lookForHourse(char[][] board,
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
	private static boolean inBounds(int i, int j) {

		// Checking boundary conditions
		return i >= 0 && i < 8 && j >= 0 && j < 8;
	}

	// Driver Code
	public static void main(String[] args) {

		// Chessboard instance
		char[][] board = { { '-', '-', '-', 'k', '-', '-', '-', '-' },
				{ 'p', 'p', 'p', '-', 'p', 'p', 'p', 'p' },
				{ '-', '-', '-', '-', '-', 'b', '-', '-' },
				{ '-', '-', '-', 'R', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-' },
				{ 'P', '-', 'P', 'P', 'P', 'P', 'P', 'P' },
				{ 'K', '-', '-', '-', '-', '-', '-', '-' } };

		if (checkBoard(board) == 0)
			System.out.println("No king in danger");

		else if (checkBoard(board) == 1)
			System.out.println("White king in danger");

		else
			System.out.println("Black king in danger");
	}
}
