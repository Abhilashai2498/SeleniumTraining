import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/Abhilashai2498/SeleniumTraining");
		driver.manage().window().maximize();
        System.out.println("URL is launched!");
	}

}
