/**
 * class Clinic
 * @author Electron
 *
 */
public class Clinic {
	
	private final Client[] clients;
	
	
	/*
	 * constructor
	 * @param size
	 */
	public Clinic(){
		
	}

	
	/*
	 * add clients
	 * @param client
	 */
	public void addClient(final Client client){
		for (int i = 0; i < this.clients.length; i++){
			if(this.clients[i] == null){
				//увеличение клиента на один
			}
		}
	}
	
	/*
	 * number of clients
	 * @return counter;
	 */
	public int numberOfClients(){
		int counter = 0;
		for (int i = 0; i < this.clients.length; i++){
			//если клиент not null то делай подсчет их колл-ва
			if(this.clients[i]!=null){
				counter++;
			}
		}
		return counter;
	}
	
	/*
	 * search client by client's name
	 * @param name
	 * @return result
	 */
	public Client[] findClientByClientsName(String name){
		//инициализация numberOfClients
		int numberOfClients = 0;
		//1) Нужно найти кол-во имен клиентов ()
		//2) Если одно не совпадает то всеравно переходит на подсчет результата

	   //По массиву всех объектов клиента а клиент у нас является массив
		for (int i=0;i<this.clients.length;i++){
			//если клиент not null и имя client совпадает с введеным именем то переходи к numberOfClients
			if(this.clients[i]!=null && this.clients[i].getName().equals(name)){
				numberOfClients++; //numberOfClients = numberOfClients + 1;
			}
		}
		//Подсчет результата
		//Создается массив результат объекта клиент
		Client[] result = new Client[numberOfClients];
		//инициализация счетчика
		int counter = 0;
		//Проход по всему массиву клиента
		for (int i = 0; i<this.clients.length;i++){
			//если клиент not null и и имя client совпадает с введеным именем
			if(this.clients[i]!=null && this.clients[i].getName().equals(name)){
				//?//  result[counter++] = this.clients[i]; ??
			}
		}
		return result;
	}
	
	/*
	 * search clients by pet's name
	 * @param petName
	 * @return result
	 */
	public Client[] findClientByPetsName(String petName){
		int numOfPets = 0;
		//1) Нужно найти кол-во животных
		//2) Если одно не совпадает то всеравно переходит на подсчет результата

	   //По массиву всех объектов клиента а клиент у нас является массив
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                numOfPets++; //numOfPets = numOfPets + 1;
            }
        }
        //Здесь массив result содержит колличество животных numberOfPets
        int counter = 0;
        Client[] result = new Client[numOfPets];
      //По массиву всех объектов клиента а клиент у нас является массив
        for (int i = 0; i < this.clients.length; i++) {
        	//массив клиента not null и питомеу клиента not null и имя питомца клиента совпадает с именем введеным питомца то
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                //  result[counter++] = this.clients[i]; ??
            }
        }
        return result;
	}
	
	public Client[] editClientByClientsName(String name){
		//если выбранный нами клиент совпадает с текщуим именем клиента то редактируем имя
		if(this.clients[i].getName().equals(name)){
		    //здесь нужен сканнер (создам через интерфейс Инпут)
			String clientName = this.scanner.next();
			//здесь текущее имя присваивается новое имя
			this.currentClient = ClientName;
		}
	}
	
}
