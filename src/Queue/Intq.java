package Queue;

public class Intq {
     private int []q;
     private int size;
     private int total;
     private int front;
     private int rear;
     
     public Intq() {
    	 size=50;
    	 total=0;
    	 front=0;
    	 rear=0;
    	 q=new int[size];
     }
     
     public Intq(int size) {
    	 this.size=50;
    	 total=0;
    	 front=0;
    	 rear=0;
    	 q=new int[this.size];
     }
     public boolean enqueue(int item) {
    	 
    	 if(!isFull())
    	 {
    		 total++;
    		 q[rear]=item;
    		 rear=( rear+1)%size;
    		 return true;
    	 }
    	 else 
    		 return false;
     }
     
     public int dequeue() {
    	 if(!isEmpty())
    	 {
    		 total--;
    		 int item=q[front];
    		 front=(front+1)%size;
    		 
    		 return item;
    	 }
    	 else
    		 return -1;
     }
     
     public boolean isEmpty() {
    	 if(total==0)
    		 return true;
    	 else 
    		 return false;
     }
     
     public boolean isFull() {
    	 if(total==size)
    		 return true;
    	 else
    		 return false;
     }
     
     public void showall() {
    	 int f=front;
    	 
    	 if(total!=0)
    	 {
    		 
    		 for(int i=0;i<total;++i)
    		 {
    			 System.out.println(q[front]);
    			 front=(front+1)%size;
    		 }
    	 }
     }
     
}
