package staticpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java. sql.SQLException;
import java.sql.Statement;

public class update {
    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
        PreparedStatement stmt=conn.prepareStatement("update registration set first=? where id=?");){  
        stmt.setString(1,"Sonoo");
        stmt.setInt(2,103);  
        int i=stmt.executeUpdate();  
        System.out.println(i+" records updated");
  
}catch(Exception e){
e.printStackTrace();
}
}
}

