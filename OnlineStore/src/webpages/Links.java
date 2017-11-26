package webpages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) throws IOException,
			RowsExceededException, WriteException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/search?ei=5tIHWpfCKYmcvQT_y4XADg&q=writing+to+excel+file+in+java+using+jxl&oq=how+to+write+to+excel+file+in+java&gs_l=psy-ab.1.3.0i71k1l4.0.0.0.21262.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.gMtmfhTbywA");
		List<WebElement> elemts = driver.findElements(By.tagName("a"));
		int x = 0, y = 0;
		WritableWorkbook workbook = null;
		workbook = Workbook.createWorkbook(new File(
				"C:\\Users\\Umesh\\Downloads\\New folder\\sampletestfile.xls"));
		WritableSheet excelSheet = workbook.createSheet("Sheet 1", 0);
		 WritableCellFormat cFormat = new WritableCellFormat();
         WritableFont font = new WritableFont(WritableFont.ARIAL, 16, WritableFont.BOLD);
         cFormat.setFont(font);
		for (int counter = 0; counter <= elemts.size() - 1; counter++)
		/* for (WebElement ele : elemts) */{
			String val = elemts.get(counter).getText().trim();

			if (!val.isEmpty()) {
				System.out.println(val);
				Label label = new Label(0, y, val,cFormat);
y++;
				excelSheet.addCell(label);
			}

		}
		workbook.write();
		workbook.close();
		driver.close();
	}
}
