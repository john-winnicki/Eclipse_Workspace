//You are given two 32-bit numbers, N and M, and two bit positions, i and j. 
//Write a method to insert M into N such that M starts at bit j and ends at bit i.
public class CTCI_5_1_Insertion {

	public static void main(String[] args) {
		int N = 0b100111000;
		int M = 0b10011; 
		int i = 2;
		int j =  6;
		System.out.println(Integer.toBinaryString(N)+"********"+
		Integer.toBinaryString(M)+"********"+Integer.toBinaryString(insert(N,M,i,j)));
	}
	
	public static int insert(int N, int M, int i, int j) {
		
		for(int x = i; x<j; x++) {
			int mask = ~(1<<x);
			N = N&mask;
			System.out.println(Integer.toBinaryString(N));
		}
		M = M << i;
		
		return (N|M);
	}

}
