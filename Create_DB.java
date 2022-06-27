package staticpackage;
import java.sql.*;

public class Create_DB {

	public static void main(String[] args) {
		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
				Statement stat = conn.createStatement();
			)	
			{
					String sql = "CREATE TABLE Company" +
			                "(id INTEGER not NULL, " +
			                " first VARCHAR(255), " + 
			                " last VARCHAR(255), " + 
			                " age INTEGER, " + 
			                " PRIMARY KEY ( id ))"; 
					
					
					stat.executeUpdate(sql);
					System.out.println("Created table is given database..");
			
			}catch (SQLException e)
		{
				e.printStackTrace();
		}
		
		
	}

}












/*import java.sql.Connection;
import java.sql.DriverManager;
import java. sql.SQLException;
import java.sql.Statement;
public class Create_DB {

static final String DB_URL = "jdbc:mysq]://localhost:3306/vscode/";
static final String USER = "root";
static final String PASS = "mohit1996";
    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();)
        {
            String sql = "Select * from Properties_vs";
            stmt. executeUpdate(sql);
            System.out.println("Database created successfully..");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        }
    }*/
