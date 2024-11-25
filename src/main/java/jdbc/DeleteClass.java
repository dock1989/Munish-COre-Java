package jdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        System.out.println("Enter id to be deleted");
        int id = ScannerUtil.takeInput().nextInt();

//        if(connection!= null)
//            System.out.println("Connected");

        String deleteQuery="delete from faculty where id = ?";
        PreparedStatement prepareStatement = ConnectionClass.getConnection().prepareStatement(deleteQuery);

        prepareStatement.setInt(1,id);
        int i = prepareStatement.executeUpdate();
        if(i>0)
            System.out.println("Record Deleted Successfully");

    }



}
