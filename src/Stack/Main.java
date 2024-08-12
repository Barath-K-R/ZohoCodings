package Stack;

public class Main {

	public static void main(String[] args) {
//		Stack s=new Stack();
//		if(!s.isFull())
//		{
//			s.push(2);
//			s.push(3);
//			s.push(4);
//			s.push(5);
//		}
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		Person p1=new Person("barath",12),p2=new Person("arun",13);
		PersonStack ps=new PersonStack();
		ps.push(p1);
		ps.push(p2);
		System.out.println(ps.pop().toString());
		System.out.println(ps.pop().toString());
		

	}

}
