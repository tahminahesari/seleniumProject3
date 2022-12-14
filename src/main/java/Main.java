import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://news.ycombinator.com/login?goto=news");
        String userName = "mangoski";
        String userPass = "Mangopower123*";

        //Login
        WebElement usernameRegistratie = driver.findElements(By.name("acct")).get(1);
        usernameRegistratie.sendKeys(userName);
        // Login password
        WebElement passwordRegistratie = driver.findElements(By.name("pw")).get(1);
        passwordRegistratie.sendKeys(userPass);

//        driver.findElements(By.name("acct")).get(0).sendKeys("abc");

       // Registration
       WebElement usernameLogin = driver.findElements(By.name("acct")).get(0);
       usernameLogin.sendKeys(userName);
       System.out.println(usernameLogin.getText());

       // Registration password
        WebElement passwordLogin = driver.findElements(By.name("pw")).get(0);
        passwordLogin.sendKeys(userPass);

        //Registration button
      driver.findElement(By.xpath("/html/body/form[2]/input[3]")).click();






        //By.xpath()
//        driver.findElement(By.XPath("/html/body/form[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("Mango");
    }
}
