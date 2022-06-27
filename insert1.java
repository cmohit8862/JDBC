package staticpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java. sql.SQLException;
import java.sql.Statement;

public class insert1 {
    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
        PreparedStatement stmt=conn.prepareStatement("insert into registration values(?,?,?,?)");){
        stmt.setInt(1,105);
        stmt.setString(2,"Ratan"); 
        stmt.setString(3,"Chaudhari");  
        stmt.setInt(4,25);  
        int i=stmt.executeUpdate();  
        System.out.println(i+" records inserted");  
  
}catch(Exception e){
e.printStackTrace();
}
}
}