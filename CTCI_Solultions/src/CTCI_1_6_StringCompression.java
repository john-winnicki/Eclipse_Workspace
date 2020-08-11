
public class CTCI_1_6_StringCompression {

	public static void main(String[] args) {
		String test = "johnnn";
		String result = compress(test);
		System.out.println(test.length()>result.length() ? test : result);
		

	}
	
	public static String compress(String str) {
		int rep_count = 0;
		StringBuilder res = new StringBuilder();
		for(int i=0; i<=str.length()-2; i++) {
			rep_count++;
			if(str.charAt(i)!=str.charAt(i+1)) {
				res.append(Character.toString(str.charAt(i)));
				res.append(Integer.toString(rep_count));
				rep_count = 0;
			}
		}
		rep_count++;
		res.append(Character.toString(str.charAt(str.length()-1)));
		res.append(Integer.toString(rep_count));
		return res.toString();
	}

}
