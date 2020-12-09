package tata.creator.be;

import tata.creator.common.FileUtils;
import tata.creator.common.TableSchema;

public class GracefulCreator {


	
	
	/** base path */
	// private static final String BASE_PATH = "D:/lessonmon/workspace/tata/src/tata/creator/be/";
	// private static final String BASE_PATH = "D:/lessonmon/workspace/lessonmon-webservice/src/main/java/tata/creator/be/";
	// private static final String BASE_PATH = "C:/_devketerius/workspaces/workspace2/devketerius-mytest1/src/main/java/tata/creator/be/";
	private static final String BASE_PATH = "C:/_devketerius/workspaces/workspace2/dongovi2020/src/main/java/tata/creator/be/";
	
	/** entity(table) model */
	private static final String ENTITY_VO_PATH = BASE_PATH + "output/common/model/entity/";
	private static final String ENTITY_VO_TEMPLATE_PATH = BASE_PATH + "input/template/ENTITY_VO.txt";
	
	private static final String ENTITY_VO_TEMPLATE_PROPERTY_TXT = "	private ##TYPE## ##COLUMN_NAME##; // ##COLUMN_COMMENT## \n";
	private static final String ENTITY_VO_TEMPLATE_GETTER_SETTER_TXT = ""
			+ "	public void ##SETTER_NAME##(##TYPE## ##COLUMN_NAME##) { \n"
			+ "		this.##COLUMN_NAME## = ##COLUMN_NAME##; \n"
			+ "	} \n"
			+ "	public ##TYPE## ##GETTER_NAME##() { \n"
			+ "		return ##COLUMN_NAME##; \n"
			+ "	} \n"
			+ "	\n"
			;

	/** extend(biz) model */
	private static final String EXTEND_VO_PATH = BASE_PATH + "output/common/model/extend/";
	private static final String EXTEND_VO_TEMPLATE_PATH = BASE_PATH + "input/template/EXTEND_VO.txt";

	/** mybatis mapper xml */
	private static final String MYBATIS_PATH = BASE_PATH + "output/mapper/";
	private static final String MYBATIS_TEMPLATE_PATH = BASE_PATH + "input/template/MYBATIS-BASIC-MAPPER"; // .txt";

	
	/** DAO */
	private static final String DAO_PATH = BASE_PATH + "output/biz/dao/";
	private static final String DAO_TEMPLATE_PATH = BASE_PATH + "input/template/Dao"; // .txt";

	/** Service */
	private static final String SERVICE_PATH = BASE_PATH + "output/biz/service/";
	private static final String SERVICE_TEMPLATE_PATH = BASE_PATH + "input/template/Service"; // .txt";	

	/** Restful */
	private static final String RESTFUL_PATH = BASE_PATH + "output/biz/restful/";
	private static final String RESTFUL_TEMPLATE_PATH = BASE_PATH + "input/template/Restful"; // .txt";	
	
	// ======================================
	// read template
	static String tableVoTemplate = FileUtils.readFileLines(ENTITY_VO_TEMPLATE_PATH).toString(); // ##TABLE_NAME## ##TABLE_COMMENT## ##TODAY## ##PROPERTY_AREA## ##GETTER_SETTER_AREA##
	static String bizVoTemplate = FileUtils.readFileLines(EXTEND_VO_TEMPLATE_PATH).toString(); // ##TABLE_NAME## ##BIZ_NAME## ##TODAY## 
	
