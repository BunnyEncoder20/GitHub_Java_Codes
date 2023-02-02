import java.sql.*;


public class day5_1 {
    // SQL 4 languages 
    // DataDefinationLanguage : Create, Alter, Drop, Truncate, Rename 
    // DataManipulationLaguage : Insert, update, select, delete
    // ***********
    // 
    // JDBC 
    // Basic steps to use database in java : 
    //      1. Establish the connection 
    //      2. creat JDBC statements 
    //      3. execute SQL statements
    //      4. Get Result Set   (Only needed for select queries)
    //      5. Close Connections
    // 
    // JDBC Driver acts as a interface between the Java and the DB
    // Driver Manager standard methods ?
    public static void main(String[] args) {
        
        // 1. Establishing the connection : 
        //
        // 3 kinds of sql query fucntions : 
        //      1. executeQuery() for SELCT statements 
        //      2. executeUpdate() for INSERT, UPDATE, DELETE, or DDL statements
        //      3. execute for either type of statements

        // 1. Create statement object : 
        // -> Statement q1 = conn.createStatement();
        // String statement = "SELECT * from table"
        // 
        // 2. Create the resultSet
        //  ResultSet Rset = q1.executeQuery(statement); 
        // int count = q1.executUpdate(statement);

        // ResultSet object ; 
        // ReseultSet.next() -> used to move to the next record of the ResultSet
        //  eg: 
        // while(Rset.next()){
        //  int ssn = Rset.getInt("SSN") ;
        // String name = Rset.getString("NAME") ;
        // System.out.println(snn+"\t"+name);
        // }
    }
}
