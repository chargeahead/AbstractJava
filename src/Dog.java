
public class Dog implements AnimalInterface{
	
    private String color;
    public Dog(String color) {this.color=color;}
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "I am a dog. My color is "+color;
	}

}
