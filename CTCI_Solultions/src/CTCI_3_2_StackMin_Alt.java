import java.util.Stack;
public class CTCI_3_2_StackMin_Alt {
	
	Stack<Integer> mins = new Stack<Integer>();
	StackNode top;
	private static class StackNode {
		private Integer data;
		private StackNode next;
		public StackNode(Integer d) {
			this.data = d;
		}
	}
	
	public void push(Integer i) {
		if(top == null) {
			mins.push(i);
		}
		
		else if(i<=min()) {
			mins.push(i);
		}
		else {
			mins.push(min());
		}
		StackNode temp = new StackNode(i);
		temp.next = top;
		top = temp;
	}
	
	public Integer pop(){
		Integer temp = top.data;
		top = top.next;
		mins.pop();
		return temp;
	}
	
	public Integer min() {
		return mins.peek();
	}
	
	public Integer peek() {
		return top.data;
	}
}
