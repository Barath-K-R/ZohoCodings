package Stack;

public class Stack {
      private int[] stack;
      private int top;
      private int size;
      public Stack() {
    	  top=-1;
    	  size=50;
    	  stack=new int[size];
      }
      public Stack(int size) {
    	  top=-1;
    	  this.size=size;
    	  stack=new int[this.size];
      }
      
      public boolean push(int item)
      {
    	  if(!isFull())
    	  {
    		  top++;
    		  stack[top]=item;
    		  return true;
    	  }
    	  else
    		  return false;
      }
      
      public int pop() {
    	  if(!isEmpty())
    	  return stack[top--];
    	  else 
    		  return -1;
      }
      
      public boolean isEmpty() {
    	  if(top==-1)
    	  return true;
    	  else 
    		  return false;
      }
      public boolean isFull() {
    	  if(top==stack.length-1)
    		  return true;
    	  else
    		  return false;
      }
}
