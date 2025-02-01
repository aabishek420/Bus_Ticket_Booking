package busTicketBooking;

import java.sql.*;

public class BusDao {

    // Method to display bus information
    public void displayInfo() throws SQLException {
        // Database connection
        Connection con = BusDbConn.getConnection();
        String query = "select * from bus";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);

        while (rs.next()) {
            System.out.println("BusNo: " + rs.getInt(1)); // Assuming first column is BusNo
            if (rs.getInt(2) == 0) {
                System.out.println("It is non-Ac");
            } else {
                System.out.println("It is Ac");
            }
            System.out.println("Capacity: " + rs.getInt(3)); // Assuming third column is Capacity
        }

//        rs.close();
//        smt.close();
//        con.close();
        System.out.println("................................");
    }


    public int getCapacity(int id) throws SQLException {
        
        String query = "SELECT capacity FROM bus WHERE id = " + id;
        Connection con = BusDbConn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
        
        
//        if (rs.next()) {
//            return rs.getInt(1); // Assuming the capacity is in the first column
//        }
//
//        // Closing resources
//        rs.close();
//        st.close();
//        con.close();
//
//        return -1; // Return -1 if bus is not found
//    }
    }
}