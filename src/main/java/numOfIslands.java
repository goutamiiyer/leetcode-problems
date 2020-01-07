public class numOfIslands {
    public static void main(String[] args) {
        numOfIslands num = new numOfIslands();
        char[][] grid = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        int noIslands = num.numIslands(grid);
        System.out.println(noIslands);
    }
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null) {
            return 0;
        }

        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands = numIslands + dfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }

    public int dfs (char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }

        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return 1;
    }
}
