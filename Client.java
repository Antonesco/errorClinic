/**
 * class Client
 * @author Electron
 *
 */
public class Client {
	
	String name;
	int newClient;
	String id;
	Pet pet;
	
	/*
	 * Constructor
	 */
	public Client(String id, Pet pet){
		this.id = id;
		this.pet = pet;
	}
	

	/*
	 * get name
	 */
	public String getName(){
		return name;
	}
	
	/*
	 * set name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/*
	 * get id
	 */
	public String getId(){
		return id;
	}
	
	/*
	 * set id
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/*
	 * get pet
	 */
	public Pet getPet(){
		return pet;
	}
	
	/*
	 * set pet
	 */
	public void setPet(Pet pet){
		this.pet = pet;
	}

}
