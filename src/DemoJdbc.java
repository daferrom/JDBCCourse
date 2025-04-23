import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {
        /*
            *Import package
            * load and register
            * create connection
            * create statement
            * execute statement
            * process the results
            * close
        */
            String url = "jdbc:postgresql://localhost:5432/demo";
            String username = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");
             /* The way to do a query is a statement */
            String sql = "select name from student where  sid = 1";
            String sql2 = "select * from student";

//          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established");

            /* Create statement */
            Statement st = con.createStatement();

            /* Execute statement */
//            ResultSet rs = st.executeQuery(sql)
//          String name = rs.getString("name");
//          System.out.println(name);
            ResultSet rs = st.executeQuery(sql2);

            while(rs.next()){
                System.out.print(rs.getInt(1) + " - ");
                System.out.print(rs.getString(2) + " - ");
                System.out.println(rs.getInt(3));
            }
//            System.out.println(rs.next()); // true
//            rs.next(); // It points to the first record;



            /* Close the connection */
            con.close();
            System.out.println("Connection Closed");



            /* The way to do a query is a statement
            *
            *
            */


    }
}