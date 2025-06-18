package latestjdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String name,email,address;
        System.out.println("Enter name");
        name = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter email");
        email = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter address");
        address = ScannerUtil.takeInput().nextLine();
        String insertQuery = "insert into faculty(fac_name,fac_email,fac_address) values (?,?,?)";
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement(insertQuery);
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,address);
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("Record inserted successfully");

    }
}
