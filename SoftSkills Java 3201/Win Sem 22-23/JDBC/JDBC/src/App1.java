import java.sql.*;

public class App1{
    public static void main (String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/";
        String usr = "root";
        String pwd = "";

        try(Connection conn = DriverManager.getConnection(url,usr,pwd); Statement stmt = conn.createStatement()){
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS jdbc_db1");
            System.out.println("Created DB...");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        Connection conn = DriverManager.getConnection(url+"jdbc_db1",usr,pwd);
        Statement stmt = conn.createStatement();

        try{
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS emp ( id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), age INT, PRIMARY KEY(id))");
            System.out.println("Created Table...");
            int rows = stmt.executeUpdate("INSERT INTO emp(name,age) VALUES ('Bunny',10),('Soma',10),('Tarun',8)");
            System.out.println(rows+" inserted into table...");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        try(ResultSet rs = stmt.executeQuery("SELECT * FROM emp")){
            while(rs.next()){
                int id = rs.getInt("id"); String name = rs.getString("name"); int age = rs.getInt("age");
                System.out.println("ID : "+id+"\tName : "+name+"\tAge : "+age);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            int rows = stmt.executeUpdate("UPDATE emp SET age=20 where name='soma' ");
            System.out.println(rows+" number of rows updated...");
            rows = stmt.executeUpdate("DELETE FROM emp WHERE name = 'Bunny' ");
            System.out.println(rows+" number of rows updated...");
        } catch (SQLException e){ System.out.println(e.getMessage());}

        try(ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE age=20")){
            while(rs.next()){
                int id = rs.getInt("id"); String name = rs.getString("name"); int age = rs.getInt("age");
                System.out.println("ID : "+id+"\tName : "+name+"\tAge : "+age);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        try{
            stmt.executeUpdate("DROP DATABASE IF EXISTS jdbc_db1");
            System.out.println("Dropped DB...");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        conn.close();
    }
}