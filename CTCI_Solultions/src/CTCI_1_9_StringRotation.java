import java.util.Arrays;

public class CTCI_1_9_StringRotation {

	public static void main(String[] args) {
		String string1 = "waterbottle";
		String string2 = "terbottlewa";
		System.out.println(calc_breakpt(string1, string2));
		int breakpt = calc_breakpt(string1, string2);
		
		if(breakpt == -1) {
			System.out.println(false);
			return;
		}
		
		StringBuilder new_string = new StringBuilder();
		char[] arr2 = string2.toCharArray();
		new_string.append(Arrays.copyOfRange(arr2,breakpt,string2.length()));
		new_string.append(Arrays.copyOfRange(arr2,0,breakpt));
		System.out.println("Old String1: " + string1);
		System.out.println("Old String2: " + string2);
		System.out.println("New String: " + new_string.toString());
		System.out.println(new_string.toString().equals(string1));

	}
	
	public static int calc_breakpt(String str1, String str2) {
		
		int break_pt = -1;
		
		if(str1.length()!=str2.length()) {
			return break_pt;
		}
		String dub_str = str2 + str2;
		//Potentially check if str1 is a substing in dub_str here
		
		for(int i = 0; i<str2.length(); i++) {
			boolean substr = true;
			
			int orig_i = i;
			
			for(int j=0; j<str1.length(); j++) { 
				
				System.out.println("Dub Str: " + dub_str.charAt(i));
				System.out.println("String 1: " + str1.charAt(j)+"\n\n");
				if(dub_str.charAt(i)!=str1.charAt(j)) {
					substr = false;
					break;
				}
				else {
					i++;
				}
				
			}
			i = orig_i;
			
			if(substr == true) {
				break_pt = i;
				break;
			}
		}
		return break_pt;
		
	}

}
