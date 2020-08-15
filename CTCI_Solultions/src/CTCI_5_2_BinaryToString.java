
public class CTCI_5_2_BinaryToString {

	public static void main(String[] args) {
		float n = (float) 0.47;
		System.out.println(Integer.toBinaryString(binToStr(n)));

	}
	
	public static int binToStr(float num) {
		int res = 0;
		for(int i=0; i<32; i++){
			res = res<<1;
			num = num*2;
//			System.out.println(num>=1?1:0);
			res = res|(num>=1?1:0);
			num = num-(int)num;
			System.out.println(Integer.toBinaryString(res));
		}
		return res;
	}

}
