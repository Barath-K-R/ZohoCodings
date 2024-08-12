package Trees;

import java.util.*; 
  
public class DepthofTree 
{ 
  
// Structure of a node of an n-ary tree 
static class Node 
{ 
    char key; 
    Vector<Node > child; 
}; 
  
// Utility function to create a new tree node 
static Node newNode(int key) 
{ 
    Node temp = new Node(); 
    temp.key = (char) key; 
    temp.child = new Vector<Node>(); 
    return temp; 
} 
  
// Function that will return the depth 
// of the tree 
static int depthOfTree(Node ptr) 
{ 
    // Base case 
    if (ptr == null) 
        return 0; 
  
    // Check for all children and find 
    // the maximum depth 
    int maxdepth = 0; 
    for (Node it : ptr.child) 
        maxdepth = Math.max(maxdepth,  
                            depthOfTree(it)); 
  
    return maxdepth + 1 ; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    /* Let us create below tree 
    *             A 
    *         / / \ \ 
    *     B F D E 
    *     / \ | /|\ 
    *     K J G C H I 
    *     /\         \ 
    *    N M         L 
    */
      
    Node root = newNode('A'); 
    (root.child).add(newNode('B')); 
    (root.child).add(newNode('F')); 
    (root.child).add(newNode('D')); 
    (root.child).add(newNode('E')); 
    (root.child.get(0).child).add(newNode('K')); 
    (root.child.get(0).child).add(newNode('J')); 
    (root.child.get(2).child).add(newNode('G')); 
    (root.child.get(3).child).add(newNode('C')); 
    (root.child.get(3).child).add(newNode('H')); 
    (root.child.get(3).child).add(newNode('I')); 
    (root.child.get(0).child.get(0).child).add(newNode('N')); 
    (root.child.get(0).child.get(0).child).add(newNode('M')); 
    (root.child.get(3).child.get(2).child).add(newNode('L')); 
      
    System.out.print(depthOfTree(root) + "\n"); 
} 
} 