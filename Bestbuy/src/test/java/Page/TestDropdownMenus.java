package Page;

import BBMethods.BBCommonAPI;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ui.DropDownMenus;

/**
 * Created by admin on 1/27/17.
 */
public class TestDropdownMenus extends CommonAPI {

    @Test
    public void DropDownMenu() throws InterruptedException{
        BBCommonAPI bbapi= PageFactory.initElements(driver,BBCommonAPI.class);
        bbapi.refuseMailingListOption();

        DropDownMenus dd = PageFactory.initElements(driver,DropDownMenus.class);
        dd.dropDownMenu();
        sleepFor(1);
    }
}
