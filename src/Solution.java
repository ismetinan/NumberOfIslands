import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {

                    bfs(grid , i , j);
                    count++;
                }
            }
        }
        return count;
    }
    static void bfs(char[][] grid, int i, int j) {
        Queue<Character> queue = new LinkedList<Character>();
        
        if ( i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return;

        grid[i][j] = '0';

        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
    }
    public static void main(String[] args) {
        char[][] grid = new char[4][5];
        System.out.println(numIslands(grid));
    }
}