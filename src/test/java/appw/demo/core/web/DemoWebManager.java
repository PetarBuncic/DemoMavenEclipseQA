package appw.demo.core.web;

import appw.common.core.AppManager;
import appw.demo.core.DemoManager;
import appw.demo.helpers.ConfigHelper;
import appw.demo.helpers.SettingsHelper;

public class DemoWebManager extends DemoManager {
	
	//private InovatecWebPagesHelper pages;
    private ConfigHelper config;
    private SettingsHelper settings;
	
	public DemoWebManager(AppManager app) {
		super(app);
	}
	
	 public ConfigHelper config() throws Exception {
	        if(config == null) {
	            config = new ConfigHelper(this);
	        }

	        return config;
	    }

	    public SettingsHelper settings() throws Exception {
	        if(settings == null) {
	            settings = new SettingsHelper(this);
	        }

	        return settings;
	    }

}
