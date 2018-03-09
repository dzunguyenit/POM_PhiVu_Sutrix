package com.modules;

import org.openqa.selenium.support.How;

import com.objects.GoogleSearchPage;
import com.utils.Support;

public class GoogleSearchFunctions extends GoogleSearchPage {
	public void SearchByKeywords(String keyword) throws Exception {
		Support support = new Support();
		support.openPage(url);
		support.fillText(support.getElement(How.ID, keywordTxt), keyword);
		support.keyEvent(support.getElement(How.ID, keywordTxt), "enter");
	}
}
