import java.sql.*;
public class FetchAllJdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname ="postgres";
        String upass = "000";
        String sql = "select * from students";
        try {
            Connection con = DriverManager.getConnection(url,uname,upass);
            System.out.println("Connection Established");
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery(sql);
            rst.next();
            while (rst.next()) {
                System.out.print(rst.getInt("sid") + " - ");
                System.out.print(rst.getString("sname") + " - ");
                System.out.println(rst.getInt("smark"));
            }
            con.close();
            System.out.println("Connection Closed!!");
        } catch (Exception e) {
            System.out.println("Unexpected error");
        }


    }
}
