
public class Tester {

	public static void main(String args[]) {
		AnimalInterface dog = new Dog("Brown");
		AnimalInterface cat = new Cat("Black");
		
		System.out.println(dog.speak());
		System.out.println(cat.speak());
		
	}
}
