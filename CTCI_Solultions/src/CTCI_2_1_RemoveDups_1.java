import java.util.*;
public class CTCI_2_1_RemoveDups_1 {

	public static void main(String[] args) {
		LinkedList<String> nlist = new LinkedList<String>();
		// Add elements to LinkedList
	    nlist.add("Item1");
	    nlist.add("Item2");
	    nlist.add("Item3");
	    nlist.add("Item3");
	    nlist.add("Item5");
	    
	    System.out.println("Before: " + nlist.toString());
	    
	    nlist = remove_dups(nlist);
	    
	    System.out.println("After: " + nlist.toString());

	}
	
	public static LinkedList<String> remove_dups(LinkedList<String> lst){
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			int val = hmap.containsKey(next) ? hmap.get(next) : 0;
			val++;
			hmap.put(next, val);
		}
		
		for(String i : hmap.keySet()) {
			if(hmap.get(i)>1) {
				for(int j=0;j<hmap.get(i);j++) {
					lst.remove(i);
				}
			}
		}
		
		return lst; 
	}

}
