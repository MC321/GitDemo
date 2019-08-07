package qaclickacademy;

import org.testng.annotations.Test;

public class SeleniumTest {

	@Test
	public void BrowserAutomation() 
	{
		System.out.println("BrowserAutomation");
		System.out.println("WebAutomation");
	}
	
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");
	}
}

//execute all test cases from Test folder using mvn test
//trigger testng xml file from Maven