
public class CTCI_1_1_Unique {
	
	public static boolean is_unique(String str)
	{
		boolean[] lets = new boolean[128];
		for(char i:str.toCharArray())
		{
			if(lets[i] == true)
			{
				return false;
			}
			lets[i] = true;
		}
		return true;
	}
	
	public static void main(String [] args)
    {
		String str = "randoma";
		System.out.println(is_unique(str));
    }

}
