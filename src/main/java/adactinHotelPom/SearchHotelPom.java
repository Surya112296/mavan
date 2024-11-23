package adactinHotelPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interfaceelement.AdacticSearchHotelElement;
import com.base.BaseClass;

import co.srcsource.FileReaderManger;

public class SearchHotelPom extends  BaseClass implements AdacticSearchHotelElement  {
	@FindBy (xpath=location_xpath)
	private WebElement location;
	@FindBy (xpath=hotels_xpath)
	private WebElement hotel;
	@FindBy (xpath=roomtype_xpath)
	private WebElement roomType;
	@FindBy (xpath=numeberroom_xpath)
	private WebElement numeberRoom;
	@FindBy (xpath=checkIndate_xpath)
	private WebElement checkIndate;
	@FindBy (xpath=checkoutdate_xpath)
	private WebElement checkoutdate;
	@FindBy (xpath=childtype_xpath)
	private WebElement childType;
	@FindBy (xpath=adultroom_xpath)
	private WebElement adultRoom;
	@FindBy (xpath=search_xpath)
	private WebElement search;
	@FindBy (xpath=selectradiobutton_xpath)
	private WebElement selectRadio;
	@FindBy(xpath = selectcontiue_xpath)
	private WebElement selectContiue;
	public SearchHotelPom(WebDriver driver ) {
		 PageFactory.initElements(driver, this);
	 }
	
	
	public void searchHotel  ()
	{	FileReaderManger date = new FileReaderManger();
	dropDownindex(location,1);
	dropDownindex(hotel, 1);
	dropDownindex(roomType, 3);
	dropDownindex(numeberRoom, 1);	
	PassInput(checkIndate, "13/12/2024");
	PassInput(checkoutdate, "16/12/2024");
	dropDownindex(childType, 2);
	dropDownindex(adultRoom, 1);
	elementClick(search);
	elementClick(selectRadio);
	elementClick(selectContiue);
	}	
	
}
//String location_xpath ="//*[@id='location']";
//String hotels_xpath ="//*[@id='hotels']";
//String roomtype_xpath ="//*[@id='room_type']";
//String numeberroom_xpath ="//*[@id='room_nos']";
//String checkIndate_xpath ="//*[@id='datepick_in']";
//String checkoutdate_xpath ="//*[@id='datepick_out']";
//String adultroom_xpath ="//*[@id='adult_room']";
//String childtype_xpath ="//*[@id='child_room']";
//String search_xpath ="//*[@id='Submit']";
