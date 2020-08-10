
public class CTCI_1_3_ReplaceSpace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi my name is John        ";
//		int true_len = 26;
		char[] arr = str.toCharArray();
		System.out.println(arr);
		
		int zero_count = 0;
		for(char i: str.trim().toCharArray())
		{
			if(i == ' ')
			{
				zero_count++;
			}
		}
		
		int str_pos = str.length()-2*zero_count-1;
		int full_pos = str.length()-1;
		
		while(full_pos>0)
		{
			if(arr[str_pos] == ' ')
			{
				arr[full_pos] = '0';
				full_pos--;
				arr[full_pos] = '2';
				full_pos--;
				arr[full_pos] = '%';
				full_pos--;
				str_pos--;
			}
			else
			{
				arr[full_pos] = arr[str_pos];
				full_pos--;
				str_pos--;
			}
		}
		
		System.out.println(arr);
		
		
	}

}
