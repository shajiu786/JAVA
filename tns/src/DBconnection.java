import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(
                    DBconfig.url,
                    DBconfig.user,
                    DBconfig.password
            );

            System.out.println("✅ Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
