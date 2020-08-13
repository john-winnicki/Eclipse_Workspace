import java.util.ArrayList;
import java.util.Collections;


public class CTCI_3_2_StackMin {
	
	private ArrayList<Integer> vals = new ArrayList<Integer>();
	private StackNode top;
	
	private static class StackNode {
		private Integer data;
		private StackNode next;
		public StackNode(int d) {
			this.data = d;
		}
	}
	
	public Integer pop() {
		if(top==null) System.out.println("Bad pop");
		
		int item = top.data;
		top = top.next;
		
		int index = 0;
		for(int i: vals) {
			if(i==item)break;
			else {
				index++;
			}
		}
		vals.remove(index);
		return item;
	}
	
	public void push(int item) {
		StackNode t = new StackNode(item);
		t.next = top;
		top = t;

		vals.add(item);
		Collections.sort(vals);
	}
	
	public Integer peek() {
		return top.data;
	}
	
	public Integer min() {
		return vals.get(0);
	}	
}
