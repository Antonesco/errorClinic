/**
 * class Cat
 * @author Electron
 *
 */
public class Cat implements Pet{
	
	/*
	 * name Pet
	 */
	private String name;
	
	/*
	 * Constructor
	 * @param name 
	 */
	public Cat(String name){
		this.name = name;
	}

	@Override
	public void makeSound() {
		System.out.println("Myau");
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
