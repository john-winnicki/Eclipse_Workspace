import java.util.Stack;

public class CTCI_3_4_QueueViaStack {

	Stack<Integer> forward = new Stack<Integer>();
	Stack<Integer> reverse = new Stack<Integer>();
	boolean add_recently = false;
	
	public void add(Integer i) {
		if(!add_recently) {
			while(!forward.isEmpty()) {
				reverse.push(forward.pop());
			}
		}
		add_recently = true;
		
		reverse.push(i);
	}
	
	public void remove() {
		if(add_recently) {
			while(!reverse.isEmpty()) {
				forward.push(reverse.pop());
			}
		}
		add_recently = false;
		
		forward.pop();
	}
	
	public void print_queue(){
		if(reverse.isEmpty()) {
			System.out.println(forward);
		}
		else {
			System.out.println(reverse);
		}
	}

}
