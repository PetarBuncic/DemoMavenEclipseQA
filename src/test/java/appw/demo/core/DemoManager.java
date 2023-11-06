package appw.demo.core;

import org.openqa.selenium.WebDriver;

import appw.common.core.AppManager;

public class DemoManager {
	
	protected AppManager app;
	
	public DemoManager(AppManager app) {
		this.app =app;
	}
	
	public AppManager appManager() {
        return app;
    }
	
	public WebDriver driver() throws Exception {
        return app.getDriver();
    }

}
