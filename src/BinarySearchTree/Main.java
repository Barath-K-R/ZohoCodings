package BinarySearchTree;

import BinarySearchTree.BST.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BST b=new BST();
        
        b.insert(16);
        b.insert(8);
        b.insert(7);
        b.insert(6);
        b.insert(9);
        b.insert(5);
        b.insert(10);
        b.insert(21);
        b.insert(25);
        b.insert(18);
        b.insert(17);
        b.insert(19);
       
        System.out.println("parent="+b.findparent(10).data);
        b.printall(b.root);
		
	}

}
