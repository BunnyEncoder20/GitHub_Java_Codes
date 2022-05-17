import java.sql.* ;
//import to run this code by using "Run Java" and not the default "Run Code"
//Only then the reference libraries work

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Class.forName("com.mysql.cj.jdbc.Driver");  //class name to load the JDBC driver into memory
        String url = "jdbc:mysql://localhost:3306/jdbc_db" ;
        String user = "root" ;
        String password = "somasenpai2020#" ;

        maketable();
        fetchmanagers(url,user,password);
        updatemanagers(url,user,password);
        deleteclerks(url,user,password);
        try{
            deleteRows(url,user,password);
        }catch(no_table_exception e){System.out.println("The Table does not exist ! \nERROR : "); e.printStackTrace();}
        
    }




    public static void maketable() throws Exception{
            
        String driver = "com.mysql.cj.jdbc.Driver" ;   
        //com.mysql.jdbc.Driver is deprecated, use com.mysql. cj .jdbc.Driver instead

        String url = "jdbc:mysql://localhost:3306/jdbc_db" ;
        //url specifies the db we gonna work on
        //be careful with the url format. port number by default is 3306
        //single / after the localhost:portnumber
        //format : jdbc:mysql://localhost:3306/<db_nmae>


        String user = "root" ;  //username
        String password = "somasenpai2020#" ; //password for username

        Class.forName(driver);                          //load & registering the driver
                                                                    //throws class not found exception

        Connection conn = DriverManager.getConnection(url, user, password);
        //make the connection to the db using type Connection
        //getConnection is part of DriverManager class

        System.out.println("\nConnected to DB");

        Statement st = conn.createStatement();
        //makes a object using which we'll be writing the quesries 
        // String query = ;
        st.executeUpdate("insert into employee values(1 , 'Varun' , 'IT HOD' )" );
        st.executeUpdate("insert into employee values(2 , 'Somya' , 'Manager' )" );
        st.executeUpdate("insert into employee values(3 , 'Tarun' , 'Manager' )" );
        st.executeUpdate("insert into employee values(4 , 'Bunnu' , 'clerk')" );
        st.executeUpdate("insert into employee values(5 , 'Hooda' , 'clerk')" );
        //some functions are query specific 
        //executeUpdate works for update,insert,delete quesries 
        System.out.println("\nTable created Successfully");

        ResultSet rs = st.executeQuery("select * from employee");
        //ResultSet type enables us to store tabular data
        //st.executeQuery("<sql query>") takes sql quesries in form of string
        
        // rs.next();  //brings the pointer to the actual first data on table
        while(rs.next()){
            System.out.println(rs.getString(1)+"    "+rs.getString(2)+"     "+rs.getString(3));
            //rs.getstring(<column index> or <column name>)
        }
        

        // System.out.println(names);
        st.close(); 
        conn.close();
    }

    public static void fetchmanagers(String url, String user, String password) throws Exception
    {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        ResultSet rs= st.executeQuery("Select ename from employee where designation = 'Manager'");

        System.out.println("\nFetching the Employee names who designation = Manager");
        // rs.next();
        while(rs.next()){
            System.out.println(rs.getString(1));
            //rs.<columnsindex> start from 1 and not 0
        }

        st.close();
        conn.close();
    }


    public static void updatemanagers(String url, String user, String password) throws Exception
    {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        st.executeUpdate("Update employee SET designation = 'MGR' where designation = 'Manager'");
        ResultSet rs = st.executeQuery("Select * from employee") ;

        System.out.println("\nDisplaying the table after updation of managers :");
        while(rs.next()){
            System.out.println(rs.getString(1)+"    "+rs.getString(2)+"     "+rs.getString(3));
        }
        
        st.close();
        conn.close();
    }

    public static void deleteclerks(String url, String user, String password) throws Exception
    {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        st.executeUpdate("delete from employee where designation = 'clerk' ");
        int rows_affected = st.getUpdateCount();
        //st.getUpdateCount() gets the number of rows affected by the latest .executeupdate() command
        //should immedeately follow the .excuteUpdate statement
        ResultSet rs = st.executeQuery("Select * from employee"); 

        System.out.println("\nThe Table after deleting the clerks : ");
        while(rs.next()){
            System.out.println(rs.getString(1)+"    "+rs.getString(2)+"     "+rs.getString(3));
        }
        System.out.println("\nThe numbers of rows affected : " + rows_affected);
        
        conn.close(); st.close();
    }

    public static void deleteRows(String url, String user, String password) throws no_table_exception,SQLException
    {
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement st = conn.createStatement();
        DatabaseMetaData dbmd  = conn.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "employee", null);
        
        if(rs.next()){
            st.execute("delete from employee where id=1;");
            st.execute("delete from employee where id=2;");
            st.execute("delete from employee where id=3;");
            System.out.println("\nThe rows of table Employee were deleted");
        }
        else{
            throw new no_table_exception("\nThe table does not exist !");
        }
        
        conn.close(); st.close();
    }


    //end of class
}

class no_table_exception extends Exception{
    no_table_exception(String message)   //constructor
    { 
        super(message);     //for super class Exception
    }   
} 