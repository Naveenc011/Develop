package Marketplace.cucumber;

import java.io.IOException;

import NBrefactor.applicationinvoke;
import io.cucumber.java.en.Given;

public class StepDefinitionImpl extends applicationinvoke{
	@Given ("I landed on the Market place")
	public void I_landed_on_MP() throws IOException
	{
		//code
		intializedriver ();
		
	}
}
