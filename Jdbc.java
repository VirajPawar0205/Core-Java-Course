package jdbcConnectivityExample;
import java.sql.*;

public class Jdbc {
	public void fetchStudent()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","viraj");
			Statement st=con.createStatement();
			ResultSet r=st.executeQuery("select * from demo");
			while(r.next())
			{
				int rno=r.getInt("RollNo");
				String nm=r.getString("Name");
				float en=r.getFloat("English");
				float mt=r.getFloat("Maths");
				float sc=r.getFloat("Science");
				System.out.println(rno+" "+nm+" "+en+" "+mt+" "+sc);
						
			}
		}
		catch(Exception e) {
			System.out.println("Exception is ---> "+e.getMessage());
		}
	}
	public void addStudent()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","viraj");
			Statement st=con.createStatement();
			int cnt=st.executeUpdate("insert into demo values (4,'Mrunal',12,14,2)");
			if(cnt>0)
			{
				System.out.println("Run Sucessfully ");
				fetchStudent();
			}
			
		}
		catch(Exception e)
		{}
	}

	public static void main(String[] args) {
		Jdbc j=new Jdbc();
		j.addStudent();
		//j.fetchStudent();

	}

}
