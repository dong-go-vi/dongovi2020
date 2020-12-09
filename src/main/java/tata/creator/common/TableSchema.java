package tata.creator.common;

public class TableSchema {

	public static void main(String[] args) {
		
		TableSchema tableSchema = new TableSchema();
		
		String[][] schema = new String[][]{{}};
		
		schema = TableSchema.getTableList();
		tableSchema.printArray2D(schema);
			
		// schema = TableSchema.getColumnList("CRTMBR");
		// tableSchema.printArray2D(schema);

	}
	
	public static String[][] getTableList() {
		
		MySqlDoer doer = new MySqlDoer();
		
		String[][] schema = new String[][]{{}};
		
		if ( doer.getConnection() ) {
			System.out.println("...");
			schema = doer.selectList(sql01.toString());
			doer.closeConnection();
		}
		
//		for(int s=0; s<schema.length; s++) {
//			System.out.print("" + (s+1) );
//			for(int t=0; t<schema[s].length; t++) {
//				System.out.print(" || ");
//				System.out.print(schema[s][t]);
//			}
//			System.out.print("\n");
//		}
		
		return schema;  
	}
	
	public static String[][] getColumnList(String table) {
		
		MySqlDoer doer = new MySqlDoer();
		
		String[][] schema = new String[][]{{}};
		
		if ( doer.getConnection() ) {
			System.out.println("...");
			schema = doer.selectList(sql02.toString(), new String[] {table});
			doer.closeConnection();
		}
		
//		for(int s=0; s<schema.length; s++) {
//			System.out.print("" + (s+1) );
//			for(int t=0; t<schema[s].length; t++) {
//				System.out.print(" || ");
//				System.out.print(schema[s][t]);
//			}
//			System.out.print("\n");
//		}
		
		return schema;  
	}
	
	private void printArray2D(String[][] schema) {
		
		for(int s=0; s<schema.length; s++) {
			System.out.print("" + (s+1) );
			for(int t=0; t<schema[s].length; t++) {
				System.out.print(" || ");
				System.out.print(schema[s][t]);
			}
			System.out.print("\n");
		}
	}
	
	/**
	 * table list
	 */
	private static StringBuffer sql01 = new StringBuffer(
			  "SELECT TABLE_SCHEMA, UPPER(TABLE_NAME) TABLE_NAME, TABLE_COMMENT, DATE_FORMAT(NOW(),'%Y.%m.%d') TODAY " + "\n" 
			+ "FROM INFORMATION_SCHEMA.TABLES " + "\n"
			+ "WHERE 1=1 " + "\n"
			+ "	AND TABLE_SCHEMA='DONGOVI2020' " + "\n"
			+ "	AND TABLE_NAME LIKE 'TB%' " + "\n"
			// + "	AND TABLE_NAME = 'CRTMBR' " + "\n"
		);
	
	/**
	 * column list
	 */
	private static StringBuffer sql02 = new StringBuffer(
			  "SELECT                                                               " + "\n" 
			+ "	TABLE_SCHEMA,UPPER(TABLE_NAME) TABLE_NAME,UPPER(COLUMN_NAME) COLUMN_NAME,ORDINAL_POSITION,COLUMN_DEFAULT " + "\n" 
			+ "	, DATA_TYPE,COLUMN_TYPE,COLUMN_KEY,EXTRA,COLUMN_COMMENT             " + "\n" 
			+ "FROM INFORMATION_SCHEMA.COLUMNS                                      " + "\n" 
			+ "WHERE 1=1                                                            " + "\n" 
			+ "	AND TABLE_SCHEMA='DONGOVI2020'                                        " + "\n" 
			+ "	AND TABLE_NAME = ?                                                  " + "\n" 
			// + "	AND TABLE_NAME LIKE 'CRT%'                                          " + "\n" 
			+ "ORDER BY TABLE_SCHEMA, TABLE_NAME, ORDINAL_POSITION                  " + "\n" 
		);
}


/*
SELECT TABLE_SCHEMA, UPPER(TABLE_NAME) TABLE_NAME, TABLE_COMMENT, DATE_FORMAT(NOW(),'%Y.%m.%d') TODAY 
FROM INFORMATION_SCHEMA.TABLES
WHERE 1=1 
	AND TABLE_SCHEMA='LESSONMON'
	AND TABLE_NAME = 'CRTMBR' 
	AND TABLE_NAME LIKE 'CRT%' 
*/