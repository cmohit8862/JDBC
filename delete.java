package staticpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java. sql.SQLException;
import java.sql.Statement;

public class delete{
    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
        PreparedStatement stmt=conn.prepareStatement("delete from registration where id=?");){  
        stmt.setInt(1,101);  
        int i=stmt.executeUpdate();  
        System.out.println(i+" records deleted");   
  
}catch(Exception e){
e.printStackTrace();
}
}
}
