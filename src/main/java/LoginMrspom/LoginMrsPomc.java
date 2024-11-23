package LoginMrspom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.Interfaceelement.OpenMrsElements;
import com.base.BaseClass;

import co.srcsource.FileReader;

public class LoginMrsPomc extends BaseClass implements OpenMrsElements  {
	@FindBy(id = username_id)
	private WebElement userName;
	
	@FindBy(name = password_name)
	private WebElement password;
	
	@FindBy(xpath =location_xpath)
	private WebElement location;
	
	@FindBy(xpath = login_xpath)
	private WebElement login;
	@FindBy(id =   errmsguserpassword_id)
	private WebElement erromsg;
	@FindBy(xpath = errlocation_xpath)
	private WebElement errlocation;
	public LoginMrsPomc(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}


	
 public boolean validUserAndPassword()  throws IOException {
	 FileReader file =new FileReader();
	 lauchUrl(file.getDataProperty("url"));

	 passInput(userName,file.getDataProperty("user"));
	 passInput(password, file.getDataProperty("password"));
	 elementClick(location);
	 elementClick(login);
	 try {
		validation(driver.getTitle(),file.getDataProperty("tittle"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return true;

}
 public boolean emptyUserAndPassword() {
	 FileReader file = new FileReader(); 
	 lauchUrl(file.getDataProperty("url"));
	 passInput(userName, file.getDataProperty("emptyusername"));
	 passInput(password, file.getDataProperty("emptyPass"));
	 elementClick(location);
	 elementClick(login);
	 try {
		validation(erromsg.getText(),"Invalid username/password. Please try again.");
	} catch (Exception e) {
		e.printStackTrace();
	}
	return true;}
	
public boolean notSelectLocation()  throws IOException {
	 FileReader file =new FileReader();
	 lauchUrl(file.getDataProperty("url"));

	 passInput(userName,file.getDataProperty("user"));
	 passInput(password, file.getDataProperty("password"));
	 
	 elementClick(login);
	 try {
		validation(errlocation.getText(),file.getDataProperty("chooseLocation"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return true;

} public boolean invalidUserAndPassword()  throws IOException {
	 FileReader file =new FileReader();
	 lauchUrl(file.getDataProperty("url"));

	 passInput(userName,file.getDataProperty("user"));
	 passInput(password, file.getDataProperty("wrongpassword"));
	 elementClick(location);
	 elementClick(login);
	 try {
		validation(erromsg.getText(),file.getDataProperty("wrongpassword"));
	} catch (Exception e) {
		e.printStackTrace();
	}
	return true;
}

 

}