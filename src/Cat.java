
public class Cat implements AnimalInterface {
    
	private String color;
	public Cat(String color) {this.color=color;}
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "I am a cat. My color is "+color;
	}

}
