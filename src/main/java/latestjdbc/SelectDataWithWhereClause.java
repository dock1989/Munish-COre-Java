package latestjdbc;

import util.ConnectionClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataWithWhereClause {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String selectQuery = "select * from faculty where id = 7";
        Statement statement = ConnectionClass.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);
        while(resultSet.next()){
            System.out.println(resultSet.getString("fac_name")+" "+resultSet.getString("fac_email")
            +" " +resultSet.getString("id") + resultSet.getString("fac_address")
            );
        }

    }
}
