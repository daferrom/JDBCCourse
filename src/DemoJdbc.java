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
            String username = "postgres";
            String password = "Francia2024@1234";

//            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,username,password);

            System.out.println("Connection Established");
    }
}