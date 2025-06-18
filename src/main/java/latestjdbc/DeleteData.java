package latestjdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("Enter id");
        int id = ScannerUtil.takeInput().nextInt();

        String deleteQuery = "delete from faculty where id = ?";
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement(deleteQuery);
        ps.setInt(1,id);
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("Record deleted successfully");

    }
}
