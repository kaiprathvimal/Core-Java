import java.sql.*;
public class InsertJdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname= "postgres";
        String upass = "000";
        String sql = "insert into students values (10,'Amal',34)";
        String sql1 = "update  students set sname ='vimal' where sid=3";
        String sql2 = "delete from students where sid=8";

        try {
            Connection con = DriverManager.getConnection(url,uname,upass);
            System.out.println("Connection Established");
            Statement st = con.createStatement();
            boolean rs = st.execute(sql);
            System.out.println(rs);
            boolean rs1 = st.execute(sql1);
            System.out.println(rs1);
            boolean rs2 = st.execute(sql2);
            System.out.println(rs2);
            con.close();
        }catch (Exception e) {
            System.out.println("Unexpected Error");
        }


    }
}
