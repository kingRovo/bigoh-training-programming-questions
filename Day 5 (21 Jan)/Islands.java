// 4.Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
// You may assume all four edges of the grid are all surrounded by water.

public class Islands {

        static int FindIslands(int[][] matrix) {
            int islands=0;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==1){
                        islands+=1;
                        visitIsland(matrix,i,j);
                    }
                }
            }
            return islands;
        }
        
        static void visitIsland(int[][] matrix, int r,int c){
            if(r<0 || c<0 || r>=matrix.length || c>=matrix[0].length || matrix[r][c]!=1) 
            return;
            
            matrix[r][c]=0;
            visitIsland(matrix,r+1,c);
            visitIsland(matrix,r-1,c);
            visitIsland(matrix,r,c+1);
            visitIsland(matrix,r,c-1);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,0,0,0},
                           {1,1,0,0,0},
                           {0,0,1,0,0},
                           {0,0,0,1,1}};
    
        System.out.println(FindIslands(matrix));
        
}
}
