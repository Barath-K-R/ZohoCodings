package LinkedLists;

public class LinkedLists {
    private Node head;
	
    public LinkedLists(int item) {
    	head=new Node();
    	head.value=item;
    	head.link=null;
    }
    
    public boolean insertatbeginning(int item) {
    	Node n=new Node();
    	n.value=item;
    	n.link=head;
    	head=n;
    	return true;
    }
    
    public boolean insertatend(int item) {
    	Node n=new Node(),t1=head ;
    	n.value=item;
    	while(t1.link!=null) {
    		t1=t1.link;
    	} 
    	t1.link=n;
    	return true;
    }
    
    public boolean insertatmiddle(int item,int position) {
    	Node n=new Node(),a=head;
    	n.value=item;
    	for(int i=0;i<position-2;++i)
    	{
    		a=a.link;
    	}
    	n.link=a.link;
    	a.link=n;
    	return true;
    	
    }
    public boolean deleteitem(int item) {
    	if(head.value==item)
    	{
    		head=head.link;
    		return true;
    	}
    	else {
    		Node t1=head;
    	    Node t2=head.link;
    	    while(true) {
    	    	if(t2==null || t2.value==item)
    	    		break;
    	    	else {
    	    		t1=t2;
    	    		t2=t2.link;
    	    	}
    	    	
    	    }
    	    if(t2!=null) {
    	        t1.link=t2.link;
    	        t2.link=null;
    	        return true;
    	    }
    	    else
    	    	return false;
    	    
  
    	}
    }
    
    public void sort() {
    	int temp=0;
    	Node a=head;
    	while(a.link!=null)
    	{
    		Node b=head;
    		while(b.link!=null) {
    			if(b.value>b.link.value)
    			{
    				temp=b.value;
    				b.value=b.link.value;
    				b.link.value=temp;
    			}
    			b=b.link;
    		}
    		a=a.link;
    	}
    }
    
    public void printlist() {
    	Node z=head;
    	
    	while(z!=null) {
    		System.out.println(z.value);
    		z=z.link;
    	}
    }
   class Node{
	   private int value;
	   private Node link;
   }
	
}
