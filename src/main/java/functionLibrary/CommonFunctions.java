package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver =  new ChromeDriver();
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public static String readPropertyFile(String key) throws Exception
    {
        FileInputStream inputStream = new FileInputStream(FilePaths.propertyFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        String valueOfKey =properties.getProperty(key);
        return valueOfKey;
    }

    public void takeScreenshot(String filename) throws Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File virtualFile = screenshot.getScreenshotAs(OutputType.FILE);
        File physicalFile = new File(FilePaths.screenshotsPath+filename);
        FileUtils.copyFile(virtualFile, physicalFile);
    }
}
