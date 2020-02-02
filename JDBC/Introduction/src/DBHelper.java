import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private String userName = "root";
    private String password = "FDSAqwer150";
    private String dbURL = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbURL, userName, password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getErrorCode());
        System.out.println("Error : " + exception.getMessage());
    }
}
