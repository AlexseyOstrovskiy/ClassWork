import java.sql.*;

public class h2Server  {
    Connection conn = DriverManager.getConnection(

            "jdbc:h2:mem:epam-training", // URL

            "user", // User

            "password"); // Password

    public h2Server() throws SQLException {
    }

    Statement statement = conn.createStatement();

    PreparedStatement preparedStatement = conn.prepareStatement(

            "SELECT * FROM PERSON WHERE NAME LIKE ? ORDER BY ID");
}
