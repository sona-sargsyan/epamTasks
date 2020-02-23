package com.company.commen;

import java.sql.*;
import java.sql.DriverManager;

/**
 * Created by sonasargsyan on 2/23/20.
 */
public class DBConnection {

    public Connection connect() throws SQLException {
        String url = "jdbc:sqlite:/Users/sonasargsyan/Documents/ElectronicDevices.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void selectAll() throws SQLException{
        String sql = "SELECT * FROM DEVICES;";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String device = rs.getString("device");
                int power = rs.getInt("power");
                int isPowerOn =rs.getInt("isPowerOn");
                System.out.println(id + "\t" +
                        device + "\t" +
                        power+ "\t" +
                        isPowerOn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            connect().close();
        }

    }
}
