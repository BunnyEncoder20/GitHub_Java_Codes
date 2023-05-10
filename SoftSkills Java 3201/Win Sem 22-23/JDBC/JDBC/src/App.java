import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Loading the Driver dynamically at run time (need the downloaded driver though)
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection parameters 
        String url = "jdbc:mysql://localhost:3307/";
        String user = "root";
        String pwd = "";

        // Creating the database 
        try (Connection conn = DriverManager.getConnection(url,user,pwd) ; Statement stmt = conn.createStatement();){
            String query = "CREATE DATABASE IF NOT EXISTS jdbc_db";
            stmt.executeUpdate(query);
            System.out.println("Database created susccessfully !!!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

        // Connecting to the database 
        try (Connection conn = DriverManager.getConnection(url+"jdbc_db",user,pwd)){
            System.out.println("Connected to the DB successfully !!!");

            // Creating the table and inserting values 
            try(Statement stmt = conn.createStatement()){
                String q1 =   "CREATE TABLE IF NOT EXISTS emp (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), age INT, PRIMARY KEY(id) )";
                stmt.executeUpdate(q1);
                System.out.println("Table created successfully !!!");

                q1 = "INSERT INTO emp (name, age) VALUES"+
                        "('John F',25),"+
                        "('Jane J',26),"+
                        "('Bunny',21)" ;
                stmt.executeUpdate(q1);
                System.out.println("Rows have been inserted !!!");
            }

            // Fetching the Records from the table and displaying them : 
            try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM emp")){
                System.out.println("Feteching entries from Table Emp : ");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID : "+id+"     Name : "+name+"     Age : "+age);
                }
            }

            // Modifying the records in the Table emp (changing a record(s))
            try(Statement stmt = conn.createStatement()){
                int rowsupdated = stmt.executeUpdate("UPDATE emp SET age=26 WHERE name = 'John F' ");
                System.out.println(rowsupdated+" rows updated !!!");
            }

            // Modifying (deleting a record) from table emp
            try(Statement stmt = conn.createStatement()){
                int rowsupdated = stmt.executeUpdate("DELETE FROM emp WHERE name='Jane J' ");
                System.out.println(rowsupdated+" rows deleted");
            }

            // Fetching the records to see changes 
            try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM emp ") ){
                System.out.println("Check out the changes in the table : ");
                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    System.out.println("ID : "+id+"     Name : "+name+"     Age : "+age);
                }
            }

            // Modifying (deleting all records) from table 
            try (Statement stmt = conn.createStatement()){
                stmt.executeUpdate("truncate emp ");
                System.out.println("All records of tabale deleted !!!");
            }

            // Modifing the table (deleting the table)
            try(Statement stmt = conn.createStatement()){
                stmt.executeUpdate("DROP TABLE IF EXISTS emp");
                System.out.println("Table Dropped successfully !!!");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        // Deleting the DB and closing the connectionn
        try(Connection conn = DriverManager.getConnection(url,user,pwd); Statement stmt = conn.createStatement()){
            stmt.executeUpdate("DROP DATABASE IF EXISTS jdbc_db ");
            System.out.println("Dropped the DB successfully !!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
