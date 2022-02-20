import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class RunTest {


    @Before
    public void beforeClass(){
        System.out.println("Before class");
    }

    @After
    public void afterClass(){
        System.out.println("After class");
    }

    @Test
    public void main(){
        open("https://demoqa.com/automation-practice-form");
        // тест 311
    }

    @Test
    public void Test1(){
        System.out.println("1");
        assertEquals("AW","AW");
    }
    @Test
    public void Test2(){
        System.out.println("2");
        assertEquals("AW","A#W");
    }

    @Test
    public void TestObject(){
        System.out.println("3");
        assertSame("12", "text");

    }

    @Test
    public void TestSum(){
        System.out.println("4");
        assertEquals(100,200);
    }

}
