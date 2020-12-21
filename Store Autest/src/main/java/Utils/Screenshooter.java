package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public final class Screenshooter {

    // Prevents this class from being instantiated
    private Screenshooter() {
    }

    public static void takeSnapShot (WebDriver driver,String fileWithPath) throws Exception {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile = new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);

    }

}
