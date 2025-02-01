package busTicketBooking;

import java.sql.*;

public class BookingDao {
    public int getBookedCount(int busno, Date date) throws SQLException {
    	return 0;
    }

    public void addBooking(Costumeinfo book) throws SQLException {
        String query = "insert into booking values (?, ?, ?)";
        java.sql.Date sqldate = new java.sql.Date(book.date.getTime());
        Connection con = BusDbConn.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, book.cosname); 
        pst.setInt(2, book.busno); 
        pst.setDate(3, sqldate);
        pst.executeUpdate();
        
       
    }
}
    

