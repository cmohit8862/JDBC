package staticpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert
{
   
    public static void main(String[] args){
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
    Statement stmt = conn.createStatement();)
    
    {
    
    System.out.println("Inserting records into the table...");
    String sql = "INSERT INTO Registration VALUES (104,'amit','sam', 20)" ;
    stmt.executeUpdate(sql);
    System.out.println("Inserted records into the table");
    } 
    catch (SQLException e) {
    e.printStackTrace(); 

       }
    }
}
