package Util;

import Setup.BaseSetup;
import io.cucumber.java.*;


public class ProjectHooks {
    BaseSetup setup = new BaseSetup();
    @Before
    public void setUp() {
      setup.openBrowser();
    }
    @After
    public void tearDown (){
        setup.closeBrowser();
    }

}
