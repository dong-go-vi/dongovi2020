package tata.creator.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class MySqlDoer {

	private Connection conn = null;

	public static void main(String[] args) {

	}
	
	public boolean getConnection() {

		boolean isSuccess = false;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			String url = "jdbc:mysql://lessonmondbinstancedev.c5tnxhxf295c.ap-northeast-2.rds.amazonaws.com/LESSONMON?useSSL=false";
//			conn = DriverManager.getConnection(url, "lessonmondev", "lessonmondev0101");
			
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/DONGOVI2020";
			conn = DriverManager.getConnection(url, "root", "1234");
			// System.out.println("연결 성공");
			
			isSuccess = true;

		} catch (Exception e) {
			System.out.println("에러: " + e);

		}
		
		return isSuccess;
	}
	
	public void closeConnection() {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
				// System.out.println("연결 해제 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
					// System.out.println("연결 해제 성공");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public String[][] selectList(String sql) {
		return selectList(sql, (String[]) null);
	}
	
	public String[][] selectList(String sql, String[] param) {
		
		String[][] data = new String[][] {{}};
		
		PreparedStatement pstmt = null; 
		try {
			pstmt = conn.prepareStatement(sql);
			for(int i=1; param!=null && i<=param.length; i++) {
				pstmt.setString(i, param[i-1]);
			}
			
			ResultSet rs = null;
			ResultSetMetaData rsmd = null; 
			
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			
			int colCnt = rsmd.getColumnCount();
			int rowCnt = 0;
			
			if ( rs!=null ) {

				String[] record = null;
				List<String[]> list = new ArrayList<String[]>();

				while(rs != null && rs.next()) {
					record = new String[colCnt]; 
					for(int c=1; c<=colCnt; c++) {
						record[c-1] =rs.getString(c); 
					}
					list.add(record);
				}
				
				rowCnt = list.size();
				data = new String[rowCnt][colCnt];

				for(int r=0; r<rowCnt; r++) {
					data[r] = (String[])list.get(r);
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
