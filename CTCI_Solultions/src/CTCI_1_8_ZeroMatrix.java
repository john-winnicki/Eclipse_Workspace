import java.util.Arrays;

public class CTCI_1_8_ZeroMatrix {

	public static void main(String[] args) {
		int[][]  A  =  {  {  1,  0, 12, -1 },
                {  7, -3,  2,  5 },
                { -5, -2,  0, 1 }
             };
		System.out.println(Arrays.deepToString(zero_matrix(A)));

	}
	
	public static int[][] zero_matrix(int[][] matr){
		int n = matr.length;
		int m = matr[0].length;
		int[][] zeroes = new int[2][n*m];
		int pos=0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matr[i][j]==0) {
					zeroes[pos][0]=i;
					zeroes[pos][1]=j;
					pos++;
				}
			}
		}
		
		for(int i=0; i<pos; i++) {
			System.out.println(zeroes[i][0]);
			System.out.println(zeroes[i][1]);
			matr = zero_colrow(matr, zeroes[i][0], zeroes[i][1]);
		}
		
		return matr;
	}
	
	public static int[][] zero_colrow(int[][] matr, int i, int j) {
		
		int n = matr.length;
		int m = matr[0].length;
		
		for(int y=0; y<m; y++) {
			matr[i][y] = 0;
		}
		
		for(int x=0; x<n; x++) {
			matr[x][j] = 0;
		}
		
		return matr;
	}
}
