import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Employee";

        // Data to add
        String query = "INSERT INTO employee_data (empname, empage, esalary) VALUES" +
                "('Jenny', 25, 10000)," +
                "('Jacky', 30, 20000)," +
                "('Joe', 20, 40000)," +
                "('John', 40, 80000)," +
                "('Sameer', 25, 90000);";
        System.out.println(query);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(
                    url, "root", "root");
            Statement statement = connection.createStatement();

            System.out.println("Executing SQL statement ...");
            int count = statement.executeUpdate(query);
            System.out.println("Number of records inserted: " + count);

            statement.close();
            connection.close();
            System.out.println("Connection closed");

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
