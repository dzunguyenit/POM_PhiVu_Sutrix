package com.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.modules.GoogleSearchFunctions;
import com.utils.Support;

public class GoogleSearchTesting {
	Support support = new Support();
	GoogleSearchFunctions googleSearchPage = new GoogleSearchFunctions();

	@BeforeMethod
	public void launch() {
		support.launch();
	}

	@Test
	public void SearchTCs_01() throws Exception {
		googleSearchPage.SearchByKeywords("doctor");
	}

	@AfterMethod
	public void closeWeb() {
		support.tearDown();
	}
}
