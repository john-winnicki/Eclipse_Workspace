import java.util.HashMap;
/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 *
 * @author John Winnicki
 * @version 08/09/20
 */
public class CTCI_1_2_Permutation
{
    public boolean permutation(String str1, String str2)
    {
        String trim1 = str1.trim();
        String trim2 = str2.trim();
//        System.out.println(trim1 + " " + trim2);
        if (trim1.length()!=trim2.length())
        {
            return false;
        }
        
        HashMap<Character, Integer> lets1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> lets2 = new HashMap<Character, Integer>();
        
        for(int i = 0; i<trim1.length(); i++)
        {
        	System.out.println(trim1.charAt(i));
        	char current = trim1.charAt(i);
        	Integer val = lets1.containsKey(current) ? lets1.get(current) : 0;
        	val++;
        	lets1.put(current, val);
        }
        
        for(int i = 0; i<trim2.length(); i++)
        {
        	System.out.println(trim2.charAt(i));
        	char current = trim2.charAt(i);
        	Integer val = lets2.containsKey(current) ? lets2.get(current) : 0;
        	val++;
        	lets2.put(current, val);
        }
        
        for(Character i : lets1.keySet())
        {
        	System.out.println(i.toString()+": "+lets1.get(i)+ "*********" + lets2.get(i));
        	if(lets1.get(i) != lets2.get(i))
        	{
        		return false;
        	}
        }
        
        return true;
    }
    
    public static void main(String [] args)
    {
    	CTCI_1_2_Permutation perm = new CTCI_1_2_Permutation();
    	String string1 = "apple";
    	String string2 = "paple";
    	
    	System.out.println(perm.permutation(string1, string2));
    	
    }
}
