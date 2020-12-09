package tata.creator.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

	public static boolean makeFile(String path, String fileName) {
		boolean isSuccess = false;
		try {
			File file = new File(path + fileName);
			if (file.exists() && file.isFile()) {
				file.delete();
			}

			isSuccess = file.createNewFile();
			if (isSuccess = false) {
				System.out.println("Failed to create a file : /home/mjs/test/text.txt");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static boolean writeTextFile(String path, String fileName, String contents) {
		boolean isSuccess = false;
		try {
			File file = new File(path + fileName);
			if (file.exists() && file.isFile()) {
				file.delete();
			}

			// true 지정시 파일의 기존 내용에 이어서 작성
			FileWriter fw = new FileWriter(file, false); // true - append, false - overwrite

			// 파일안에 문자열 쓰기
			fw.write(contents);
			fw.flush();

			// 객체 닫기
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	/**
	 * 라인별 파일 읽는 메소드
	 * 
	 * @param filePath
	 */
	public static StringBuffer readFileLines(String filePath) {

		StringBuffer sb = new StringBuffer();

		try {
			List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
			for (String line : lines) {
				sb.append(line + "\n");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb;
	}

}
