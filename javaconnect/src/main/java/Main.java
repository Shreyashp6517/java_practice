import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection(
                "jdbc:h2:~/collegedb",
                "sa",
                ""
        );

        System.out.println("Connected");

        Statement stmt = con.createStatement();

        stmt.execute("CREATE TABLE IF NOT EXISTS student(id INT PRIMARY KEY, name VARCHAR(50))");

        stmt.executeUpdate("INSERT INTO student VALUES(5,'Abhishek')");
        stmt.executeUpdate("INSERT INTO student VALUES(6,'Sahil')");
        stmt.executeUpdate("INSERT INTO student VALUES(7,'Bhavesh')");
        stmt.executeUpdate("INSERT INTO student VALUES(8,'Anjali')");

        ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");

        System.out.println("______Student______");
        while(rs.next()) {
            System.out.println(rs.getInt("id")+" "+ rs.getString("name"));
        }

        stmt.executeUpdate("UPDATE STUDENT SET NAME='Rani' WHERE ID=7");

        rs = stmt.executeQuery("SELECT * FROM STUDENT");

        System.out.println("After Update");
        while(rs.next()) {
            System.out.println(rs.getInt("id")+" "+ rs.getString("name"));
        }

        stmt.executeUpdate("DELETE FROM STUDENT WHERE id=5");

        rs = stmt.executeQuery("SELECT * FROM STUDENT");

        System.out.println("After Delete");
        while(rs.next()) {
            System.out.println(rs.getInt("id")+" "+ rs.getString("name"));
        }

        con.close();
    }
}