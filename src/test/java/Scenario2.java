import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario2 {

        private WebDriver driver;
        private Actions action;
        private Scenario2ObjectRepositories scenario2;



        @Test
    public void loginUsingExcelFIle() throws IOException {
//            System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
//            driver=new ChromeDriver();
//            String URL="http://automationpractice.com/";
//            driver.get(URL);
            File fi=new File("E:\\AutomationPractise\\testData\\testDataFile.xlsx");
            FileInputStream fis=new FileInputStream(fi);
            XSSFWorkbook xs=new XSSFWorkbook(fis);
            Sheet st=xs.getSheet("TestData");
            int rowCount = st.getLastRowNum()-st.getFirstRowNum();
            for (int i = 1; i <=rowCount ; i++) {
                    Row row = st.getRow(i);

                    String userName=row.getCell(1).getStringCellValue();
                    System.out.println(userName);
                    //scenario2.EmailField().clear();
                    //scenario2.EmailField().sendKeys(userName);

                    String password=row.getCell(2).getStringCellValue();
                    System.out.println(password);
                    row.getCell(3).setCellValue("Passed");
                    //scenario2.PasswordField().clear();
                    //scenario2.PasswordField().sendKeys(password);

//                    scenario2.signInBtn().click();
//
//                    Boolean boolflag=scenario2.successfullyCreatedAccount().isDisplayed();
//                    if (boolflag==true){
//                            System.out.println("Successfully logged into the acccount");
//                            scenario2.getAccountLogout().click();
//                            row.getCell(4).setCellValue("Passed");
//
//                    }
//                    else {
//
//                            System.out.println("Failed to login Due to invalid credentials");
//                            scenario2.signInBtn2().click();
//                            row.getCell(4).setCellValue("Failed");
//                    }
//
            }


        }


}
