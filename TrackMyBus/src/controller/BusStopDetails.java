package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import model.BusStopDAO;

public class BusStopDetails {

	public static void main(String args[]) {

		ArrayList busStopData = new BusStopDAO().getDetails();
		try {
			while (busStopData.next()) {
				System.out.println("Bus ID=" + busStopData.getString("BS_Id"));
				System.out.println("Bus Name="
						+ busStopData.getString("BS_Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
