package kdf;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {

	@Test
	public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("D:\\Sel7May\\TestData.xlsx", "Sheet2");
		Methods mtd = new Methods();
		//Making changes to application class
		for(int i = 1; i<data.length;i++) {
			switch(data[i][3]) {
			
			case "navigateToApp":
				mtd.navigateToApplication(data[i][6]);
				break;
			case "enterInTextBox":
				mtd.enterInTextBox(data[i][5], data[i][6]);
				break;
			case "clickButton":
				mtd.clickAButton(data[i][4],data[i][5]);
				break;
			case "verifyMsg":
				String actualMsg = mtd.getMessage(data[i][4],data[i][5]);
				String expectedMsg = data[i][6];
				Assert.assertEquals(actualMsg, expectedMsg);
				break;
			case "closeApp":
				mtd.closeApplication();
				break;
			}
			
		}
	}
}
