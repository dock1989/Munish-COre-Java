package jdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class InsertClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println("Enter name");
        String name = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter email");
        String email = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter address");
        String address = ScannerUtil.takeInput().nextLine();

//        if(connection!= null)
//            System.out.println("Connected");

        String insertQuery="insert into faculty(fac_name,fac_email,fac_address) values (?,?,?)";
        PreparedStatement prepareStatement = ConnectionClass.getConnection().prepareStatement(insertQuery);
        prepareStatement.setString(1,name);
        prepareStatement.setString(2,email);
        prepareStatement.setString(3,address);
        int i = prepareStatement.executeUpdate();
        if(i>0)
            System.out.println("Record Inserted Successfully");

    }



}
