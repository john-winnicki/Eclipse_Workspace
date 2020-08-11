import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class CTCI_2_1_RemoveDups_2 {
//Same as RemoveDups_1, but this time we don't want to use any additional memory

	public static void main(String[] args) {
		LinkedBlockingQueue<String> nlist = new LinkedBlockingQueue<String>();
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
	
	public static LinkedBlockingQueue<String> remove_dups(LinkedBlockingQueue<String> lst){
		
		Iterator<String> iterator1 = lst.iterator();
		int index1 = 0;
		int index2 = 0;
		
		String next1;
		while(iterator1.hasNext()) {
			next1 = iterator1.next();
			System.out.println(index1);
			Iterator<String> iterator2 = lst.iterator();
			for(int i=0;i<=index1;i++) {
				System.out.println(i + "********" + iterator2.next());
				index2++;
			}
			while(iterator2.hasNext()) {
				index2++;
				if(next1==iterator2.next()) {
					iterator2.remove();
					index1--;
				}
			}
			index1++;
			index2=0;
		}
		return lst;
	}

}
