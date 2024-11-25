package jdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println("Enter name");
        String name = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter email");
        String email = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter address");
        String address = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter id to be updated");
        int id = ScannerUtil.takeInput().nextInt();

//        if(connection!= null)
//            System.out.println("Connected");

        String updateQuery="update faculty\n" +
                "set fac_name = ? , fac_email=? , fac_address = ? \n" +
                "where id = ?";
        PreparedStatement prepareStatement = ConnectionClass.getConnection().prepareStatement(updateQuery);
        prepareStatement.setString(1,name);
        prepareStatement.setString(2,email);
        prepareStatement.setString(3,address);
        prepareStatement.setInt(4,id);
        int i = prepareStatement.executeUpdate();
        if(i>0)
            System.out.println("Record Updated Successfully");

    }



}
