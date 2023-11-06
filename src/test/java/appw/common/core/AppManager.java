package appw.common.core;

import org.openqa.selenium.WebDriver;

import appw.demo.core.DemoManager;
import appw.demo.core.web.DemoWebManager;

public class AppManager {
	
	private WebDriver driver;
	private DemoManager demoManager;
	private DemoWebManager demoWebManager;
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() throws Exception {
        return driver;
    }
	
	public DemoManager getDemoManager() {
		if(demoManager == null ) {
			demoManager = new DemoManager(this);
		}
		
		return demoManager;
	}
	
	public DemoWebManager getDemoWebManager() {
		if(demoWebManager == null) {
			demoWebManager = new DemoWebManager(this);
		}
		
		return demoWebManager;
	}

}
