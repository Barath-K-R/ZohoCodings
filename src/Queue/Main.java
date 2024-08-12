package Queue;

public class Main {

	public static void main(String[] args) {
		Intq iq=new Intq();
		iq.enqueue(1);
		iq.enqueue(2);
		iq.enqueue(3);
		iq.enqueue(4);
		iq.enqueue(5);
		System.out.println(iq.dequeue());
		System.out.println(iq.dequeue());
		System.out.println(iq.dequeue());
        iq.showall();
	}

}