	static String mybatisTemplate = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + ".txt").toString();  
	static String mybatisTemplate_eachtables = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_eachtables.txt").toString();  
	static String mybatisTemplate_orm = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_orm.txt").toString();  
	static String mybatisTemplate_insert_columns = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_insert_columns.txt").toString();  
	static String mybatisTemplate_insert_values = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_insert_values.txt").toString();  
	// static String mybatisTemplate_insert_usekey = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_insert_usekey.txt").toString();  
	// static String mybatisTemplate_select_columns = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_select_columns.txt").toString();  
	static String mybatisTemplate_update_set = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_update_set.txt").toString();  
	// static String mybatisTemplate_where = FileUtils.readFileLines(MYBATIS_TEMPLATE_PATH + "_where.txt").toString();  

	static String daoTemplate = FileUtils.readFileLines(DAO_TEMPLATE_PATH + ".txt").toString();  
	static String daoTemplate_import_vo = FileUtils.readFileLines(DAO_TEMPLATE_PATH + "_import_vo.txt").toString();  
	static String daoTemplate_eachtables = FileUtils.readFileLines(DAO_TEMPLATE_PATH + "_eachtables.txt").toString();  
	static String daoTemplate_eachtables_autokey = FileUtils.readFileLines(DAO_TEMPLATE_PATH + "_eachtables_autokey.txt").toString();  
	static String daoTemplate_eachtables_general = FileUtils.readFileLines(DAO_TEMPLATE_PATH + "_eachtables_general.txt").toString();  

	static String serviceTemplate = FileUtils.readFileLines(SERVICE_TEMPLATE_PATH + ".txt").toString();  
	static String serviceTemplate_import_vo = FileUtils.readFileLines(SERVICE_TEMPLATE_PATH + "_import_vo.txt").toString();  
	static String serviceTemplate_eachtables = FileUtils.readFileLines(SERVICE_TEMPLATE_PATH + "_eachtables.txt").toString();  

	static String restfulTemplate = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + ".txt").toString();  
	static String restfulTemplate_import_vo = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + "_import_vo.txt").toString();  
	static String restfulTemplate_eachtables = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + "_eachtables.txt").toString();  
	static String restfulTemplate_eachtables_save_code_autokey = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + "_eachtables_save_code_autokey.txt").toString();  
	static String restfulTemplate_eachtables_save_code_general = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + "_eachtables_save_code_general.txt").toString();  
	static String restfulTemplate_eachtables_add_code_autokey = FileUtils.readFileLines(RESTFUL_TEMPLATE_PATH + "_eachtables_add_code_autokey.txt").toString();  

	
	static String today = "";
	
	
	public static void main(String[] args) {
		
		
		// GracefulGenerator generator = new GracefulGenerator();
		
		// SELECT TABLE_SCHEMA, TABLE_NAME, TABLE_COMMENT, DATE_FORMAT(NOW(),'%Y.%m.%d') TODAY 
		//	1 || LESSONMON || CRTCRR || CurationCurator | CRT 큐레이터
		//	2 || LESSONMON || CRTCTA || CurationContents | CRT 큐레이션 컨텐츠
		//	3 || LESSONMON || CRTCTB || CurationSectionContents | CRT 큐레이션 컨텐츠 구간 내용
		
		// TableSchema tableSchema = new TableSchema();
		String[][] tables = TableSchema.getTableList();
		String[][] columns ; 

		
		// TABLE_SCHEMA,TABLE_NAME,COLUMN_NAME,ORDINAL_POSITION,COLUMN_DEFAULT, DATA_TYPE,COLUMN_TYPE,COLUMN_KEY,EXTRA,COLUMN_COMMENT
		//	1 || LESSONMON || CRTMBR || CRT_MBR_IDX || 1 || null || int || int(11) || PRI ||  || 큐레이션 회원 IDX
		//	2 || LESSONMON || CRTMBR || MBR_EML_ID || 2 || null || varchar || varchar(100) || UNI ||  || 회원 이메일 아이디
		//	3 || LESSONMON || CRTMBR || MBR_NM || 3 || null || varchar || varchar(20) ||  ||  || 회원 이름
		//	4 || LESSONMON || CRTMBR || MBR_BY_NM || 4 || null || varchar || varchar(20) || UNI ||  || 회원 별명
		//	5 || LESSONMON || CRTMBR || MBR_HDPH_NO || 5 || null || varchar || varchar(21) ||  ||  || 회원 휴대폰 번호
		//	6 || LESSONMON || CRTMBR || LAST_AUTC_STR || 6 || null || varchar || varchar(100) ||  ||  || 최종 인증 문자열
		//	7 || LESSONMON || CRTMBR || USE_YN || 7 || null || varchar || varchar(1) ||  ||  || 사용 여부
		//	8 || LESSONMON || CRTMBR || RGNT_NO || 8 || null || int || int(11) ||  ||  || 등록자 번호
		//	9 || LESSONMON || CRTMBR || REG_DT || 9 || null || datetime || datetime ||  ||  || 등록 일시
		//	10 || LESSONMON || CRTMBR || UPDT_MN_NO || 10 || null || int || int(11) ||  ||  || 수정자 번호
		//	11 || LESSONMON || CRTMBR || UPDT_DT || 11 || null || datetime || datetime ||  ||  || 수정 일시
		
		String table, biz;
		// String tableVoTxt = null;
		
		//=============================
		// read template

		//=============================
		
		System.out.println();
		System.out.println(">>> VO 생성");
		System.out.println();

		// model VO
		for(int r=0; r<tables.length; r++) {
			
			// System.out.println("===== ===== =====");
			table = tables[r][1]; // table name
			// System.out.println("===== " + table + " =====");
			columns = TableSchema.getColumnList(table);
			biz = tables[r][2].split("\\|")[0].trim();
			
			// TABLE VO
			FileUtils.writeTextFile(ENTITY_VO_PATH, table+".java", getTableVoTxt(tableVoTemplate, tables[r], columns));
			System.out.println("	Generated ... " + ENTITY_VO_PATH + table+".java");

			// BIZ VO
			FileUtils.writeTextFile(EXTEND_VO_PATH, biz+"VO.java", getBizVoTxt(bizVoTemplate, biz, tables[r], columns));
			System.out.println("	Generated ... " + EXTEND_VO_PATH + biz+"VO.java");
		}

		//=============================

		// mybatis 
		
		// mybatisTxt
		StringBuffer mybatisTxt = new StringBuffer();
		
		for(int r=0; r<tables.length; r++) {
			System.out.println("===== ===== =====");
			table = tables[r][1]; // table name
			System.out.println("===== " + table + " =====");
			columns = TableSchema.getColumnList(table);
			
			biz = tables[r][2].split("\\|")[0].trim();
			
			mybatisTxt.append(getMybatisMapperTxt(mybatisTemplate_eachtables, biz, tables[r], columns));

		}

		String mybatisTxtFull = mybatisTemplate;
		mybatisTxtFull = mybatisTxtFull.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		mybatisTxtFull = mybatisTxtFull.replaceAll("##EACH_TABLES##", mybatisTxt.toString());

		FileUtils.writeTextFile(MYBATIS_PATH, "mybatis-basic-mapper.xml", mybatisTxtFull);
		System.out.println("	Generated ... " + MYBATIS_PATH + "mybatis-basic-mapper.xml");


		//=============================

		// DAO 
		
		// daoTxt
		StringBuffer daoTxt = new StringBuffer();
		StringBuffer daoImportVOTxt = new StringBuffer();
		
		for(int r=0; r<tables.length; r++) {
			System.out.println("===== ===== =====");
			table = tables[r][1]; // table name
			if ( r== 0 ) { today = tables[r][3]; }
			System.out.println("===== " + table + " =====");
			columns = TableSchema.getColumnList(table);
			
			biz = tables[r][2].split("\\|")[0].trim();
			
			daoTxt.append(getDaoTxt(daoTemplate_eachtables, biz, tables[r], columns));
			daoImportVOTxt.append(daoTemplate_import_vo.replaceAll("##BIZ_NAME##", biz));

		}

		String daoTxtFull = daoTemplate;
		daoTxtFull = daoTxtFull.replaceAll("##DAO_NAME##", "BizBasic"); // 
		daoTxtFull = daoTxtFull.replaceAll("##IMPORT_VO##", daoImportVOTxt.toString()); // 
		daoTxtFull = daoTxtFull.replaceAll("##EACH_TABLES##", daoTxt.toString());
		daoTxtFull = daoTxtFull.replaceAll("##TODAY##", today);

		FileUtils.writeTextFile(DAO_PATH, "BizBasicDao.java", daoTxtFull);
		System.out.println("	Generated ... " + DAO_PATH + "BizBasicDao.java");
		
		
		//=============================

		// Service  
		
		// serviceTxt
		StringBuffer serviceTxt = new StringBuffer();
		StringBuffer serviceImportVOTxt = new StringBuffer();
		
		for(int r=0; r<tables.length; r++) {
			System.out.println("===== ===== =====");
			table = tables[r][1]; // table name
			if ( r== 0 ) { today = tables[r][3]; }
			System.out.println("===== " + table + " =====");
			columns = TableSchema.getColumnList(table);
			
			biz = tables[r][2].split("\\|")[0].trim();
			
			serviceTxt.append(getServiceTxt(serviceTemplate_eachtables, biz, tables[r], columns));
			serviceImportVOTxt.append(serviceTemplate_import_vo.replaceAll("##BIZ_NAME##", biz));

		}

		String serviceTxtFull = serviceTemplate;
		serviceTxtFull = serviceTxtFull.replaceAll("##SERVICE_NAME##", "BizBasic"); // 
		serviceTxtFull = serviceTxtFull.replaceAll("##IMPORT_VO##", serviceImportVOTxt.toString()); // 
		serviceTxtFull = serviceTxtFull.replaceAll("##EACH_TABLES##", serviceTxt.toString());
		serviceTxtFull = serviceTxtFull.replaceAll("##TODAY##", today);
		serviceTxtFull = serviceTxtFull.replaceAll("##DAO_NAME##", "BizBasic");
		serviceTxtFull = serviceTxtFull.replaceAll("##dao_NAME##", "bizBasic");
		
		FileUtils.writeTextFile(SERVICE_PATH, "BizBasicService.java", serviceTxtFull);
		System.out.println("	Generated ... " + SERVICE_PATH + "BizBasicService.java");
		
		
		//=============================

		// Restful  
		
		// restfulTxt
		StringBuffer restfulTxt = new StringBuffer();
		StringBuffer restfulImportVOTxt = new StringBuffer();
		
		for(int r=0; r<tables.length; r++) {
			System.out.println("===== ===== =====");
			table = tables[r][1]; // table name
			if ( r== 0 ) { today = tables[r][3]; }
			System.out.println("===== " + table + " =====");
			columns = TableSchema.getColumnList(table);
			
			biz = tables[r][2].split("\\|")[0].trim();
			
			restfulTxt.append(getRestfulTxt(restfulTemplate_eachtables, biz, tables[r], columns));
			restfulImportVOTxt.append(restfulTemplate_import_vo.replaceAll("##BIZ_NAME##", biz));

		}

		String restfulTxtFull = restfulTemplate;
		restfulTxtFull = restfulTxtFull.replaceAll("##RESTFUL_NAME##", "BizBasic"); // 
		restfulTxtFull = restfulTxtFull.replaceAll("##IMPORT_VO##", restfulImportVOTxt.toString()); // 
		restfulTxtFull = restfulTxtFull.replaceAll("##EACH_TABLES##", restfulTxt.toString());
		restfulTxtFull = restfulTxtFull.replaceAll("##TODAY##", today);
		restfulTxtFull = restfulTxtFull.replaceAll("##DAO_NAME##", "BizBasic");
		restfulTxtFull = restfulTxtFull.replaceAll("##dao_NAME##", "bizBasic");
		restfulTxtFull = restfulTxtFull.replaceAll("##SERVICE_NAME##", "BizBasic");
		restfulTxtFull = restfulTxtFull.replaceAll("##service_NAME##", "bizBasic");
		
		FileUtils.writeTextFile(RESTFUL_PATH, "BizBasicRestful.java", restfulTxtFull);
		System.out.println("	Generated ... " + RESTFUL_PATH + "BizBasicRestful.java");
	}

	private static Object getRestfulTxt(String txt, String biz, String[] table, String[][] columns) {
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);
		txt = txt.replaceAll("##API_URI##", "/api/bizbasic");
		txt = txt.replaceAll("##SAVE_CODE##", getRestfulTxtSaveCode(biz, columns));
		txt = txt.replaceAll("##ADD_CODE##", getRestfulTxtAddCode(biz, columns));
		txt = txt.replaceAll("##DAO_NAME##", "BizBasic");
		txt = txt.replaceAll("##dao_NAME##", "bizBasic");
		txt = txt.replaceAll("##SERVICE_NAME##", "BizBasic");
		txt = txt.replaceAll("##service_NAME##", "bizBasic");
		
		return txt;
	}
	
	private static String getRestfulTxtAddCode(String biz, String[][] columns) {
		
		String txt = "";
		if ( getKeySetter(columns) != null ) {
			txt = restfulTemplate_eachtables_add_code_autokey;
			txt = txt.replaceAll("##KEY_GETTER##", getKeyGetter(columns)); //
			txt = txt.replaceAll("##KEY_SETTER##", getKeySetter(columns)); //
		} else {
			txt = "";
		}
		
		return txt;
	}

	private static String getRestfulTxtSaveCode(String biz, String[][] columns) {
		String txt = "";
		if ( getKeyGetter(columns) != null ) {
			txt = restfulTemplate_eachtables_save_code_autokey;
			txt = txt.replaceAll("##KEY_GETTER##", getKeyGetter(columns)); //
			txt = txt.replaceAll("##KEY_SETTER##", getKeySetter(columns)); //
		} else {
			txt = restfulTemplate_eachtables_save_code_general;
		}
		txt = txt.replaceAll("##SERVICE_NAME##", "BizBasic");
		txt = txt.replaceAll("##service_NAME##", "bizBasic");
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		
		return txt;
	}

	private static Object getServiceTxt(String txt, String biz, String[] table, String[][] columns) {
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);

		txt = txt.replaceAll("##DAO_NAME##", "BizBasic");
		txt = txt.replaceAll("##dao_NAME##", "bizBasic");

		return txt;
	}
	
	private static Object getDaoTxt(String txt, String biz, String[] table, String[][] columns) {
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);
		txt = txt.replaceAll("##INSERT_RETURN_CODE##", getDaoTxtInsertReturnCode(biz, table, columns));

		return txt;
	}
	private static String getDaoTxtInsertReturnCode(String biz, String[] table, String[][] columns) {
		String txt = "";
		if ( getKeyGetter(columns) != null ) {
			txt = daoTemplate_eachtables_autokey;
			txt = txt.replaceAll("##KEY_GETTER##", getKeyGetter(columns)); //
			txt = txt.replaceAll("##KEY_SETTER##", getKeySetter(columns)); //
		} else {
			txt = daoTemplate_eachtables_general;
		}
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		
		return txt;
	}
	private static String getKeyGetter(String[][] columns) {
		String txt = null;
		for(int r=0; r<columns.length; r++) {

			if ( columns[r][7] != null && columns[r][7].equals("PRI") && columns[r][5].equals("int") && columns[r][8].equals("auto_increment")) { // PK int auto_increment 경우에만 
				txt = changeCamelChars("GET_"+columns[r][2]) ;
				break;
			} 
		}
		return txt;
	}

