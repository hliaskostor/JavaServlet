package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AirportDB {
	
	public static Connection Connection() throws SQLException  {
	
			Connection conn=null;
			Connection con=null;
			String url ="jdbc:postgresql://localhost:5432/airpotDB";
			String user ="postgres";
			String password="0000";
			Statement stmt= conn.createStatement();
			try {
				@SuppressWarnings("resource")
				Scanner query = new Scanner(System.in);
				System.out.println("Please enter a mumber from 1 to 6");
		        while(query.hasNextLine());
				int i= query.nextInt();
		        if(i==1) {
		        	ResultSet rset= stmt.executeQuery("SELECT t.passenger_name, b.book_date "
							+ "FROM flight AS f INNER JOIN boardingpass as bp ON f.flight_no = bp.flight_no INNER JOIN ticket AS t ON bp.passenger_name = t.passenger_name INNER JOIN book AS b ON t.book_ref = b.book_ref "
							+ "WHERE f.departure_date = '08/07/2022' AND f.flight_no = '1A' ;");
					ResultSetMetaData metaData=rset.getMetaData();
		        	int numberOfColumns= metaData.getColumnCount();
		        	while(rset.next()) {
		        		for(int j=1; j<=numberOfColumns; j++) {
		        			System.out.print(rset.getObject(j));
		        		}
		        		System.out.println();
		        	}		        		
				}else if(i==2) {
					ResultSet rset= stmt.executeQuery("\r\n"
							+ "   INNER JOIN boardingpass as bp ON f.flight_no = bp.flight_no\r\n"
							+ "   INNER JOIN ticket AS t ON bp.passenger_name = t.passenger_name\r\n"
							+ "   INNER JOIN book AS b ON t.book_ref = b.book_ref\r\n"
							+ "WHERE f.departure_date = '08/07/2022' AND f.flight_no = '1A' ) \r\n"
							+ "AS space_rem FROM flight AS f INNER JOIN aircraft AS a ON  a.aircraft_model = f.aircraft_model\r\n"
							+ "WHERE f.flight_no = '1A' ;");
					ResultSetMetaData metaData=rset.getMetaData();
		        	int numberOfColumns= metaData.getColumnCount();
		        	while(rset.next()) {
		        		for(int j=1; j<=numberOfColumns; j++) {
		        			System.out.print(rset.getObject(j));
		        		}
		        		System.out.println();
		        	}		        		
				}else if(i==3) {
					ResultSet rset= stmt.executeQuery("SELECT * FROM flight WHERE extract(year from departure_date)='2022' order by (actual_departure_time - scheduled_departure_time) desc LIMIT 5;");
					ResultSetMetaData metaData=rset.getMetaData();
		        	int numberOfColumns= metaData.getColumnCount();
		        	while(rset.next()) {
		        		for(int j=1; j<=numberOfColumns; j++) {
		        			System.out.print(rset.getObject(j));
		        		}
		        		System.out.println();
		        	}		        		
				}else if(i==4) {
					ResultSet rset= stmt.executeQuery("SELECT SUM(f.distance) AS distance_travelled , t.passenger_name FROM flight AS f\r\n"
							+ "INNER JOIN boardingpass AS bp ON f.flight_no = bp.flight_no \r\n"
							+ "INNER JOIN ticket AS t ON bp.passenger_name = t.passenger_name\r\n"
							+ "WHERE EXTRACT (year FROM f.departure_date)='2022' \r\n"
							+ "GROUP BY t.passenger_name\r\n"
							+ "ORDER BY distance_travelled DESC LIMIT 5;");
					ResultSetMetaData metaData=rset.getMetaData();
			        int numberOfColumns= metaData.getColumnCount();
			        while(rset.next()) {
			        	for(int j=1; j<=numberOfColumns; j++) {
			        		System.out.print(rset.getObject(j));
			        	}
			        	System.out.println();
			        }		
				}else if(i==5) {
					ResultSet rset= stmt.executeQuery("SELECT t.passenger_name, SUM(f.distance) AS distance_travelled FROM flight AS f\r\n"
							+ "INNER JOIN boardingpass AS bp ON f.flight_no = bp.flight_no \r\n"
							+ "INNER JOIN ticket AS t ON bp.passenger_name = t.passenger_name\r\n"
							+ "WHERE EXTRACT (year FROM f.departure_date)='2022' \r\n"
							+ "GROUP BY t.passenger_name\r\n"
							+ "ORDER BY distance_travelled DESC LIMIT 5;");
					ResultSetMetaData metaData=rset.getMetaData();
			        int numberOfColumns= metaData.getColumnCount();
			        while(rset.next()) {
			        	for(int j=1; j<=numberOfColumns; j++) {
			        		System.out.print(rset.getObject(j));
			        	}
			        	System.out.println();
			        }	
				}else {
					ResultSet rset= stmt.executeQuery("\r\n"
							+ "INNER JOIN boardingpass AS bp ON t.passenger_name = bp.passenger_name\r\n"
							+ "WHERE bp.boarding_no=1\r\n"
							+ "GROUP BY t.passenger_name\r\n"
							+ "HAVING COUNT(*) > 2 \r\n"
							+ "ORDER BY count_no DESC LIMIT 5;");
					ResultSetMetaData metaData=rset.getMetaData();
			        int numberOfColumns= metaData.getColumnCount();
			        while(rset.next()) {
			        	for(int j=1; j<=numberOfColumns; j++) {
			        		System.out.print(rset.getObject(j));
			        	}
			        	System.out.println();
			        }	
				}		        
		        if (stmt != null) {
		        	stmt.close();
		        }

		        if (conn!= null) {
		            conn.close();
		        }
		        
			}catch (SQLException e) {
				System.out.println("Exception" + e);
			}
			return conn;
		} 
		
	}
	

        
        
