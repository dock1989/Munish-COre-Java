package jdbc;

import util.ScannerUtil;

import java.sql.*;

public class ConnectionClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // load a driver
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/college","root","logic");
        System.out.println("Enter name");
        String name = ScannerUtil.takeInput().nextLine();
        System.out.println("Enter id to be searched");
        int id = ScannerUtil.takeInput().nextInt();
//        if(connection!= null)
//            System.out.println("Connected");

        String selectQuery="select * from faculty where fac_name=? and  id = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(selectQuery);
        prepareStatement.setString(1,name);
        prepareStatement.setInt(2,id);
        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("fac_name") +" "+resultSet.getString("fac_email")
                    + " " + resultSet.getInt("id") + " " + resultSet.getString("fac_address"));
        }

    }



}
