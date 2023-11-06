package appw.demo.helpers;

import appw.demo.core.web.DemoWebManager;

public class ConfigHelper {
	
	private DemoWebManager demoWebManager;

    public ConfigHelper(DemoWebManager demoWebManager) {
        setDemoWebManager(demoWebManager);
    }

    public void setDemoWebManager(DemoWebManager DemoManager) {
        this.demoWebManager = DemoManager;
    }


}
