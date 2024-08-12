package hashTable;

public class StdList {
    Node h;
	public StdList() {
		h=new Node();
		h.data=null;
		h.next=null;
	}
	
	public boolean insertstudent(Student s) {
		Node n=new Node();
		n.data=s;
		n.next=h.next;
		h.next=n;
		return true;
		
	}
	
	public boolean haverollno(String rollno) {
		Node t=h.next;
		boolean have=false;
		while(t!=null)
		{
			if(t.data.getRollno().equals(rollno))
			{
				have=true;
			   break;
			}
			else
			{
				t=t.next;
			}
		}
		return have;
		
	}
	
	public Student findstudent(String rollno) {
		Node t=h.next;
		while(t!=null)
		{
			if(t.data.getRollno().equals(rollno))
			{
			   break;
			}
			else
			{
				t=t.next;
			}
		}
		return t.data;

	}
	
	public void deletestudent(String rollno) {
		Node t1=h.next,t2=h;
		while(true)
		{
			
			if(t1!=null &&(t1.data.getRollno().equals(rollno))) {
				break;
			}
			t2=t1;
			t1=t1.next;
		}
		if(t1!=null)
		{
			t2.next=t1.next;
			t1.next=null;
			
		}
	}
	
	public void showallstudenlist() {
		Node t=h.next;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	class Node{
		Student data;
		Node next;
	}
}
