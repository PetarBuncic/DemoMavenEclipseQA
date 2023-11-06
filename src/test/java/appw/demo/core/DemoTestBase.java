package appw.demo.core;

import appw.common.core.TestBase;
import appw.demo.core.DemoManager;

public class DemoTestBase extends TestBase{
	
	 public DemoManager demo() {
	        return appManager.getDemoManager();
	    }

}
