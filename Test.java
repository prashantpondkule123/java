
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:/Java Data/Chrome Browser1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chromedriver.chromium.org/downloads");


	}

}


