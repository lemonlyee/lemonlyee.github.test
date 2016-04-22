package browser.runner;

import java.io.File;
import java.io.IOException;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiObject;

//import javax.annotation.Resource;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.meizu.automation.Expectation;
import com.meizu.automation.Steps;
import com.meizu.automation.constants.AutoException;
import com.meizu.test.common.AutoAllInOneTestCase;
import com.meizu.test.util.AppInfo;
import com.meizu.test.util.ShellUtil;

import android.os.RemoteException;
import android.renderscript.Element;


public class PriorityTest  extends Runbase{

	public void test001() throws IOException,AutoException,UiObjectNotFoundException,RemoteException{
	 this.sleep(2000);
	 this.findElement("android:id/button1").click();
	 this.swipeUp(10);
	 UiCollection v=new UiCollection(new UiSelector().
			 resourceId("com.android.browser:id/pager_container"));
	 
    for(int i=0;i<6;i++)
     {
    	UiObject title=v.getChildByInstance(new UiSelector().
    			resourceId("com.android.browser:id/title"), i);
    	title.click();
    	this.sleep(500);
    	this.findElement("com.android.browser:id/backward").click();
     }
   
		
	}

	public void test002() throws IOException,AutoException,UiObjectNotFoundException,RemoteException{
		this.sleep(2000);
		this.findElement("android:id/button1").click();
		this.swipeUp(10);
		 String before=this.findElement("com.android.browser:id/title").getText();
		 this.swipeLeft(10);
		 String after=this.findElement("com.android.browser:id/title").getText();
		 assertTrue(!before.equals(after));
	}
	}
   



