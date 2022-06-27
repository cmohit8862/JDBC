package staticpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java. sql.SQLException;
import java.sql.Statement;

public class resultrs{
    public static void main(String[] args){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vscode", "root","mohit1996");
        PreparedStatement stmt=conn.prepareStatement("select * from registration");){ 
        ResultSet rs=stmt.executeQuery();  
        while(rs.next()){  
        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));  
}
}catch(Exception e){
    e.printStackTrace();
    }

    } 
}
