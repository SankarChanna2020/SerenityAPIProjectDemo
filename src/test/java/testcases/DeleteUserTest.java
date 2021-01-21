package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.W2ApiStep;

@RunWith(SerenityRunner.class)
public class DeleteUserTest extends BaseTest{
	
	
	//Delete req
	@Steps 
	W2ApiStep api;	
	
	
	@Title("Checking DELETE Req")
	@Test
	public void deleteReqTest() throws InterruptedException {
		
		
		api.sendDeleteRequestForUser("14");
		api.validateStatusCodeToBe(200);
		
	}


}
