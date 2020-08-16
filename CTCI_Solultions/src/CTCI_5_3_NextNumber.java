//Given a positive integer, print the next smallest and the next 
//largest number that have the same number of 1 bits in their binary representation.
public class CTCI_5_3_NextNumber {

	public static void main(String[] args) {
		nextNum(1858);

	}
	
	public static void nextNum(int n) {
		String bin = Integer.toBinaryString(n);
		int ones = 0;
		int zeroes = 0;
		for(char i: bin.toCharArray()) {
			if(i=='0') {
				zeroes++;
			}
			else {
				ones++;
			}
		}
		
		int largest = 0b0;
		for(int i=0; i<ones; i++) {
			largest = (largest+1)<<1;
		}
		largest = largest>>1;
		for(int i=0; i<zeroes; i++) {
			largest = largest<<1;
		}
		
		int smallest = 0b0;
		for(int i=0; i<zeroes; i++) {
			smallest = smallest<<1;
		}
		smallest = smallest>>1;
		for(int i=0; i<ones; i++) {
			smallest = smallest<<1;
			smallest = smallest+1;
		}
		System.out.println("Next Smallest: " + Integer.toBinaryString(smallest));
		System.out.println("Next Largest: " + Integer.toBinaryString(largest));
	}

}
