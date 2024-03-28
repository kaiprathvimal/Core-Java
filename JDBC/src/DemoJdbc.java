import  java.sql.*;//import package
public class DemoJdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "000";
        String sql = "select sname from students where sid=2;";
        try{
            /*
            import package
            load and register driver
            create connection
            create statement
            execute statement
            process and run statement
            close
            */
            //Class.forName("org.postgresql.Driver");//load and register driver
            Connection con = DriverManager.getConnection(url,uname,pass);//create connection
            System.out.println("Connection established");
            Statement st = con.createStatement();//create statement
            ResultSet rest = st.executeQuery(sql);//execute statement
            rest.next();
            System.out.println(rest.getString("sname"));
            //String result = rest.getString("sname");
           // System.out.println(result);

            con.close();//Close
            System.out.println("connection closed");




        } catch (Exception e) {
            System.out.println("Unexpected Error" + e);
        }

    }
}
