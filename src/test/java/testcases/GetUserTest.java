package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.W2ApiStep;


@RunWith(SerenityRunner.class)
public class GetUserTest extends BaseTest{
	
	
	@Steps 
	W2ApiStep api;	
	
	
	@Title("Checking GET Req")
	@Test
	public void getReqTest() throws InterruptedException {
		
		
		api.sendGetRequestForUser("4");
		Thread.sleep(3000);
		api.validateStatusCodeToBe(200);
		api.verifyResponseBody("firstName","Chris");
		
	}

}
