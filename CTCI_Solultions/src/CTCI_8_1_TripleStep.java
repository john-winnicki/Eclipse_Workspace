
public class CTCI_8_1_TripleStep {

	public static void main(String[] args) {
		System.out.println(nsteps(5));

	}
	
	public static int nsteps(int i) {
		return(nsteps(i, new int[i+1]));
		
	}
	
	public static int nsteps(int i, int[] memo) {
		if(i<0) return 0;
		if(i==0) return 1;
		if(memo[i]==0) {
			memo[i]=nsteps(i-1, memo)+nsteps(i-2,memo)+nsteps(i-3,memo);
		}
		return memo[i];
	}

}
