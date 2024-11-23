package adactinHotelPom;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.Interfaceelement.AdactinApplicationElement;
import com.base.BaseClass;

import co.srcsource.FileReaderManger;

public class LoginPagePom extends BaseClass implements AdactinApplicationElement {
	
	
	@FindBy (name=username_name)
	private WebElement username;
	@FindBy(id=userPassword_id)
	private WebElement password;
   @FindBy(xpath = login_xpath)
   private WebElement login;
	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public void validUserNameAndValidUserPassword() throws IOException {
		FileReaderManger date = new FileReaderManger();
	PassInput(username, date.getDataProperty("username"));
		PassInput(password, date.getDataProperty("password"));
		elementClick(login);
		
			}

}
