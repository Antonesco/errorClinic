
public class Dog implements Pet{
	
	private String name;
	
	public Dog(final String name){
		this.name = name;
	}

	@Override
	public void makeSound() {
		System.out.println("Gav");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
