package DoublyLinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedlist d=new DoublyLinkedlist(2);
		
		d.insertionatbeginning(3);
		d.insertionatend(7);
		d.insertatposition(2, 9);
		d.insertatposition(5, 8);
		
		d.sort();
		d.print();
		
	}

}
