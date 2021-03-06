package com.sb.stu.commonpoi.rest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sb.stu.commonpoi.entity.Model;
import org.apache.poi.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poi.template.excel.exception.ExcelException;
import com.poi.template.excel.parse.cache.poiutils.CacheExcelUtils;

@Controller
public class PoiExcelExportController {

	private static Logger logger = LoggerFactory.getLogger(PoiExcelExportController.class);

	public static final String exportPath = "C:/Users/dell/Desktop/temp/export";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping(path = "/excel/export", produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object exportExcel() {
		System.out.println("***********************************exportExcel**********");

		Map<String, Object> result = new HashMap<String, Object>();

		result.put("error_no", "0");
		result.put("error_msg", "ok!");

		Model model = new Model("aaa1", "bbb", 123.234);

		List details = new ArrayList();
		details.add(new Model("user1", "kong", 1234.342));
		details.add(new Model("user2", "hello", 1224.342));
		details.add(new Model("user3", "world", 144.342));

		CacheExcelUtils.addValue("printDate", getCurrentDate("yyyy-MM-dd"));
		CacheExcelUtils.addValue("model", model);
		CacheExcelUtils.addValue("list", details);
		String config = "demo.xlsx";

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(exportPath + "/" + "demo2.xlsx");
			CacheExcelUtils.export(config, fos);

		} catch (FileNotFoundException | ExcelException ex) {
			logger.error("{}", ex);
		} finally {
			IOUtils.closeQuietly(fos);
		}

		return result;
	}

	private static String getCurrentDate(String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
}
