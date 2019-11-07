package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Shared {
	
	static Properties prop;
	
	public static Properties readPrpertyFile(String pathname)  {
		try {
			FileInputStream f= new FileInputStream(new File(pathname));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("File not Found");
		}
		
		Properties prop=new Properties();
		prop.getProperty(pathname);
		return prop;
	}
	
	public static void openBrowser(WebDriver dr) {
		if(prop.get("browser").equals("chrome")) {
			dr= new ChromeDriver();
		}else  if(prop.get("browser").equals("firefox")) {
		dr= new FirefoxDriver();
		
	}else  if (prop.get("browser").equals("InternetExplorer")) {
		dr= new InternetExplorerDriver();
		
	}else  if(prop.get("browser").equals("Safari")) {
		dr= new SafariDriver();
	}
	
	
}

	
}


