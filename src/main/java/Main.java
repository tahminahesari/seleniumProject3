import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://news.ycombinator.com/");
//        WebElement test = driver.findElement(By.xpath("html/body/center/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/span/a"));
//        System.out.println(test.getText());
//        test.click();
//        System.exit(0);


        driver.get("https://news.ycombinator.com/login?goto=news");
        String userName = "sarang777";
        String userPass = "Sarang123*";

        //Registration
//        WebElement usernameRegistratie = driver.findElements(By.name("acct")).get(1);
//        usernameRegistratie.sendKeys(userName);
        // Registration password
//        WebElement passwordRegistratie = driver.findElements(By.name("pw")).get(1);
//        passwordRegistratie.sendKeys(userPass);
        //Registration button
//        driver.findElement(By.xpath("/html/body/form[2]/input[3]")).click();


//        driver.findElements(By.name("acct")).get(0).sendKeys("abc");

        // Login
        WebElement usernameLogin = driver.findElements(By.name("acct")).get(0);
        usernameLogin.sendKeys(userName);
        System.out.println(usernameLogin.getText());

         //Login password
        WebElement passwordLogin = driver.findElements(By.name("pw")).get(0);
        passwordLogin.sendKeys(userPass);

        //Login button
          driver.findElement(By.xpath("/html/body/form[1]/input[2]")).click();


        // titel van 3e artikel
//        WebElement test2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr[7]/td[3]/span/a"));;
//        test2.click();

       // logout
     driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();


    }
}
