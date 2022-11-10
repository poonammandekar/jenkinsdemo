package com.fasttrack.stepdefinition;

import java.util.List;

import org.testng.Assert;

import com.fasttrack.pages.HomePage;
import com.fasttrack22.keywords.UIKeywords;
import com.fasttrack22.util.Enviornment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsSteps {

	@Given("क्रोम ब्राउज़र खुला  होना चाहिए")
	public void OpenBrowser() {
		// TODO Auto-generated method stub
		UIKeywords.openBrowser("Chrome");
	}
	
	@And("मिंत्रा का पेज खुला होना चाहिए")
	public void launchMitraUrl() {
		UIKeywords.launchUrl(Enviornment.URL);
	}
	
	
	
	@When("user searches for polo T shirt")
	public void user_searches_for_polo_t_shirt() {
	  
		HomePage home=new HomePage();
		home.searchProduct("Polo");
	    
	}
	
	@Then("all result should be related to polo")
	public void verifyallResult() {
		HomePage home=new HomePage();
		List<String> productTexts=home.getSearchResultTexts();
		for(String text:productTexts) {
			text=text.toLowerCase();
			Assert.assertTrue(text.contains("polo"),"Product is mismatch:"+text);
		}
		
	}
}
