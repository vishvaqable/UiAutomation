package web.tests.comparess;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.unity.framework.init.base;
import io.unity.image_comparison;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class comparetest extends base {

        @Test
        public void check_ui(){
            image_comparison compare= new image_comparison(driver);
            compare.compare_image("test");
        }


}
