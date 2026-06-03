import java.sql.*;
class JDBCConnection{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/college";
        String user="root";
        String password="Swathi@123";
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,user,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM students");
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
            }
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}