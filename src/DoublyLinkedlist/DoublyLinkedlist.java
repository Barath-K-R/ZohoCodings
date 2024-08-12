package DoublyLinkedlist;



public class DoublyLinkedlist {
	Node head=null;
	 class Node {
		int data;
		Node next;
		Node prev;

	}
  
	public DoublyLinkedlist(int item) {
		Node n=new Node();
		head=n;
		n.data=item;
		n.next=null;
		n.prev=null;
	}
	
	public boolean insertionatbeginning(int data) {
		if (head == null) {
			Node new_node = new Node();
			new_node.next = null;
			new_node.prev = null;
			new_node.data = data;
			head = new_node;
		} else {
			Node new_node = new Node();
			new_node.prev = null;
			new_node.data = data;
			new_node.next = head;
			head.prev = new_node;
			head = new_node;
		}
		return true;
	}

	public  boolean insertionatend(int data) {
		Node t=head;
		while (t.next != null) {
			t=t.next;
		}
		Node new_node = new Node();
		new_node.data = data;
		t.next = new_node;
		new_node.prev = t;
		new_node.next = null;
		return true;
	}
	public boolean insertatposition(int position,int data) {
		Node newnode=new Node();
		newnode.data=data;
		Node t1 = head,t2=head;
		int c=0;
		for(int i=0;i<position-2;++i)
		{
			t1=t1.next;
		}
		if(t1.next!=null)
		{
		    t2=t1.next;
		    newnode.next=t2;
		    newnode.prev=t1;
		    t1.next=newnode;
		    t2.prev=newnode;
		    return true;
		}
		else
		{
			t1.next=newnode;
			newnode.prev=t1;
			newnode.next=null;
			return true;
		}

	}
	
	public boolean delete(int data) {
		if(head.data==data)
		{
			head=head.next;
		}
		else
		{
			Node t1=head.next;
			while(true)
			{
				if(t1.data==data || t1.next==null)
				break;
				else
				{
					t1=t1.next;
				}
			}
			if(t1.next!=null)
			{
			t1.prev.next=t1.next;
			t1.next.prev=t1.prev;
			t1.next=null;
			t1.prev=null;
			}
			else if(t1.next==null && t1.data==data)
			{
				t1.prev.next=null;
				t1.prev=null;
			}
		}
		
		return true;
	}
	
	public void sort() {
		int temp=0;
		Node a=head,b=head;
		while(a.next!=null)
		{
			b=head;
			while(b.next!=null)
			{
				if(b.data>b.next.data)
				{
					temp=b.data;
					b.data=b.next.data;
					b.next.data=temp;
				}
				b=b.next;
			}
			a=a.next;
		}
		
	}
	
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	
		
		
}


