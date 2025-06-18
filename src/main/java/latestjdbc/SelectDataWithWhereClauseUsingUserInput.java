package latestjdbc;

import util.ConnectionClass;
import util.ScannerUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataWithWhereClauseUsingUserInput {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Enter the id you want to search");
        int id = ScannerUtil.takeInput().nextInt();
       String selectQuery = "select * from faculty where id = ?";
        PreparedStatement ps = ConnectionClass.getConnection().prepareStatement(selectQuery);
        ps.setInt(1,id);
        ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("fac_name")+" "+resultSet.getString("fac_email")
            +" " +resultSet.getString("id") + resultSet.getString("fac_address")
            );
        }

    }
}
