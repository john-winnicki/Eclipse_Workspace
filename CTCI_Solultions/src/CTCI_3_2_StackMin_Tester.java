
public class CTCI_3_2_StackMin_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTCI_3_2_StackMin_Alt minny = new CTCI_3_2_StackMin_Alt();
		minny.push(7);
		minny.push(6);
		minny.push(3);
		minny.push(4);
		minny.push(12);
		System.out.print(minny.min());
		minny.pop();
		minny.pop();
		System.out.print("\n"+minny.min());
		minny.pop();
		System.out.print("\n"+minny.min());
	}

}
