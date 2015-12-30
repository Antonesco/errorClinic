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
				//���������� ������� �� ����
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
			//���� ������ not null �� ����� ������� �� ����-��
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
		//������������� numberOfClients
		int numberOfClients = 0;
		//1) ����� ����� ���-�� ���� �������� ()
		//2) ���� ���� �� ��������� �� �������� ��������� �� ������� ����������

	   //�� ������� ���� �������� ������� � ������ � ��� �������� ������
		for (int i=0;i<this.clients.length;i++){
			//���� ������ not null � ��� client ��������� � �������� ������ �� �������� � numberOfClients
			if(this.clients[i]!=null && this.clients[i].getName().equals(name)){
				numberOfClients++; //numberOfClients = numberOfClients + 1;
			}
		}
		//������� ����������
		//��������� ������ ��������� ������� ������
		Client[] result = new Client[numberOfClients];
		//������������� ��������
		int counter = 0;
		//������ �� ����� ������� �������
		for (int i = 0; i<this.clients.length;i++){
			//���� ������ not null � � ��� client ��������� � �������� ������
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
		//1) ����� ����� ���-�� ��������
		//2) ���� ���� �� ��������� �� �������� ��������� �� ������� ����������

	   //�� ������� ���� �������� ������� � ������ � ��� �������� ������
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                numOfPets++; //numOfPets = numOfPets + 1;
            }
        }
        //����� ������ result �������� ����������� �������� numberOfPets
        int counter = 0;
        Client[] result = new Client[numOfPets];
      //�� ������� ���� �������� ������� � ������ � ��� �������� ������
        for (int i = 0; i < this.clients.length; i++) {
        	//������ ������� not null � ������� ������� not null � ��� ������� ������� ��������� � ������ �������� ������� ��
            if (this.clients[i] != null && this.clients[i].getPet() != null && this.clients[i].getPet().getName().equals(petName)) {
                //  result[counter++] = this.clients[i]; ??
            }
        }
        return result;
	}
	
	public Client[] editClientByClientsName(String name){
		//���� ��������� ���� ������ ��������� � ������� ������ ������� �� ����������� ���
		if(this.clients[i].getName().equals(name)){
		    //����� ����� ������� (������ ����� ��������� �����)
			String clientName = this.scanner.next();
			//����� ������� ��� ������������� ����� ���
			this.currentClient = ClientName;
		}
	}
	
}
