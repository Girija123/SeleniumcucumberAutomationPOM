package functionLibrary;

import java.io.File;

public class FilePaths {

    public static String propertyFilePath = new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String screenshotsPath = new File ("src/main/resources/screenshots").getAbsolutePath();

}
