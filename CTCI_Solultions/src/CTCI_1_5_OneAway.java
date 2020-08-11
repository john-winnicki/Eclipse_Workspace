
public class CTCI_1_5_OneAway {

	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "ale";
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1!=len2)
		{
			if(Math.abs(len1-len2)>1) {
				System.out.println("False");
				return;
			}
			
			int ind1 = 0;
			int ind2 = 0;
			boolean one_edit = false;
			if(len1<len2)
			{
				for(int i = 0; i<len1; i++) {
					if(str1.charAt(ind1)!=str2.charAt(ind2)) {
						if(one_edit == true) {
							System.out.println("False");
							return;
						}
						ind1++;
						one_edit=false;
					}
				}
				
				//In this section, we are checking the final character
				if(one_edit == true)
				{
					//Scenario if there is already one edit other than the last one
					System.out.println("False");
					return;
				}
				else {
					System.out.println("True");
					return;
				}
			}
			else
			{
				for(int i = 0; i<len2; i++) {
					if(str2.charAt(ind2)!=str1.charAt(ind1)) {
						if(one_edit == true) {
							System.out.println("False");
							return;
						}
						ind2++;
						one_edit=false;
					}
					else {
						ind1++;
						ind2++;
					}
				}
				
				//In this section, we are checking the final character
				if(one_edit == true)
				{
					//Scenario if there is already one edit other than the last one
					System.out.println("False");
					return;
				}
				else {
					System.out.println("True");
					return;
				}
			}
		}
		
		else
		{
			boolean one_edit = false;
			
			for(int i = 0; i<len1; i++) {
				if(str1.charAt(i)!=str2.charAt(i)){
					if(one_edit==true) {
						System.out.println("False");
						return;
					}
					one_edit=true;
				}	
			}
			System.out.println("True");
			return;
		}
	}
}
