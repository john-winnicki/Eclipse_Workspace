
public class CTCI_3_4_QueueViaStack_Tester {

	public static void main(String[] args) {
		CTCI_3_4_QueueViaStack que = new CTCI_3_4_QueueViaStack();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.print_queue();
		que.remove();
		que.print_queue();
		que.remove();
		que.print_queue();

	}

}
