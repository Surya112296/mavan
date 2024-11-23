package com.pageobjectmaneger;

import com.base.BaseClass;

import LoginMrspom.LoginMrsPomc;
import co.srcsource.FileReader;

public class OpenMrsPageObjectManger extends BaseClass {
private LoginMrsPomc loginMrs;
private FileReader fileReader;
public LoginMrsPomc getLoginMrs() {
	if(loginMrs==null)
		loginMrs=new LoginMrsPomc(driver);
	return loginMrs;
}
public FileReader getFileReader() {
	if(fileReader==null)
		fileReader = new FileReader();
	return fileReader;
}



}
