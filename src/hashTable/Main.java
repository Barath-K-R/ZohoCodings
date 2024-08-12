 package hashTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashTable h=new HashTable();
        
        Student s1=new Student("barath","1-333",7.89);
        Student s2=new Student("dharma","2-623",8.9);
        Student s3=new Student("arun","3-233",5.4);
        
        h.inserttohashtable(s1);
        h.inserttohashtable(s2);
        h.inserttohashtable(s3);
        
        
        System.out.println(h.fetchstudent("2-623"));
        
	}

}
