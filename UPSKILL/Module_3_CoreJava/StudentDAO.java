import java.sql.*;
public class StudentDAO{
    public static void main(String[] args){
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Swathi@123");
            String insertQuery="INSERT INTO students VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(insertQuery);
            ps.setInt(1,101);
            ps.setString(2,"Swathi");
            ps.setInt(3,21);
            ps.executeUpdate();
            String updateQuery="UPDATE students SET age=? WHERE id=?";
            PreparedStatement ps2=con.prepareStatement(updateQuery);
            ps2.setInt(1,22);
            ps2.setInt(2,101);
            ps2.executeUpdate();
            System.out.println("Insert and Update Successful");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}