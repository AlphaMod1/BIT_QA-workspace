package pagesTest;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesCalendar {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "cd-menu-trigger")
    @CacheLookup
    private WebElement _0;

    @FindBy(id = "search")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf1;

    @FindBy(id = "campaign_name")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf2;

    @FindBy(id = "c_select_left_menu")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf3;

    @FindBy(css = "#c_select_left_menu_chosen div.chosen-drop div.chosen-search input.chosen-search-input[type='text']")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf4;

    @FindBy(id = "c_pages_left_menu")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf5;

    @FindBy(css = "input.chosen-search-input.default")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf6;

    @FindBy(id = "customer_name")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf7;

    @FindBy(id = "customer_email")
    @CacheLookup
    private WebElement aCampaignIsACollectionOf8;

    @FindBy(id = "min-date")
    @CacheLookup
    private WebElement aTaskIsAnEntityShared1;

    @FindBy(id = "max-date")
    @CacheLookup
    private WebElement aTaskIsAnEntityShared2;

    @FindBy(id = "add-file-button")
    @CacheLookup
    private WebElement addFile;

    @FindBy(id = "add_post_button")
    @CacheLookup
    private WebElement addPost;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(11) div.sp-dropdown.sp-dropdown-main.sp-menu-left div.sp-dropdown-inner ul.sp-dropdown-items li:nth-of-type(4) a")
    @CacheLookup
    private WebElement addTag1;

    @FindBy(css = "#collapse-menu-417-496 li:nth-of-type(4) a")
    @CacheLookup
    private WebElement addTag2;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(4) a")
    @CacheLookup
    private WebElement analytics1;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(3) a")
    @CacheLookup
    private WebElement analytics2;

    @FindBy(css = "#calendar div:nth-of-type(2) div.fc-view.fc-month-view.fc-basic-view table tbody.fc-body tr td.fc-widget-content div.fc-scroller.fc-day-grid-container div.fc-day-grid.fc-unselectable div:nth-of-type(1) div:nth-of-type(2) table tbody tr:nth-of-type(1) td:nth-of-type(3) a.fc-day-grid-event.fc-h-event.fc-event.fc-start.fc-end.customer-.fc-draggable")
    @CacheLookup
    private WebElement baisiaiIlgasTekstasBaisiaiIlgas1332;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(3) a")
    @CacheLookup
    private WebElement calendar1;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(2) a")
    @CacheLookup
    private WebElement calendar2;

    @FindBy(name = "choose")
    @CacheLookup
    private List<WebElement> campaign;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(1) a.campaign-icon")
    @CacheLookup
    private WebElement campaignLogo;

    private final String campaignValue = "";

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(9) a")
    @CacheLookup
    private WebElement chat;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(11) div.sp-dropdown.sp-dropdown-main.sp-menu-left div.sp-dropdown-inner ul.sp-dropdown-items li:nth-of-type(1) a")
    @CacheLookup
    private WebElement companies1;

    @FindBy(css = "#collapse-menu-417-496 li:nth-of-type(1) a")
    @CacheLookup
    private WebElement companies2;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(11) div.sp-dropdown.sp-dropdown-main.sp-menu-left div.sp-dropdown-inner ul.sp-dropdown-items li:nth-of-type(2) a")
    @CacheLookup
    private WebElement companyUsers1;

    @FindBy(css = "#collapse-menu-417-496 li:nth-of-type(2) a")
    @CacheLookup
    private WebElement companyUsers2;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(11) div.sp-dropdown.sp-dropdown-main.sp-menu-left div.sp-dropdown-inner ul.sp-dropdown-items li:nth-of-type(3) a")
    @CacheLookup
    private WebElement customers1;

    @FindBy(css = "#collapse-menu-417-496 li:nth-of-type(3) a")
    @CacheLookup
    private WebElement customers2;

    @FindBy(css = "button.fc-agendaDay-button.fc-button.fc-state-default.fc-corner-right")
    @CacheLookup
    private WebElement day;

    @FindBy(id = "delete_button")
    @CacheLookup
    private WebElement delete;

    @FindBy(css = "#campaign_assign_list_chosen a.chosen-single")
    @CacheLookup
    private WebElement dsadsa;

    @FindBy(css = "a.dropdown-toggle")
    @CacheLookup
    private WebElement englishUnitedKingdom1;

    @FindBy(css = "#sp-top2 div.sp-column. div.sp-module. div.sp-module-content div.mod-languages div.btn-group ul.lang-block.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement englishUnitedKingdom2;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(5) a")
    @CacheLookup
    private WebElement fbTimeline1;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(4) a")
    @CacheLookup
    private WebElement fbTimeline2;

    @FindBy(css = "#calendar div:nth-of-type(2) div.fc-view.fc-month-view.fc-basic-view table tbody.fc-body tr td.fc-widget-content div.fc-scroller.fc-day-grid-container div.fc-day-grid.fc-unselectable div:nth-of-type(1) div:nth-of-type(2) table tbody tr:nth-of-type(2) td.fc-event-container a.fc-day-grid-event.fc-h-event.fc-event.fc-start.fc-end.customer-.fc-draggable")
    @CacheLookup
    private WebElement h5labahfudhsfuehsih5spanBlablablablblakka1335;

    @FindBy(css = "a[href='/index.php/lt/']")
    @CacheLookup
    private WebElement lietuviLietuvaLtlt;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(12) a")
    @CacheLookup
    private WebElement logout;

    @FindBy(css = "#c_select_left_menu_chosen a.chosen-single")
    @CacheLookup
    private WebElement matthewalcjcffgbbgi1;

    @FindBy(css = "#user_assign_list_chosen a.chosen-single")
    @CacheLookup
    private WebElement matthewalcjcffgbbgi2;

    @FindBy(css = "button.fc-month-button.fc-button.fc-state-default.fc-corner-left.fc-state-active")
    @CacheLookup
    private WebElement month;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(8) a.paperplane")
    @CacheLookup
    private WebElement newPost1;

    @FindBy(css = "a.new_post_button")
    @CacheLookup
    private WebElement newPost2;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(7) a.paperplane")
    @CacheLookup
    private WebElement newPost3;

    @FindBy(id = "cookiehintsubmit")
    @CacheLookup
    private WebElement ok;

    @FindBy(id = "task-title")
    @CacheLookup
    private WebElement page1;

    @FindBy(css = "#campaign_assign_list_chosen div.chosen-drop div.chosen-search input.chosen-search-input[type='text']")
    @CacheLookup
    private WebElement page10;

    @FindBy(id = "page-assign-list")
    @CacheLookup
    private WebElement page11;

    @FindBy(css = "#page_assign_list_chosen div.chosen-drop div.chosen-search input.chosen-search-input[type='text']")
    @CacheLookup
    private WebElement page12;

    @FindBy(id = "task-description")
    @CacheLookup
    private WebElement page13;

    @FindBy(id = "task-state-list")
    @CacheLookup
    private WebElement page2;

    @FindBy(css = "#task_state_list_chosen div.chosen-drop div.chosen-search input.chosen-search-input[type='text']")
    @CacheLookup
    private WebElement page3;

    @FindBy(id = "task-start")
    @CacheLookup
    private WebElement page4;

    @FindBy(id = "task-end")
    @CacheLookup
    private WebElement page5;

    @FindBy(id = "user-assign-list")
    @CacheLookup
    private WebElement page6;

    @FindBy(css = "#user_assign_list_chosen div.chosen-drop div.chosen-search input.chosen-search-input[type='text']")
    @CacheLookup
    private WebElement page7;

    @FindBy(name = "choose")
    @CacheLookup
    private List<WebElement> page8;

    @FindBy(id = "campaign-assign-list")
    @CacheLookup
    private WebElement page9;

    private final String pageLoadedText = "Usually, the customer is a client of a company or a single user, whose social networks are going to be managed by a company users or a single user";

    private final String pageUrl = "/";

    @FindBy(id = "show-plan-button")
    @CacheLookup
    private WebElement plans;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(6) a")
    @CacheLookup
    private WebElement posts1;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(5) a")
    @CacheLookup
    private WebElement posts2;

    @FindBy(id = "subscription-purchase-button")
    @CacheLookup
    private WebElement purchase1;

    @FindBy(id = "view-plans-purchase-button")
    @CacheLookup
    private WebElement purchase2;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(10) a")
    @CacheLookup
    private WebElement questions;

    @FindBy(id = "save_task_button")
    @CacheLookup
    private WebElement saveTask;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(11) a")
    @CacheLookup
    private WebElement settings;

    @FindBy(css = "a.logo")
    @CacheLookup
    private WebElement sposterOnline;

    @FindBy(id = "subscription-button")
    @CacheLookup
    private WebElement subscription;

    @FindBy(css = "#sp-menu div.sp-column. div:nth-of-type(2) ul.sp-megamenu-parent.menu-fade.hidden-sm.hidden-xs li:nth-of-type(7) a")
    @CacheLookup
    private WebElement tasks1;

    @FindBy(css = ".site.com-spostercalendar.view-showcalendar.no-layout.no-task.itemid-2825.en-gb.ltr.sticky-header.layout-fluid.off-canvas-menu-init div:nth-of-type(3) div.offcanvas-inner div.sp-module._menu div:nth-of-type(2) ul.accordion-menu. li:nth-of-type(6) a")
    @CacheLookup
    private WebElement tasks2;

    @FindBy(css = "button.fc-today-button.fc-button.fc-state-default.fc-corner-left.fc-corner-right.fc-state-disabled")
    @CacheLookup
    private WebElement today;

    @FindBy(css = "#page_assign_list_chosen a.chosen-single")
    @CacheLookup
    private WebElement uabPatestuokMatthewalcjcffgbbgi;

    @FindBy(css = "button.fc-agendaWeek-button.fc-button.fc-state-default")
    @CacheLookup
    private WebElement week;

    public PagesCalendar() {
    }

    public PagesCalendar(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public PagesCalendar(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public PagesCalendar(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    /**
     * Click on Add File Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAddFileButton() {
        addFile.click();
        return this;
    }

    /**
     * Click on Add Post Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAddPostButton() {
        addPost.click();
        return this;
    }

    /**
     * Click on Add Tag Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAddTag1Link() {
        addTag1.click();
        return this;
    }

    /**
     * Click on Add Tag Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAddTag2Link() {
        addTag2.click();
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAnalytics1Link() {
        analytics1.click();
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickAnalytics2Link() {
        analytics2.click();
        return this;
    }

    /**
     * Click on 1332 Baisiai Ilgas Tekstas Baisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasbaisiai Ilgas Tekstasba Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickBaisiaiIlgasTekstasBaisiaiIlgasLink1332() {
        baisiaiIlgasTekstasBaisiaiIlgas1332.click();
        return this;
    }

    /**
     * Click on Calendar Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCalendar1Link() {
        calendar1.click();
        return this;
    }

    /**
     * Click on Calendar Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCalendar2Link() {
        calendar2.click();
        return this;
    }

    /**
     * Click on Campaign Logo Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCampaignLogoLink() {
        campaignLogo.click();
        return this;
    }

    /**
     * Click on Chat Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickChatLink() {
        chat.click();
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCompanies1Link() {
        companies1.click();
        return this;
    }

    /**
     * Click on Companies Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCompanies2Link() {
        companies2.click();
        return this;
    }

    /**
     * Click on Company Users Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCompanyUsers1Link() {
        companyUsers1.click();
        return this;
    }

    /**
     * Click on Company Users Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCompanyUsers2Link() {
        companyUsers2.click();
        return this;
    }

    /**
     * Click on Customers Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCustomers1Link() {
        customers1.click();
        return this;
    }

    /**
     * Click on Customers Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickCustomers2Link() {
        customers2.click();
        return this;
    }

    /**
     * Click on Day Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickDayButton() {
        day.click();
        return this;
    }

    /**
     * Click on Delete Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickDeleteButton() {
        delete.click();
        return this;
    }

    /**
     * Click on Dsadsa Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickDsadsaLink() {
        dsadsa.click();
        return this;
    }

    /**
     * Click on English United Kingdom Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickEnglishUnitedKingdom1Link() {
        englishUnitedKingdom1.click();
        return this;
    }

    /**
     * Click on English United Kingdom Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickEnglishUnitedKingdom2Link() {
        englishUnitedKingdom2.click();
        return this;
    }

    /**
     * Click on Fb Timeline Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickFbTimeline1Link() {
        fbTimeline1.click();
        return this;
    }

    /**
     * Click on Fb Timeline Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickFbTimeline2Link() {
        fbTimeline2.click();
        return this;
    }

    /**
     * Click on 1335 H5labahfudhsfuehsih5span Blablablablblakka Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickH5labahfudhsfuehsih5spanBlablablablblakkaLink1335() {
        h5labahfudhsfuehsih5spanBlablablablblakka1335.click();
        return this;
    }

    /**
     * Click on Lietuvi Lietuva Ltlt Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickLietuviLietuvaLtltLink() {
        lietuviLietuvaLtlt.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the PagesCalendar class instance.
     */
 
    /**
     * Click on Logout Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickLogoutLink() {
        logout.click();
        return this;
    }

    /**
     * Click on Matthewalcjcffgbbgi Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickMatthewalcjcffgbbgi1Link() {
        matthewalcjcffgbbgi1.click();
        return this;
    }

    /**
     * Click on Matthewalcjcffgbbgi Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickMatthewalcjcffgbbgi2Link() {
        matthewalcjcffgbbgi2.click();
        return this;
    }

    /**
     * Click on Month Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickMonthButton() {
        month.click();
        return this;
    }


    /**
     * Click on New Post Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickNewPost1Link() {
        newPost1.click();
        return this;
    }

    /**
     * Click on New Post Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickNewPost2Link() {
        newPost2.click();
        return this;
    }

    /**
     * Click on New Post Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickNewPost3Link() {
        newPost3.click();
        return this;
    }

    /**
     * Click on Ok Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickOkLink() {
        ok.click();
        return this;
    }

    /**
     * Click on Plans Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickPlansButton() {
        plans.click();
        return this;
    }

    /**
     * Click on Posts Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickPosts1Link() {
        posts1.click();
        return this;
    }

    /**
     * Click on Posts Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickPosts2Link() {
        posts2.click();
        return this;
    }

    /**
     * Click on Purchase Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickPurchase1Button() {
        purchase1.click();
        return this;
    }

    /**
     * Click on Purchase Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickPurchase2Button() {
        purchase2.click();
        return this;
    }

    /**
     * Click on Questions Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickQuestionsLink() {
        questions.click();
        return this;
    }

    /**
     * Click on Save Task Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickSaveTaskButton() {
        saveTask.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Sposter Online Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickSposterOnlineLink() {
        sposterOnline.click();
        return this;
    }

    /**
     * Click on Subscription Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickSubscriptionButton() {
        subscription.click();
        return this;
    }

    /**
     * Click on Tasks Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickTasks1Link() {
        tasks1.click();
        return this;
    }

    /**
     * Click on Tasks Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickTasks2Link() {
        tasks2.click();
        return this;
    }

    /**
     * Click on Today Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickTodayButton() {
        today.click();
        return this;
    }

    /**
     * Click on Uab Patestuok Matthewalcjcffgbbgi Link.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickUabPatestuokMatthewalcjcffgbbgiLink() {
        uabPatestuokMatthewalcjcffgbbgi.click();
        return this;
    }

    /**
     * Click on Week Button.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar clickWeekButton() {
        week.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar fill() {
        setACampaignIsACollectionOf1TextField();
        setACampaignIsACollectionOf2TextField();
        setACampaignIsACollectionOf3DropDownListField();
        setACampaignIsACollectionOf4TextField();
        setACampaignIsACollectionOf5DropDownListField();
        setACampaignIsACollectionOf6TextField();
        setACampaignIsACollectionOf7TextField();
        setACampaignIsACollectionOf8EmailField();
        setPage1DropDownListField();
        setPage2DropDownListField();
        setPage3TextField();
        setPage4TextField();
        setPage5TextField();
        setPage6DropDownListField();
        setPage7TextField();
        setCampaignRadioButtonField();
        setPage9DropDownListField();
        setPage10TextField();
        setPage11DropDownListField();
        setPage12TextField();
        setPage13TextareaField();
        setATaskIsAnEntityShared1TextField();
        setATaskIsAnEntityShared2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf1TextField() {
        return setACampaignIsACollectionOf1TextField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_1"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf1TextField(String aCampaignIsACollectionOf1Value) {
        aCampaignIsACollectionOf1.sendKeys(aCampaignIsACollectionOf1Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf2TextField() {
        return setACampaignIsACollectionOf2TextField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_2"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf2TextField(String aCampaignIsACollectionOf2Value) {
        aCampaignIsACollectionOf2.sendKeys(aCampaignIsACollectionOf2Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf3DropDownListField() {
        return setACampaignIsACollectionOf3DropDownListField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_3"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf3DropDownListField(String aCampaignIsACollectionOf3Value) {
        new Select(aCampaignIsACollectionOf3).selectByVisibleText(aCampaignIsACollectionOf3Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf4TextField() {
        return setACampaignIsACollectionOf4TextField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_4"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf4TextField(String aCampaignIsACollectionOf4Value) {
        aCampaignIsACollectionOf4.sendKeys(aCampaignIsACollectionOf4Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf5DropDownListField() {
        return setACampaignIsACollectionOf5DropDownListField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_5"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf5DropDownListField(String aCampaignIsACollectionOf5Value) {
        new Select(aCampaignIsACollectionOf5).selectByVisibleText(aCampaignIsACollectionOf5Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf6TextField() {
        return setACampaignIsACollectionOf6TextField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_6"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf6TextField(String aCampaignIsACollectionOf6Value) {
        aCampaignIsACollectionOf6.sendKeys(aCampaignIsACollectionOf6Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf7TextField() {
        return setACampaignIsACollectionOf7TextField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_7"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf7TextField(String aCampaignIsACollectionOf7Value) {
        aCampaignIsACollectionOf7.sendKeys(aCampaignIsACollectionOf7Value);
        return this;
    }

    /**
     * Set default value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Email field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf8EmailField() {
        return setACampaignIsACollectionOf8EmailField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_8"));
    }

    /**
     * Set value to A Campaign Is A Collection Of Customer Pages From Different Social Networks Email field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setACampaignIsACollectionOf8EmailField(String aCampaignIsACollectionOf8Value) {
        aCampaignIsACollectionOf8.sendKeys(aCampaignIsACollectionOf8Value);
        return this;
    }

    /**
     * Set default value to A Task Is An Entity Shared Between Company Users That Has Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setATaskIsAnEntityShared1TextField() {
        return setATaskIsAnEntityShared1TextField(data.get("A_TASK_IS_AN_ENTITY_SHARED_1"));
    }

    /**
     * Set value to A Task Is An Entity Shared Between Company Users That Has Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setATaskIsAnEntityShared1TextField(String aTaskIsAnEntityShared1Value) {
        aTaskIsAnEntityShared1.sendKeys(aTaskIsAnEntityShared1Value);
        return this;
    }

    /**
     * Set default value to A Task Is An Entity Shared Between Company Users That Has Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setATaskIsAnEntityShared2TextField() {
        return setATaskIsAnEntityShared2TextField(data.get("A_TASK_IS_AN_ENTITY_SHARED_2"));
    }

    /**
     * Set value to A Task Is An Entity Shared Between Company Users That Has Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setATaskIsAnEntityShared2TextField(String aTaskIsAnEntityShared2Value) {
        aTaskIsAnEntityShared2.sendKeys(aTaskIsAnEntityShared2Value);
        return this;
    }

    /**
     * Set default value to Campaign Radio Button field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setCampaignRadioButtonField() {
        for (WebElement el : campaign) {
            if (el.getAttribute("value").equals(campaignValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage10TextField() {
        return setPage10TextField(data.get("PAGE_10"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage10TextField(String page10Value) {
        page10.sendKeys(page10Value);
        return this;
    }

    /**
     * Set default value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage11DropDownListField() {
        return setPage11DropDownListField(data.get("PAGE_11"));
    }

    /**
     * Set value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage11DropDownListField(String page11Value) {
        new Select(page11).selectByVisibleText(page11Value);
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage12TextField() {
        return setPage12TextField(data.get("PAGE_12"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage12TextField(String page12Value) {
        page12.sendKeys(page12Value);
        return this;
    }

    /**
     * Set default value to Page Textarea field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage13TextareaField() {
        return setPage13TextareaField(data.get("PAGE_13"));
    }

    /**
     * Set value to Page Textarea field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage13TextareaField(String page13Value) {
        page13.sendKeys(page13Value);
        return this;
    }

    /**
     * Set default value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage1DropDownListField() {
        return setPage1DropDownListField(data.get("PAGE_1"));
    }

    /**
     * Set value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage1DropDownListField(String page1Value) {
        page1.sendKeys(page1Value);
        return this;
    }

    /**
     * Set default value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage2DropDownListField() {
        return setPage2DropDownListField(data.get("PAGE_2"));
    }

    /**
     * Set value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage2DropDownListField(String page2Value) {
        new Select(page2).selectByVisibleText(page2Value);
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage3TextField() {
        return setPage3TextField(data.get("PAGE_3"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage3TextField(String page3Value) {
        page3.sendKeys(page3Value);
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage4TextField() {
        return setPage4TextField(data.get("PAGE_4"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage4TextField(String page4Value) {
        page4.sendKeys(page4Value);
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage5TextField() {
        return setPage5TextField(data.get("PAGE_5"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage5TextField(String page5Value) {
        page5.sendKeys(page5Value);
        return this;
    }

    /**
     * Set default value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage6DropDownListField() {
        return setPage6DropDownListField(data.get("PAGE_6"));
    }

    /**
     * Set value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage6DropDownListField(String page6Value) {
        new Select(page6).selectByVisibleText(page6Value);
        return this;
    }

    /**
     * Set default value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage7TextField() {
        return setPage7TextField(data.get("PAGE_7"));
    }

    /**
     * Set value to Page Text field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage7TextField(String page7Value) {
        page7.sendKeys(page7Value);
        return this;
    }

    /**
     * Set default value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage9DropDownListField() {
        return setPage9DropDownListField(data.get("PAGE_9"));
    }

    /**
     * Set value to Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar setPage9DropDownListField(String page9Value) {
        new Select(page9).selectByVisibleText(page9Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar submit() {
        clickPlansButton();
        return this;
    }

    /**
     * Unset default value from A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetACampaignIsACollectionOf3DropDownListField() {
        return unsetACampaignIsACollectionOf3DropDownListField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_3"));
    }

    /**
     * Unset value from A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetACampaignIsACollectionOf3DropDownListField(String aCampaignIsACollectionOf3Value) {
        new Select(aCampaignIsACollectionOf3).deselectByVisibleText(aCampaignIsACollectionOf3Value);
        return this;
    }

    /**
     * Unset default value from A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetACampaignIsACollectionOf5DropDownListField() {
        return unsetACampaignIsACollectionOf5DropDownListField(data.get("A_CAMPAIGN_IS_A_COLLECTION_OF_5"));
    }

    /**
     * Unset value from A Campaign Is A Collection Of Customer Pages From Different Social Networks Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetACampaignIsACollectionOf5DropDownListField(String aCampaignIsACollectionOf5Value) {
        new Select(aCampaignIsACollectionOf5).deselectByVisibleText(aCampaignIsACollectionOf5Value);
        return this;
    }

    /**
     * Unset default value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage11DropDownListField() {
        return unsetPage11DropDownListField(data.get("PAGE_11"));
    }

    /**
     * Unset value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage11DropDownListField(String page11Value) {
        new Select(page11).deselectByVisibleText(page11Value);
        return this;
    }

    /**
     * Unset default value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage2DropDownListField() {
        return unsetPage2DropDownListField(data.get("PAGE_2"));
    }

    /**
     * Unset value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage2DropDownListField(String page2Value) {
        new Select(page2).deselectByVisibleText(page2Value);
        return this;
    }

    /**
     * Unset default value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage6DropDownListField() {
        return unsetPage6DropDownListField(data.get("PAGE_6"));
    }

    /**
     * Unset value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage6DropDownListField(String page6Value) {
        new Select(page6).deselectByVisibleText(page6Value);
        return this;
    }

    /**
     * Unset default value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage9DropDownListField() {
        return unsetPage9DropDownListField(data.get("PAGE_9"));
    }

    /**
     * Unset value from Page Drop Down List field.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar unsetPage9DropDownListField(String page9Value) {
        new Select(page9).deselectByVisibleText(page9Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the PagesCalendar class instance.
     */
    public PagesCalendar verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
