
public class CTCI_5_4_Conversion {

	public static void main(String[] args) {
		System.out.println(bitSwap(29,15));

	}

//	public static void conversion(int a, int b) {
//		String bin_a = Integer.toBinaryString(a);
//		String bin_b = Integer.toBinaryString(a);
//		int extra_ones = 0;
//		if(bin_a.length() != bin_b.length()) {
//			
//		}
//		for(char i: bin.toCharArray()) {
//			
//		}
		
	public static int bitSwap(int a, int b) {
		int count = 0;
		for(int i = a^b; i!=0; i = i&(i-1)) {
			count++;
		}
		return count;
	}
}
