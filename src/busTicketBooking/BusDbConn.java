package busTicketBooking;

import java.sql.*;

public class BusDbConn {

    private static final String url = "jdbc:mysql://localhost:3306/bus_db";
    private static final String username = "root";
    private static final String password = "Ak420@#143";

  
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
