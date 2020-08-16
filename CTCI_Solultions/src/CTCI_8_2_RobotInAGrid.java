import java.util.Arrays;

public class CTCI_8_2_RobotInAGrid {

	public static void main(String[] args) {
		int[][] grid = {{0,0,1,0,0},{0,0,0,0,0},{0,0,1,0,1},{0,0,1,0,0},{0,0,0,0,0}};
		System.out.println(Arrays.toString(robInGrid(grid)));
	}
	
	public static int[] robInGrid(int[][] grid) {
		int[] path = new int[grid.length + grid[0].length ];
		int x = 0;
		int y = 0;
		int max_x = grid.length-1;
		int max_y = grid[0].length-1;
		return robInGrid(grid, path, x, y, max_x, max_y);
	}
	
	public static int[] robInGrid(int[][] grid, int[] path, int x, int y, int max_x, int max_y) {
		System.out.println(Arrays.toString(path));
		System.out.println(x + "    " + y);
		if(x==max_x && y==max_y) {
			return path;
		}
		if(x<max_x && grid[y][x+1]!=1) {
			path[x+y] = 1;
			path = robInGrid(grid, path, x+1, y, max_x, max_y);
		}
		if(y<max_y && path[y+x+1]==0) {
			if(grid[y+1][x]!=1) {
				path[x+y] = -1;
				path = robInGrid(grid, path, x, y+1, max_x, max_y);	
			}
			if(path[y+x+1]==0) {
				path[x+y] = 0;
				return path;
			}
			return path;
		}
		return path;
	}

}
