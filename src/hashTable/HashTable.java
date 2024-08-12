package hashTable;

public class HashTable {

	private StdList[] arr;
	private int size;
	private int totalstudents;
	
	public HashTable() {
		size=1000;
		arr=new StdList[size];
	}
	
	public int toHashCode(String rollno) {
		int addasciis=0,codevalue=0;
		for(int i=0;i<rollno.length();++i)
		{
			addasciis=addasciis+(int)rollno.charAt(i);
		}
		codevalue=addasciis%arr.length;
		return codevalue;
	}
	
	public boolean inserttohashtable(Student data) {
		int key=this.toHashCode(data.getRollno());
		if(arr[key]==null)
		{
			arr[key]=new StdList();
		}
		arr[key].insertstudent(data);
		totalstudents++;
		return true;
			
	}
	public int gettotalstudents() {
		return totalstudents;
	}
	
	public Student fetchstudent(String rollno) {
		int key=this.toHashCode(rollno);
		if(arr[key]==null)
		{
			return null;
		}
		else
		{
			Student s=arr[key].findstudent(rollno);
			if(s!=null)
			return s;
			else
				return null;
		}
		
	}
	
	public boolean deletestudent(String rollno) {
		boolean have=arr[toHashCode(rollno)].haverollno(rollno);
		if(have)
		{
			int key=this.toHashCode(rollno);
			arr[key].deletestudent(rollno);
			totalstudents--;
			return true;
			
		}
		return false;
	}
	
	public void showallhashtable() {
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]!=null)
			{
				arr[i].showallstudenlist();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
