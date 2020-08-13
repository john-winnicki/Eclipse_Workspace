
public class CTCI_3_6_AnimalShelter_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTCI_3_6_AnimalShelter animal_shelter = new CTCI_3_6_AnimalShelter();
		animal_shelter.enqueue("Doggy1", true);
		animal_shelter.enqueue("Doggy2", true);
		animal_shelter.enqueue("Catty1", false);
		animal_shelter.enqueue("Doggy3", true);
		animal_shelter.enqueue("Doggy4", true);
		animal_shelter.enqueue("Catty2", false);
		animal_shelter.enqueue("Catty3", false);
		animal_shelter.enqueue("Catty4", false);
//		System.out.println("\n\n\n");
		animal_shelter.printAll();
		animal_shelter.dequeueAny();
		animal_shelter.dequeueAny();
		animal_shelter.dequeueAny();
		animal_shelter.dequeueAny();
		System.out.println("\n\n\n");
		animal_shelter.printAll();
		System.out.println("\n\n\n");
		animal_shelter.enqueue("Doggy5", true);
		animal_shelter.enqueue("Doggy6", true);
		animal_shelter.enqueue("Doggy7", true);
		animal_shelter.enqueue("Catty5", false);
		animal_shelter.enqueue("Catty6", false);
		animal_shelter.enqueue("Catty7", false);
		animal_shelter.printAll();
	}

}
