package com.eBankingV1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBankingV1.pageObject.LoginPage;


public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		log.info("Url is working fine");
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(baseUsername);
		log.info("Entered username");
		lp.setPassword(basePassword);
		log.info("Entered password");

		lp.clickSummit();
		log.info("Button Clicked");

		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			log.info("Login test passed");

		}
		else {
			Assert.assertTrue(false);
			log.info("Login test failed");

		}
	}

}
