package latestjdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class UpdateData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String name,email,address;
        int id;
        System.out.println("Enter name");
        name = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter email");
        email = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter address");
        address = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter id whose record needs to update");
        id= ScannerUtil.takeInput().nextInt();
        String insertQuery = "update faculty set fac_name=?, fac_email=?, fac_address=? where id = ?";
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement(insertQuery);
        ps.setString(1,name);
        ps.setString(2,email);
        ps.setString(3,address);
        ps.setInt(4,id);
        int i = ps.executeUpdate();
        if(i>0)
            System.out.println("Record updated successfully");

    }
}
