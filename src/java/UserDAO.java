/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Oubaid
 */
public class UserDAO {
    public boolean validates(String uname,String passw)
    {
        try
        {
            Connection con=DriverConnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select count(*) from login where uname like '"+uname+"' and passw like '"+passw+"'");
            return rs.next();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