//	private static boolean isAutoIncrement(String[][] columns) {
//		boolean isAutoIncrement = false;
//		for(int r=0; r<columns.length; r++) {
//
//			if ( columns[r][7].equals("PRI") && columns[r][5].equals("int") && columns[r][8].equals("auto_increment")) { // PK int auto_increment 경우에만 
//				isAutoIncrement = true; 
//				break;
//			} 
//		}
//		return isAutoIncrement;
//	}
	
	private static String getKeySetter(String[][] columns) {
		String txt = null;
		for(int r=0; r<columns.length; r++) {

			if ( columns[r][7] != null && columns[r][7].equals("PRI") && columns[r][5].equals("int") && columns[r][8].equals("auto_increment")) { // PK int auto_increment 경우에만 
				txt = changeCamelChars("SET_"+columns[r][2]) ;
				break;
			} 
		}
		return txt;
	}
	private static String getMybatisMapperTxt(String txt, String biz, String[] table, String[][] columns) {
		
		txt = txt.replaceAll("##NAMESPACE##", "tata.creator.be.output.common.mapper");
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TODAY##", table[3]);
		
		txt = txt.replaceAll("##ORM_AREA##", getMybatisMapperTxtOrmArea(columns)); //
		txt = txt.replaceAll("##SELECT_COLUMNS##", getMybatisMapperTxtSelectColumns(columns)); //
		txt = txt.replaceAll("##WHERE_CONDITIONS##", getMybatisMapperTxtWhereConditions(columns)); //
		
		txt = txt.replaceAll("##USEKEY##", getMybatisMapperTxtUseKey(columns)); // 
		txt = txt.replaceAll("##INSERT_COLUMNS##", getMybatisMapperTxtInsertColumns(columns)); // 
		txt = txt.replaceAll("##INSERT_VALUES##", getMybatisMapperTxtInsertValues(columns)); // 
		txt = txt.replaceAll("##UPDATE_SET##", getMybatisMapperTxtUpdateSet(columns)); // 

		return txt;
	}
	
	
	
	
	private static String getMybatisMapperTxtOrmArea(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		for(int r=0; r<columns.length; r++) {
			txt = mybatisTemplate_orm; // TAG : id, result
			txt = txt.replaceAll("##TAG##", columns[r][7].equals("PRI")?"id":"result");
			txt = txt.replaceAll("##PROPTERTY##", changeCamelChars(columns[r][2]));
			txt = txt.replaceAll("##COLUMN_NAME##", columns[r][2]);
			txt = txt.replaceAll("##COLUMN_COMMENT##", columns[r][9]);
			txtFull.append(txt);
		}
		return getTextExceptLastLine(txtFull.toString());
	}

	/*
		CRN_MBR_NO 
		, BSIS_IF 
		, RGNT_NO 
		, date_format(REG_DT,'%Y-%m-%d %T') AS REG_DT  
	 */
	private static String getMybatisMapperTxtSelectColumns(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		for(int r=0; r<columns.length; r++) {
			
			txt = "\t\t\t";
			if ( r > 0) { txt += ", "; }
			
			if ( columns[r][5] != null && columns[r][5].equals("datetime") ) {
				txt += "date_format("+columns[r][2]+",'%Y-%m-%d %T') AS "+columns[r][2];
			} else {
				txt += columns[r][2];
			}
			txt += " \n";
			txtFull.append(txt);
		}
		return getTextExceptLastLine(txtFull.toString());
	}

	private static String getMybatisMapperTxtWhereConditions(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		for(int r=0; r<columns.length; r++) {

			if ( columns[r][7] != null && columns[r][7].equals("PRI") ) { // PK 경우에만 
				txt = "\t\t\t"; // mybatisTemplate_where
				txt += "AND "+columns[r][2]+" = #{" + changeCamelChars(columns[r][2]) + "} " ;
				txt += " \n";
				txtFull.append(txt);
			} 
		}
		return getTextExceptLastLine(txtFull.toString());
	}
	
	private static String getTextExceptLastLine(String txt) {
		int i = txt.lastIndexOf("\n");
		txt = i<0?txt:txt.substring(0,i);
		return txt;
	}

	private static String getMybatisMapperTxtUseKey(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		for(int r=0; r<columns.length; r++) {

			if ( columns[r][7] != null && columns[r][7].equals("PRI") && columns[r][5].equals("int") ) { // PK int 경우에만 
				txt = ""; // mybatisTemplate_insert_usekey
				txt += "useGeneratedKeys=\"true\" keyProperty=\""+ changeCamelChars(columns[r][2]) +"\" ";
				// txt += " \n";
				txtFull.append(txt);
			} 
		}
		return getTextExceptLastLine(txtFull.toString());
	}

	private static String getMybatisMapperTxtInsertColumns(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		boolean first = true;
		for(int r=0; r<columns.length; r++) {
			
			if ( columns[r][8].equals("auto_increment") == false ) { // 자동 증가 처리되는 키 칼럼은 제외
				
				txt = "\t\t\t";
				if ( first == false ) {
					txt += ", "; 
				} else {
					first = false;
				}
				txt += columns[r][2] + " \n";
				
				txtFull.append(txt);
			}

		}
		return getTextExceptLastLine(txtFull.toString());
	}

	private static String getMybatisMapperTxtInsertValues(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		boolean first = true;
		for(int r=0; r<columns.length; r++) {
			
			if ( columns[r][8].equals("auto_increment") == false ) { // 자동 증가 처리되는 키 칼럼은 제외
				
				txt = "\t\t\t";
				if ( first == false ) {
					txt += ", "; 
				} else {
					first = false;
				}
				
				switch (columns[r][2]){
				case "USE_YN"     : txt += "'Y' \n"; break; 
				case "RGNT_NO"    : txt += "#{loginMbrNo} \n"; break; 
				case "UPDT_MN_NO" : txt += "#{loginMbrNo} \n"; break; 
				case "REG_DT"     : txt += "NOW() \n"; break; 
				case "UPDT_DT"    : txt += "NOW() \n"; break; 
				default : txt += "#{" +  changeCamelChars(columns[r][2]) + "} \n"; break;
				}
				
				txtFull.append(txt);
			}

		}
		return getTextExceptLastLine(txtFull.toString());
	}

	private static String getMybatisMapperTxtUpdateSet(String[][] columns) {
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		boolean first = true;
		for(int r=0; r<columns.length; r++) {
			
			if ( columns[r][7].equals("PRI") == false 
					&& columns[r][2].equals("USE_YN") == false 
					&& columns[r][2].equals("RGNT_NO") == false 
					&& columns[r][2].equals("REG_DT") == false 
					) { // PK 제외
				
				txt = "\t\t\t";
				if ( first == false ) {
					txt += ", "; 
				} else {
					first = false;
				}
				
				switch (columns[r][2]){
				case "USE_YN"     : txt += columns[r][2] + " = 'Y' \n"; break; 
				case "RGNT_NO"    : txt += columns[r][2] + " = #{loginMbrNo} \n"; break; 
				case "UPDT_MN_NO" : txt += columns[r][2] + " = #{loginMbrNo} \n"; break; 
				case "REG_DT"     : txt += columns[r][2] + " = NOW() \n"; break; 
				case "UPDT_DT"    : txt += columns[r][2] + " = NOW() \n"; break; 
				default : 
					txt += columns[r][2] + " = #{" + changeCamelChars(columns[r][2]) + "} \n"; 
					break;
				}
				
				txtFull.append(txt);
			}

		}
		return getTextExceptLastLine(txtFull.toString());
	}

	private static String getBizVoTxt(String txt, String biz, String[] table, String[][] columns) {
		
		txt = txt.replaceAll("##BIZ_NAME##", biz);
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);
		txt = txt.replaceAll("##TODAY##", table[3]);
		
		// txt = txt.replaceAll("##PROPERTY_AREA##", getTableVoTxtPropertyArea(columns));
		// txt = txt.replaceAll("##GETTER_SETTER_AREA##", getTableVoTxtGetterSetterArea(columns));

		return txt;
	}
	
	private static String getTableVoTxt(String txt, String[] table, String[][] columns) {
		
		txt = txt.replaceAll("##TABLE_NAME##", table[1]);
		txt = txt.replaceAll("##TABLE_COMMENT##", table[2]);
		txt = txt.replaceAll("##TODAY##", table[3]);
		
		txt = txt.replaceAll("##PROPERTY_AREA##", getTableVoTxtPropertyArea(columns));
		txt = txt.replaceAll("##GETTER_SETTER_AREA##", getTableVoTxtGetterSetterArea(columns));

		return txt;
	}
	
	private static String getTableVoTxtPropertyArea(String[][] columns) {
		
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		
		for(int r=0; r<columns.length; r++) {
			txt = ENTITY_VO_TEMPLATE_PROPERTY_TXT;
			txt = txt.replaceAll("##TYPE##", columns[r][5].equals("int")?"int":"String");
			txt = txt.replaceAll("##COLUMN_NAME##", changeCamelChars(columns[r][2]));
			txt = txt.replaceAll("##COLUMN_COMMENT##", columns[r][9]);
			txtFull.append(txt);
		}

		return txtFull.toString();
	}
	
	private static String getTableVoTxtGetterSetterArea(String[][] columns) {
		
		StringBuffer txtFull = new StringBuffer(""); 
		String txt = null;
		
		for(int r=0; r<columns.length; r++) { // SETTER_NAME GETTER_NAME TYPE COLUMN_NAME
			txt = ENTITY_VO_TEMPLATE_GETTER_SETTER_TXT;
			txt = txt.replaceAll("##TYPE##", columns[r][5].equals("int")?"int":"String");
			txt = txt.replaceAll("##COLUMN_NAME##", changeCamelChars(columns[r][2]));
			txt = txt.replaceAll("##SETTER_NAME##", changeCamelChars("SET_" + columns[r][2]));
			txt = txt.replaceAll("##GETTER_NAME##", changeCamelChars("GET_" + columns[r][2]));
			
			txtFull.append(txt);
		}

		return txtFull.toString();
	}
	
	public static String changeCamelChars(String str) {
		String input = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		final char delim = '_';
		char value;
		boolean capitalize = false;
		for (int i = 0; i < input.length(); ++i) {
			value = input.charAt(i);
			if (value == delim) {
				capitalize = true;
			} else if (capitalize) {
				sb.append(Character.toUpperCase(value));
				capitalize = false;
			} else {
				sb.append(value);
			}
		}

		return sb.toString();
	}
	
}
