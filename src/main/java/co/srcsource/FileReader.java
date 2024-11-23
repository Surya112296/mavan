package co.srcsource;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import LoginMrspom.LoginMrsPomc;
import net.bytebuddy.asm.Advice.Return;

public  class FileReader   {
private static  FileInputStream fileInPutStrem;
private static Properties property;
private static void setUpProperty()  {
if(property==null) {
	File file =new File("C:\\Users\\surya\\eclipse-workspace\\MavanProject\\src\\main\\java\\co\\srcsource\\OpenMrsLogin.properties");
try {
	fileInPutStrem = new FileInputStream(file);
	property=new Properties();
	property.load(fileInPutStrem);
} catch (FileNotFoundException e) {
	Assert.fail("FILENOTFOUND EXPCEPTION OCCUR DURING THE PROPERTY LOAD");	
} catch (Throwable e) {
	Assert.fail("FILENOTFOUND EXPCEPTION OCCUR DURING THE PROPERTY LOAD");	
	
}
}
}     public static String getDataProperty (String datavalue)  {
	 setUpProperty();
  String browsername = property.getProperty(datavalue);
return browsername;
 
  
}

}




