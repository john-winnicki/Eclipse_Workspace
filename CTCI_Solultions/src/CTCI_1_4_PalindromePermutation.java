import java.util.HashMap;
public class CTCI_1_4_PalindromePermutation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "taco cat";
		HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
		for(char i: str.toCharArray())
		{
			if(Character.isLetter(i))
			{
				int val = hmap.containsKey(i) ? hmap.get(i) : 0;
				val++;
				hmap.put(i, val);	
			}
		}
		
		boolean one_odd = false;
		for(char i:hmap.keySet())
		{
//			System.out.println(i);
//			System.out.println(one_odd);
			if(hmap.get(i)%2 != 0)
			{
//				System.out.println("Odd!");
				if(one_odd==true)
				{
					System.out.println("False");
					return;
				}
				one_odd = true;
			}
		}
		System.out.println("True");
	}

}
