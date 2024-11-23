package com.pageobjectmaneger;


import java.io.FileReader;

import org.junit.Assert;

import com.base.BaseClass;

import adactinHotelPom.BookNowPom;
import adactinHotelPom.LoginPagePom;
import adactinHotelPom.SearchHotelPom;
import co.srcsource.FileReaderManger;

public class AdactinPageObjectManeger extends BaseClass {
	private LoginPagePom loginPage;
	private FileReaderManger reader;
	private SearchHotelPom searchhotel;
	private BookNowPom BookNow;


	


	public BookNowPom getBookNow() {
		if(BookNow==null)
			BookNow=new BookNowPom(driver);
		return BookNow;
	}





	public LoginPagePom getLoginPage() {
		if(loginPage==null)
			loginPage= new LoginPagePom(driver);
		return loginPage;
	}





	public FileReaderManger getReader() {
		if(reader==null)
			reader= new FileReaderManger();
		return reader;
	}





	public SearchHotelPom getSearchhotel() {
		if(searchhotel==null)
			searchhotel=new SearchHotelPom(driver);
		return searchhotel;
	}





//	public FileReaderManger getFileReader() {
//		if(reader==null)
//			reader= new FileReaderManger();
//		return reader;
	}


	
	


	
	
	

