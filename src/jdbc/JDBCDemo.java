package jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		batch();
	}
        
        public static void readrecords() throws Exception {
	        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
	    		String username="root";
	    		String password="Barath@1974";
	    		String query="select * from employee";
	    		Connection con=DriverManager.getConnection(url, username, password);
	            Statement st=con.createStatement();
	            ResultSet rs= st.executeQuery(query);
	            while(rs.next()) {
	            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	            }
        }
        
        public static void insertrecords() throws Exception{
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		
    		int id=5;
    		String name="kannan";
    	    int salary=20000;
    		String query="insert into employee values (?,?,?);";
    		Connection con=DriverManager.getConnection(url, username, password);
            PreparedStatement pst=con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, salary);
            pst.executeUpdate();
           	
        }
        
        public static void deleterecords() throws Exception {
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		int id=5;
    		Connection con=DriverManager.getConnection(url, username, password);
    		String query="delete from employee where emp_id="+id+";";
    		Statement st=con.createStatement();
    		st.executeUpdate(query);
    		
        }
        
        public static void updaterecords() throws Exception {
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		
    		Connection con=DriverManager.getConnection(url, username, password);
    		String query="update employee set salary=5000 where emp_id=3";
    		Statement st=con.createStatement();
    		st.executeUpdate(query);
    		
        }
        
        //calling stord procedure with input parameter
        public static void sp() throws Exception {
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		int id=2;
    		Connection con=DriverManager.getConnection(url, username, password);
    		
    		CallableStatement cst=con.prepareCall("{call GetEmpById(?)}");
    		cst.setInt(1, id);
    		ResultSet rs=cst.executeQuery();
    		rs.next();
    		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    		
        }
        
        
        //calling procedure with in and out paramter
        public static void sp1() throws Exception {
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		int id=3;
    		Connection con=DriverManager.getConnection(url, username, password);
    		
    		CallableStatement cst=con.prepareCall("{call GetNameById(?,?)}");
    		cst.setInt(1, id);
    		cst.registerOutParameter(2, Types.VARCHAR);
    		
    		cst.executeUpdate(); 
    		
    		System.out.println(cst.getString(2));
    		
    		
        }
        
        //commit and autocommit
        public static void commitdemo() throws Exception {	
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		
    		Connection con=DriverManager.getConnection(url, username, password);
    		con.setAutoCommit(false);
    		String query="update employee set salary=55000 where emp_id=3;";
    		String query2="update employee set salary=6000 where emp_id=2;";
    		Statement st=con.createStatement();
    		int row1=st.executeUpdate(query);
    		int row2=st.executeUpdate(query2);
    		
    		if(row1>0 && row2>0)
    		con.commit();
    		
        }
        
        public static void batch() throws Exception {	
        	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    		String username="root";
    		String password="Barath@1974";
    		
    		Connection con=DriverManager.getConnection(url, username, password);
    		con.setAutoCommit(false);
    		String query="update employee set salary=6000 where emp_id=1";
    		String query2="update employee set salary=6000 where emp_id=2";
    		String query3="update employee set salary=6000 where emp_id=3";
    		
    		Statement st=con.createStatement();
    		
    		st.addBatch(query);
    		st.addBatch(query2);
    		st.addBatch(query3);
    		
    		int []i=st.executeBatch();
    		
    		for(int res:i)
    		{
    			if(res>0)
    				continue;
    			else
    			{
    				System.out.println("res="+res);
    				con.rollback();
    			}
    		}
    		
    		con.commit();
    		con.close();
    		
        }
        
}



