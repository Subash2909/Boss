package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static  WebDriver driver;//webdriver added to static
	//WebDriver Added to public Webdriver
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		return driver;
	}	public void loadUrl(String Data) {
      driver.get(Data);
	}	public void screenShot(String FileName) throws IOException {
     
		TakesScreenshot tkScreen=(TakesScreenshot)driver;
		File s = tkScreen.getScreenshotAs(OutputType.FILE);
	//	File d= new File(pathLocation);
		//FileUtils.copyFile(s, d);
	FileUtils.copyFile(s, new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ClassTask\\"+FileName+".png"));
	}	public String getData(int Rowno,int Cellno) throws IOException {
    String data=null;
   // File file=new File (System.getProperty("user.dir")+"\\ExcelSheet\\"+fileName+".xlsx" );
    File file =new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Adactin.xlsx");
    FileInputStream stream= new FileInputStream(file);
    Workbook workbook=new XSSFWorkbook(stream);
    Sheet sheet=workbook.getSheet("Sheet1");
    Row row = sheet.getRow(Rowno);
    Cell cell = row.getCell(Cellno);
    int type = cell.getCellType();
    if (type==1) {
		data = cell.getStringCellValue();
		}
    if (type==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
			data = dateFormat.format(date);
			
		}else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			 data=String.valueOf(l);
		}
	}return data;
	}
	public void insertDataIntoExcel(int rowno ,int cellno,WebElement element) throws IOException {
		
File file=new File("C:\\Users\\Subash\\eclipse-workspace\\Maven\\ExcelSheet\\Adactin.xlsx");
FileInputStream fileInputStream=new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fileInputStream);
Sheet sheet=workbook.getSheet("Sheet1");
Row createRow = sheet.getRow(rowno);
Cell createCell = createRow.createCell(cellno);
String attribute = element.getAttribute("value");

createCell.setCellValue(attribute);
FileOutputStream Stream1=new FileOutputStream(file);
workbook.write(Stream1);



	}
	public void maximize() {
    driver.manage().window().maximize();
	}	public void type(WebElement element,String Data) {
		element.sendKeys(Data);
	}	public void click(WebElement element) {
element.click();
	}	public void closeallWindows() {
driver.quit();
	}	public String getAttribute(WebElement Element) {
      String name = Element.getAttribute("value");
      return name;
      // if return is mentioned we should change the void
	}	public void selectOptionByText(WebElement element,String Data) {
    new Select(element).selectByVisibleText(Data);
    }	public void selectOptionbyValue(WebElement element,String Data) {
new Select(element).selectByValue(Data);
	}	public void selectOptionbyIndex(WebElement element,int Data) {
new Select(element).selectByIndex(Data);
	} 	public void title() {
driver.getTitle();
	}	public String currentUrl() {
      String currentUrl = driver.getCurrentUrl();
      return currentUrl;
	}	public void closeparticularWindow() {
     driver.close();
	}	public boolean isDisplay(WebElement element) {
      boolean displayed = element.isDisplayed();
      return displayed;
	}	public boolean isEnable(WebElement element) {
       boolean enabled = element.isEnabled();
       return enabled;
	}	public boolean isSelect(WebElement element) {
  boolean selected = element.isSelected();
  return selected;
  
	}	public String getText(WebElement element) {
      String text = element.getText();
      return text;
	}	public void clearText(WebElement element) {
      element.clear();
	}	public String oneWindowHandle() {
      String windowHandle = driver.getWindowHandle();
      return windowHandle;
	}	public Set<String> allWindowHandle() {
    Set<String> windowHandles = driver.getWindowHandles();
    return windowHandles;
	}	public void switchToWindow(String Data) {
	     driver.switchTo().window(Data);
		} public void mouse(Actions action, WebElement element) {
			//Actions actio= new Actions(driver);
	action.moveToElement(element).perform();
		}	public void dragAndDrop(Actions action,WebElement element,WebElement element1) {
	action.dragAndDrop(element, element1);
		} 	public void rightClick(Actions action,WebElement element) {
	      action.contextClick(element).perform();
		} 	public void doubleClick(Actions action,WebElement element) {
	      action.doubleClick(element).perform();
		} 	public void alertAccept( Alert Data) {
			 Alert alert = driver.switchTo().alert();
			 Data.accept();
		} 	public void alertReject(Alert Data1 ) {
	      Alert alert = driver.switchTo().alert();
	      Data1.dismiss();
	     }	public List<WebElement> getOption(WebElement element,Select Data) {
         List<WebElement> options = Data.getOptions();
         return options;
		}	public List<WebElement> getallSelectedOption(WebElement element,Select Data ) {
         List<WebElement> allSelectedOptions = Data.getAllSelectedOptions();
         return allSelectedOptions;
		}	public void getFirstSelectedOption(Select Data) {
          Data.getFirstSelectedOption();
		}	public void deSelectbyIndex(Select Data,int Index) {
         Data.deselectByIndex(Index);
		}	public void deSelecetAll(Select Data) {
         Data.deselectAll();
		}	public void deSelectByTextVisible(Select Data,String Value) {
         Data.deselectByVisibleText(Value);
		}	public void deSelectByValue(Select Data,String Value) {
         Data.deselectByValue(Value);
		}	public boolean presenceOfMultiple(Select Data) {
         boolean multiple = Data.isMultiple();
         return multiple;
		}	public void switchFrameByString(String Data) {
         driver.switchTo().frame(Data);
		}	public void switchFrameByIndex(int Index) {
         driver.switchTo().frame(Index);
		}	public void switchFrameByLocator(WebElement element) {
         driver.switchTo().frame(element);
		}	public void switchDefaultFrame() {
         driver.switchTo().defaultContent();
		}	public void navigate(String Data) {
         driver.navigate().to(Data);
		}	public void navigateBack() {
        driver.navigate().back();
		}	public void navigateForward() {
         driver.navigate().forward();
		}	public void navigateRefresh() {
        driver.navigate().refresh();
		}	public void implictWait(long Time,TimeUnit Data) {
        driver.manage().timeouts().implicitlyWait(Time, Data);
		}
	   
	     }
		


