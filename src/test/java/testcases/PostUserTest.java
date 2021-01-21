package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import steps.W2ApiStep;



//@Concurrent(threads="4x")
@UseTestDataFrom("./src/test/resources/testdata/users.csv")
@RunWith(SerenityParameterizedRunner.class)
public class PostUserTest extends BaseTest{
	
	
	public String email;
	public String firstName;
	public String lastName;
	
	
	public void setEmail(String email) {
		this.email = email;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	@Steps 
	W2ApiStep api;	
	
	
	@Title("Checking POST Req")
	@Test
	public void getReqTest() throws InterruptedException {
		
		
		api.sendPOSTRequest(email,firstName,lastName);
		api.validateStatusCodeToBe(201);
	
		
	}

}
