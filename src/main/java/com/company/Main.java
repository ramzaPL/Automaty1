package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Zmienne, parametry
        //Domowy webdriver
        //System.setProperty("webdriver.chrome.driver", "D:\\Kurs Selenium\\chromedriver.exe");
        //Służbowy webdriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pratlinski\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait czekaj = new WebDriverWait(driver, 10);
        Random losowa = new Random();
        String sumowana = "0";
        Integer sumaLosowych = 0;

        driver.get("https://www.seleniumeasy.com/test/");
        //będzie czekać na załadowanie się elementu
        //driver.manage().timeouts().implicitlyWait(Timespan.SECONDS(10));

        //****BASIC*****//
        driver.get("https://www.seleniumeasy.com/test/");
        czekaj.until(ExpectedConditions.presenceOfElementLocated(By.id("basic_example"))).click();
        /*//Simple Form Demo
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Simple Form Demo"))).click();
            //Single Input Field
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.id("user-message"))).sendKeys("Przemo test");
            driver.findElement(By.cssSelector("#get-input > button")).click();
            //Two Input Fields
            String losowaJeden = String.valueOf(losowa.nextInt(30));
            String losowaDwa = String.valueOf(losowa.nextInt(30));
            driver.findElement(By.id("sum1")).sendKeys(losowaJeden);
            driver.findElement(By.id("sum2")).sendKeys(losowaDwa);
            driver.findElement(By.cssSelector("#gettotal > button")).click();
            //System.out.println(driver.findElement(By.cssSelector("#displayvalue")).getText());
            sumowana = (driver.findElement(By.cssSelector("#displayvalue")).getText());
            sumaLosowych = Integer.parseInt(sumowana);

            if ( sumaLosowych == (Integer.parseInt(losowaJeden) + Integer.parseInt(losowaDwa)))
                {
                    System.out.println("Suma jest prawidłowa (" + sumaLosowych +")." );
                }
            else
                {
                    System.out.println("Błędna suma.");
                }

        driver.navigate().back();*/
    /*    czekaj.until(ExpectedConditions.presenceOfElementLocated(By.id("basic_example"))).click();
        //Check Box Demo
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Check Box Demo"))).click();
            //Single Checkbox Demo
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.id("isAgeSelected"))).click();
            //Multiple Checkbox Demo
             driver.findElement(By.id("check1")).click();
             Thread.sleep(3000);
             driver.findElement(By.id("check1")).click();

        driver.navigate().back();*/
        czekaj.until(ExpectedConditions.presenceOfElementLocated(By.id("basic_example"))).click();
        //Radio Buttons Demo
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Radio Buttons Demo"))).click();
            //Radio Button Demo
            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='easycont']/div/div[2]/div[1]/div[2]/label[1]/input"))).click();
            driver.findElement(By.id("buttoncheck")).click();
            String radioButtonDemo = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();

                if (radioButtonDemo.equals("Radio button 'Male' is checked"))
                    System.out.println("Przycisk rbd1 - treść poprawna");
                else
                    System.out.println("Przycisk rbd1 - treść błędna");

            czekaj.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]"))).click();
            driver.findElement(By.id("buttoncheck")).click();
            radioButtonDemo = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();

                if (radioButtonDemo.equals("Radio button 'Female' is checked"))
                    System.out.println("Przycisk rbd1 - treść poprawna");
                else
                    System.out.println("Przycisk rbd1 - treść błędna");

            //Group Radio Buttons Demo

    }

}
