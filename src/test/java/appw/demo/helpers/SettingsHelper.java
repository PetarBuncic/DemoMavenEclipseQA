package appw.demo.helpers;

import appw.common.core.MTFProperties;
import appw.common.core.TestBase;
import appw.demo.core.web.DemoWebManager;

public class SettingsHelper extends TestBase {

	public DemoWebManager demoWebManager;
	
	public SettingsHelper(DemoWebManager demoWebManager) {
		this.demoWebManager = demoWebManager;
	}
	
	public void setDemoTestServer() throws Exception {
		if(MTFProperties.getServer().equals("google")){
			driver.get("https://google.com");
		} else if(MTFProperties.getServer().equals("w3sch")) {
			driver.get("https://www.w3schools.com/");
		} else {
			driver.get("https://github.com/");
		}
		
	}
}
