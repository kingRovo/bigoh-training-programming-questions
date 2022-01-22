// 4.Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
// You may assume all four edges of the grid are all surrounded by water.

public class Islands {

        static int FindIslands(int[][] grid) {
            int islands=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        islands+=1;
                        visitIsland(grid,i,j);
                    }
                }
            }
            return islands;
        }
        
        static void visitIsland(int[][] grid, int r,int c){
            if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=1) return;
            grid[r][c]=0;
            visitIsland(grid,r+1,c);
            visitIsland(grid,r-1,c);
            visitIsland(grid,r,c+1);
            visitIsland(grid,r,c-1);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,0,0,0},
                           {1,1,0,0,0},
                           {0,0,1,0,0},
                           {0,0,0,1,1}};
    
        System.out.println(FindIslands(matrix));
        
}
}
