package LinkedLists;

public class Main {

	public static void main(String[] args) {
		LinkedLists l=new LinkedLists(2);
		
		l.insertatend(6);
		l.insertatend(5);
		l.insertatend(4);
		l.insertatend(3);
		l.insertatend(1); 
		l.sort();
		l.printlist();
		

	}

}
