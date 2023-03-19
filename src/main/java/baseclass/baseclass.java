package baseclass;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class baseclass {
		public static WebDriver d;

		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		}

		public static void windowMaximize() {
			d.manage().window().maximize();
		}

		public static void launchUrl(String url) {
			d.get(url);
		}

		public static String pagetitle() {
			String title = d.getTitle();
			return title;
			
		}

		public static String pageUrl() {
			String url = d.getCurrentUrl();
			return url;
		}

		public static void passText(String txt, WebElement ele) {
			ele.sendKeys(txt);
		}

		public static void closeEntireBrowser() {
			d.quit();
		}

		public static void clickBtn(WebElement ele) {
			ele.click();
		}

		public static void screenshot(String imgname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) d;
			File image = ts.getScreenshotAs(OutputType.FILE);
			File f = new File("location+imgName.png");
			FileUtils.copyFile(image, f);
		}

		public static Actions a;

		public static void dargDrop(WebElement targetWebElement, WebElement dropWebElement) {
			a = new Actions(d);
			a.dragAndDrop(dropWebElement, dropWebElement).perform();
		}

		public static void moveThecursor(WebElement targetWebElement) {
			a = new Actions(d);
			a.moveToElement(targetWebElement).perform();
		}

		public static JavascriptExecutor js;
		private static Date writeNewData;

		public static void scrollThePage(WebElement tarwebEle) {
			js = (JavascriptExecutor) d;
			js.executeScript("arguments[0].scrollIntoView(true)", tarwebEle);
		}

		public static void scroll(WebElement element) {
			js = (JavascriptExecutor) d;
			js.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public static void excelRead(String sheetName,int rowNum,int cellNum) throws IOException  {
			File f = new File("excellocation.xlxs");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb =new XSSFWorkbook(fis);
			Sheet Mysheet =wb.getSheet("Data");
			Row r = Mysheet.getRow(rowNum);
			Cell c =r.getCell(cellNum);
			int cellType =c.getCellType();
			String value =" " ;
			if (cellType==1) {
				String value2=c.getStringCellValue();
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date dd = c.getDateCellValue();
				SimpleDateFormat s= new SimpleDateFormat(value);
				String value1= s.format(dd);
				}
			else {
				double d =c.getNumericCellValue();
				long l=(long)d;
				String valueof= String.valueOf(1);
			}}
		public static void createNewExcelFile(int rowNum1, int cellNum1, String WriteData) throws IOException {
		File f = new File("D:\\Framework programs\\mavenProject\\excel\\newexcel.xlsx");
		Workbook w =new XSSFWorkbook();
		Sheet newSheet=w.createSheet("sathish");
		Row newRow = newSheet.createRow(rowNum1);
		Cell newcell =newRow.createCell(cellNum1);
		newcell.setCellValue(WriteData);
		FileOutputStream fos =new FileOutputStream (f);
		w.write(fos);
		}
		public static void createCell (int getrow , int crecell, String newData) throws IOException {
			
			File f = new File("D:\\Framework programs\\mavenProject\\excel\\newexcel.xlsx");
			FileInputStream fis =new FileInputStream(f);
			Workbook w =new XSSFWorkbook(fis);
			Sheet s =w.getSheet("sathish");
			Row r = s.getRow(getrow);
			Cell c =r.createCell(crecell);
			c.setCellValue(newData);
			FileOutputStream fos =new FileOutputStream (f);
			w.write(fos);
		}
		
	public static void createRow (int creRow , int crecell, String newData) throws IOException {
			
			File f = new File("D:\\Framework programs\\mavenProject\\excel\\newexcel.xlsx");
			FileInputStream fis =new FileInputStream(f);
			Workbook w =new XSSFWorkbook(fis);
			Sheet s =w.getSheet("sathish");
			Row r = s.createRow(creRow);
			Cell c =r.createCell(crecell);
			c.setCellValue(newData);
			FileOutputStream fos =new FileOutputStream (f);
			w.write(fos);
		}
	public static void updateDataToParticularcell (int getTheRow , int creTheCell, String existingData) throws IOException {
		
		File f = new File("D:\\Framework programs\\mavenProject\\excel\\newexcel.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook w =new XSSFWorkbook();
		Sheet s =w.getSheet("sathish");
		Row r = s.getRow(getTheRow);
		Cell c =r.getCell(creTheCell);
		String str =c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos =new FileOutputStream (f);
		w.write(fos);
		}
	}


