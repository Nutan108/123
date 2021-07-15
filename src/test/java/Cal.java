

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cal {
    WebDriver driver;

    @BeforeTest
    public void Startup() {
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shivanjali\\Desktop\\sc.exe");
           driver = new ChromeDriver();
        driver.get("https://www.calculator.net/bmi-calculator.html");
        driver.manage().window().maximize();
    }




    @Test
    public void s1()
    {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='csex1']")).click();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys("60");
        driver.findElement(By.xpath("//input[@type='image']")).click();
        String R = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        R=R.replaceAll("\\R","");
      // System.out.println("1st " +R);
        int n=Integer.parseInt(R);
        System.out.println("1st " +R);
        Assert.assertEquals("18.5kg/m",n);


    }

    @Test
    public void s2()
    {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys("35");
        driver.findElement(By.xpath("//input[@id='csex2']")).click();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys("160");
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys("55");
        driver.findElement(By.xpath("//input[@type='image']")).click();
        String R = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        //System.out.println("1st " +R);
        int n=Integer.parseInt(R);
        System.out.println("1st " +R);
        Assert.assertEquals("21.5kg/m",n);

    }

    @Test
    public void s3()
    {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys("50");
        driver.findElement(By.xpath("//input[@id='csex1']")).click();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys("175");
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys("65");
        driver.findElement(By.xpath("//input[@type='image']")).click();
        String R = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        //System.out.println("1st " +R);
        int n=Integer.parseInt(R);
        System.out.println("1st " +R);
        Assert.assertEquals("21.2kg/m",n);


    }
    @Test
    public void s4()
    {
        driver.findElement(By.xpath("//input[@id='cage']")).clear();
        driver.findElement(By.xpath("//input[@id='cage']")).sendKeys("45");
        driver.findElement(By.xpath("//input[@id='csex2']")).click();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
        driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys("150");
        driver.findElement(By.xpath("//input[@id='ckg']")).clear();
        driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys("52");
        driver.findElement(By.xpath("//input[@type='image']")).click();
        String R = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println("1st " +R.replaceAll("[^0-9]",""));



    }
    @AfterTest
    public void close()
    {
        driver.close();
    }
}

