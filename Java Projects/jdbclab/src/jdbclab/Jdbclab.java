/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbclab;
import java.sql.*;
/**
 *
 * @author Bunny <SomaSenpai.org>
 */
public class Jdbclab {
    static final String url="jdbc:mysql://localhost:3306/jdbc_db";
    static final String username="root";
    static final String password="somasenpa2020#";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        createtable(url,username,password);
    }
    
    public static void createtable(String url, String username, String password) throws Exception
    {
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement st = conn.createStatement();
        st.executeUpdate("CREATE TABLE student(" +
                                        "  `st_id` INT NOT NULL," +
                                        "  `st_name` VARCHAR(45) NOT NULL," +
                                        "  `st_branch` VARCHAR(45) NOT NULL);");
        st.executeUpdate("INSERT INTO student VALUES (1,'Varun','BCE')");
        st.executeUpdate("INSERT INTO student VALUES (2,'Soma','BRS')");
        st.executeUpdate("INSERT INTO student VALUES (3,'Tarun','ECE')");
        
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        System.out.println("The was created.\nValues in table : ");
        
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        st.close(); conn.close();
    }
}
