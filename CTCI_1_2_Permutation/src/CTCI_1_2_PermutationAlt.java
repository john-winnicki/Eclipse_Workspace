
public class CTCI_1_2_PermutationAlt {

	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "paple";
		int[] lets = new int[128];
		
		if(str1.length() != str2.length())
		{
			System.out.println("false");
		}
		
		for(char i : str1.toCharArray())
		{
			lets[i]++;
		}

		for(char i : str2.toCharArray())
		{
			lets[i]--;
			if(lets[i]<0)
			{
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
		return;
	}

}
