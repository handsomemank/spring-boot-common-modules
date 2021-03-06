package com.sb.stu.parse.nocache.exp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.poi.template.excel.exception.ExcelException;
import com.sb.stu.commonpoi.entity.Model;
import com.poi.template.excel.parse.nocache.ExcelUtils;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExcelExpXlsxTest {

	private static Logger logger = LoggerFactory.getLogger(ExcelExpXlsTest.class);

	public static final String exportPath = "C:\\Users\\SHJ\\Desktop\\temp\\export\\";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Model model = new Model("aaa1", "bbb", 123.234);

		List details = new ArrayList();
		details.add(new Model("user1", "kong", 1234.342));
		details.add(new Model("user2", "hello", 1224.342));
		details.add(new Model("user3", "world", 144.342));

		ExcelUtils.addValue("printDate", getCurrentDate("yyyy-MM-dd"));
		ExcelUtils.addValue("model", model);
		ExcelUtils.addValue("list", details);

		String tempPath = "xlsx/";
		String tempFilePath = tempPath + "demo_merge.xlsx";

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(exportPath + "demo_merge_exp.xlsx");
			ExcelUtils.export(tempFilePath, fos);

		} catch (FileNotFoundException | ExcelException ex) {
			logger.error("{}", ex);
		} finally {
			IOUtils.closeQuietly(fos);
		}
	}

	private static String getCurrentDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}

}
