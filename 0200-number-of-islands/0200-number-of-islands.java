class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int m = grid.length;
        int n = grid[0].length;
        // boolean [][] visited = new boolean[m][n];
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0; j < grid[i].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char [][] grid, int row,int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[row].length || grid[row][col] == '0')
            return;
        grid[row][col] = '0';
        dfs(grid,row-1,col); //left
        dfs(grid,row+1,col); //right
        dfs(grid,row,col-1); //down
        dfs(grid,row,col+1); //up

    }
}