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

            int sid = 103;
            String name = "Jasmine";
            int marks = 52;



            String url = "jdbc:postgresql://localhost:5432/demo";
            String username = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");
             /* The way to do a query is a statement */
            String sql1 = "select name from student where  sid = 1";
            String sql2 = "select * from student";

            String sql3 = "insert into student values (5, 'John', 48)";

            String sql4 = "update student set name='Max' where sid=5";

            String sql5 = "delete from student where sid=5";

            /* This is too complex
            this can be replaced
            with a prepared statement
            */
//            String sql6 = "insert into student values (" + sid + ", '" + name + "' ," +  marks  + ")";




            String sql = "insert into student values (?,?,?)";


//          Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,username,password);

            System.out.println("Connection Established");

            /* Prepare statement */
            PreparedStatement st = con.prepareStatement(sql); // It returns a precompiled query

            st.setInt(1, sid);
            st.setString(2, name);
            st.setInt(3, marks);

            st.execute();


            /* Create statement */
//            Statement st = con.createStatement();

            /* Execute statement */
//            ResultSet rs = st.executeQuery(sql)
//          String name = rs.getString("name");
//          System.out.println(name);



            // read rows on the table
//            while(rs.next()){
//                System.out.print(rs.getInt(1) + " - ");
//                System.out.print(rs.getString(2) + " - ");
//                System.out.println(rs.getInt(3));
//            }

//            System.out.println(rs.next()); // true
//            rs.next(); // It points to the first record;

            /* Example of insert a new row */
//            boolean status = st.execute(sql3);
//            System.out.println(status);

//            /* Example of update a row */
//            st.execute(sql4);

            /* Example of delete a row */
//            st.execute(sql6);

            /* Close the connection */
            st.close();
            System.out.println("Connection Closed");



            /* The way to do a query is a statement
            *
            *
            */


    }
}