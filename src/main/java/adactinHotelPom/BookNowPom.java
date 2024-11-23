package adactinHotelPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interfaceelement.AdacticBookHotelElement;
import com.base.BaseClass;

import co.srcsource.FileReaderManger;

public class BookNowPom extends  BaseClass implements AdacticBookHotelElement {
	@FindBy(xpath =fristname_xpath)private WebElement fristName;
	@FindBy(xpath =lastname_xpath)private WebElement lastName;
	@FindBy(xpath =address_xpath)private WebElement addressName;
	@FindBy(xpath =creditcardno_xpath)private WebElement creditCardNo ;
	@FindBy(xpath =credittype_xpath)private WebElement credittype;
	@FindBy(xpath =creditexpritymonth_xpath)private WebElement creditExpirtymonth;
	@FindBy(xpath =creditexprityear_xpath)private WebElement creditExpirtyYear;
	@FindBy(xpath =creditcvv_xpath)private WebElement credCvv;
	@FindBy(xpath =booknow_xpath)private WebElement bookNow;
	@FindBy(xpath =itinerary_xpath)private WebElement itiNerary;
 public  BookNowPom (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void bookNow() {
	{	FileReaderManger date = new FileReaderManger();
PassInput(fristName, "surya");
PassInput(lastName, "ravi");
PassInput(addressName, "1/127 west street");
PassInput(creditCardNo, "99998888666688888");
dropDownindex(credittype, 2);
dropDownindex(creditExpirtymonth, 3);
dropDownindex(creditExpirtyYear, 20);
PassInput(credCvv, "123");
elementClick(bookNow);
elementClick(itiNerary);

}






}}