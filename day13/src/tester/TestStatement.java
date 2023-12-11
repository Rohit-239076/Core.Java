package tester;

import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try (// 1.Establish database connection
				Connection cn = openConnection();
				// 2.create empty statement object to hold queries
				// API of connection i/f: Statement createStatement() throws SQLException){
				Statement st = cn.createStatement();
				// 3.execute select query and get resultset
				// API of Statement i/f : public ResultSet executeQuery(String sql)
				ResultSet rst= st.executeQuery("select*from users");
				) {
			//ResultSet processing
			//cursor: before 1st row
			while (rst.next()) {
				// read row data,using column position
				System.out.printf("ID %d Name %s %s Email %s Dob %s Status %b Role %s %n",
						rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),
						rst.getDate(6),rst.getBoolean(7),rst.getString(8));
			}
			System.out.println("connected to DB " + cn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
