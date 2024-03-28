import  java.sql.*;
public class prepareStatementJdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String upas = "000";
        String sql = "insert into students values(?,?,?)";
        int sid = 100;
        String stname = "mass";
        int stmark = 23;
        try {
            Connection con = DriverManager.getConnection(url,uname,upas);
            System.out.println("Connection Established");
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,sid);
            st.setString(2,stname);
            st.setInt(3,stmark);

            st.execute();
            System.out.println(st);
            st.close();

        }catch (Exception e) {
            System.out.println("Unexpected Error");
        }
    }
}
