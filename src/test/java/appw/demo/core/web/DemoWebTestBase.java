package appw.demo.core.web;

import appw.demo.core.DemoTestBase;
import appw.demo.core.web.DemoWebManager;

public class DemoWebTestBase extends DemoTestBase {
	
	
	@Override
	public DemoWebManager demo() {
		return appManager.getDemoWebManager();
	}

}
