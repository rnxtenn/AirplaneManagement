
package aeroplane.management.system;
import java.sql.*;

public class createDB{
    Connection c;
    Statement s;
    public createDB(){
        try{
            
            c = DriverManager.getConnection("jdbc:mysql://localhost/airlinemanagementsystem","root","#MND769AP@137");
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
