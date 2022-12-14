import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://news.ycombinator.com/login?goto=news");
        String userName = "pinocio321";
        String userPass = "Pinocio123*";

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
        driver.findElement(By.xpath("//*[@id=\"33983748\"]/td[3]/span/a")).click();

        //logout
     driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();



        //Dit werk niet?
//        WebElement registrationButton = driver.findElements(By.tagName("input")).get(3);
//        registrationButton.click();


        //By.xpath()
//        driver.findElement(By.XPath("/html/body/form[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("Mango");
    }
}
