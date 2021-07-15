

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class CAL2 {

        WebDriver driver;
        @BeforeTest
        public void setup()
        {
            System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Shivanjali\\Desktop\\sc.exe");
             driver = new ChromeDriver();
            driver.get("https://www.calculator.net/bmi-calculator.html");
            driver.manage().window().maximize();
        }

        public String Bcal(String age, String gender, String height, String weight)
        {
            driver.findElement(By.xpath("//input[@id='cage']")).clear();
            driver.findElement(By.xpath("//input[@id='cage']")).sendKeys(age);//label[contains(text(),'Female')]
            driver.findElement(By.xpath("//label[contains(text(),'"+gender+"')]")).click();
            driver.findElement(By.xpath("//input[@id='cheightmeter']")).clear();
            driver.findElement(By.xpath("//input[@id='cheightmeter']")).sendKeys(height);
            driver.findElement(By.xpath("//input[@id='ckg']")).clear();
            driver.findElement(By.xpath("//input[@id='ckg']")).sendKeys(weight);
            driver.findElement(By.xpath("//input[@type='image']")).click();
            String R = driver.findElement(By.xpath("//div[@class='bigtext']")).getText();

            return R;
        }

        @Test
        public void set1()
        {
            Bcal("20","Male","180","60");
            Assert.assertEquals(Bcal("20","Male","180","60"),"BMI = 18.5 kg/m2");

        }

        @Test
        public void Set2()
        {
            Bcal("35","Female","160","55");
            Assert.assertEquals(Bcal("35","Female","160","55"),"BMI = 21.5 kg/m2");

        }
        @Test
        public void Set3()
        {
            Bcal("50","Male","175","65");
            Assert.assertEquals(Bcal("50","Male","175","65"),"BMI = 21.2 kg/m2");

        }
        @Test
        public void Set4()
        {
            Bcal("45","Female","150","52");
            Assert.assertEquals(Bcal("45","Female","150","52"),"BMI = 23.1 kg/m2");

        }

        @AfterTest
        public void close()
        {
            driver.quit();
        }



    }


