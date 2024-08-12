package BinarySearchTree;

public class BST {
	Node root;
	
	public void BST() {
		root=null;
		
	}
	
	public boolean insert(int data) {
		Node n=new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		if(root==null)
		{
			root=n;
			return true;
		}
		Node t1=root,t2=root;
		while(t1!=null)
		{
			t2=t1;
			if(data>t1.data)
				t1=t1.right;
			else
				t1=t1.left;
		}
		if(data<t2.data)
		{
			t2.left=n;
			return true;
	     }
		else
		{
			t2.right=n;
			return false;
		}
	}
	public Node findnode(int data) {
		Node n=root,t=root;
		while(true) {
			n=t;
			if(t.data==data)
				break;
			if(data<t.data)
				t=t.left;
			else
				t=t.right;
		}
		return n;
	}
	
	public Node findparent(int data) {
		Node t=root,n=root;
		while(t.data!=data) {
			n=t;
			if(data<t.data)
				t=t.left;
			else
				t=t.right;
		}
		return n;
		
	}
	public void printall(Node n) {
		Node t=n;
		if(t!=null)
		{
			System.out.println(t.data);
			printall(t.left);
			
			printall(t.right);
		}
	}
      public class Node{
    	  int data;
    	  Node left;
    	  Node right;
      }
}
