package monethaPages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MonethaProfile {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;
    
    public void scrollBy(int scroll) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+scroll+")");
    }

    @FindBy(css = "a[href='/about']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='/user/reports/dashboards']")
    @CacheLookup
    private WebElement analytics;

    @FindBy(css = "#app div.mh-merchant div.mh-after-login-template header.mh-header.mh-with-sub-navbar div.container div:nth-of-type(1) a")
    @CacheLookup
    private WebElement b340ab5c65d9109748a9ae604b2e4d801;

    @FindBy(css = "#app div.mh-merchant div.mh-after-login-template footer.mh-footer div.mh-footer-bottom-row div.container div:nth-of-type(1) div:nth-of-type(1) div.mh-footer-info div:nth-of-type(1) a")
    @CacheLookup
    private WebElement b340ab5c65d9109748a9ae604b2e4d802;

    @FindBy(css = "a[href='https://blog.monetha.io/']")
    @CacheLookup
    private WebElement blog;

    @FindBy(css = "a[href='/bounty']")
    @CacheLookup
    private WebElement bountyProgram;

    @FindBy(css = "a[href='/jobs']")
    @CacheLookup
    private WebElement careers;

    @FindBy(css = "a[href='/user/check-trust']")
    @CacheLookup
    private WebElement checkTrust;

    @FindBy(css = "a[href='/docs/cookies-policy']")
    @CacheLookup
    private WebElement cookiePolicy;

    @FindBy(css = "a[href='/user/deals']")
    @CacheLookup
    private WebElement deals;

    @FindBy(css = "a[href='/e-commerce']")
    @CacheLookup
    private WebElement ecommerce;

    @FindBy(css = "#app div.mh-merchant div.mh-after-login-template div.mh-content div div.mh-page-with-header.mh-payments-page div div:nth-of-type(2) div.mh-section-md.mh-distinct-section div.container div:nth-of-type(1) div.mh-image-picker div.mh-add-photos-button-container input[type='file']")
    @CacheLookup
    private WebElement emailnotVerified1;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement emailnotVerified2;

    @FindBy(css = "a[href='https://help.monetha.io/']")
    @CacheLookup
    private WebElement help;

    @FindBy(name = "address")
    @CacheLookup
    private WebElement homeAddress;

    @FindBy(css = "a[href='https://icoanalyzer.monetha.io']")
    @CacheLookup
    private WebElement icoAnalyzer;

    @FindBy(css = "a[href='https://blog.monetha.io/category/knowledgecenter/']")
    @CacheLookup
    private WebElement knowledgeCenter;

    @FindBy(css = "a[href='javascript:void(0)']")
    @CacheLookup
    private WebElement logOut;

    @FindBy(css = "a[href='/deals']")
    @CacheLookup
    private WebElement marketplace;

    @FindBy(css = "a[href='https://github.com/monetha/decentralized-reputation-framework']")
    @CacheLookup
    private WebElement monethaReputationPlatform;

    @FindBy(css = "a[href='/user/orders']")
    @CacheLookup
    private WebElement orders;

    private final String pageLoadedText = "";

    private final String pageUrl = "/user/settings";

    @FindBy(css = "a[href='/user/payments']")
    @CacheLookup
    private WebElement paymentsSettings;

    @FindBy(css = "a[href='/peer-to-peer-deals']")
    @CacheLookup
    private WebElement peertopeerDeals;

    @FindBy(css = "a[href='/presskit']")
    @CacheLookup
    private WebElement pressKit;

    @FindBy(css = "a[href='/docs/privacy-policy-web']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "#app div.mh-merchant div.mh-after-login-template header.mh-header.mh-with-sub-navbar div.container div:nth-of-type(2) div.mh-navbar nav div:nth-of-type(7) a")
    @CacheLookup
    private WebElement profile1;

    @FindBy(css = "#app div.mh-merchant div.mh-after-login-template header.mh-header.mh-with-sub-navbar div.container div:nth-of-type(2) div.mh-navbar nav div:nth-of-type(7) div.mh-sub-navbar.mh-right div:nth-of-type(1) a")
    @CacheLookup
    private WebElement profile2;

    @FindBy(css = "a[href='/user/reputation-widgets']")
    @CacheLookup
    private WebElement reputationWidgets1;

    @FindBy(css = "a[href='/reputation-widgets']")
    @CacheLookup
    private WebElement reputationWidgets2;

    @FindBy(css = "a[href='/user/settings']")
    @CacheLookup
    private WebElement settings;

    @FindBy(css = "a[href='/docs/terms-of-services']")
    @CacheLookup
    private WebElement termsAndConditions;

    @FindBy(css = "button.btn.btn-blue")
    @CacheLookup
    private WebElement updateSettings;

    @FindBy(css = "a[href='/user/wallet']")
    @CacheLookup
    private WebElement wallet;

    @FindBy(css = "a[href='/Monetha_WP.pdf']")
    @CacheLookup
    private WebElement whitePaper;

    public MonethaProfile() {
    }

    public MonethaProfile(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MonethaProfile(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public MonethaProfile(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickAnalyticsLink() {
        analytics.click();
        return this;
    }

    /**
     * Click on B340ab5c65d9109748a9ae604b2e4d80 Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickB340ab5c65d9109748a9ae604b2e4d801Link() {
        b340ab5c65d9109748a9ae604b2e4d801.click();
        return this;
    }

    /**
     * Click on B340ab5c65d9109748a9ae604b2e4d80 Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickB340ab5c65d9109748a9ae604b2e4d802Link() {
        b340ab5c65d9109748a9ae604b2e4d802.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Bounty Program Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickBountyProgramLink() {
        bountyProgram.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Check Trust Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickCheckTrustLink() {
        checkTrust.click();
        return this;
    }

    /**
     * Click on Cookie Policy Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickCookiePolicyLink() {
        cookiePolicy.click();
        return this;
    }

    /**
     * Click on Deals Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickDealsLink() {
        deals.click();
        return this;
    }

    /**
     * Click on Ecommerce Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickEcommerceLink() {
        ecommerce.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Ico Analyzer Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickIcoAnalyzerLink() {
        icoAnalyzer.click();
        return this;
    }

    /**
     * Click on Knowledge Center Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickKnowledgeCenterLink() {
        knowledgeCenter.click();
        return this;
    }

    /**
     * Click on Log Out Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickLogOutLink() {
        logOut.click();
        return this;
    }

    /**
     * Click on Marketplace Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickMarketplaceLink() {
        marketplace.click();
        return this;
    }

    /**
     * Click on Monetha Reputation Platform Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickMonethaReputationPlatformLink() {
        monethaReputationPlatform.click();
        return this;
    }

    /**
     * Click on Orders Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickOrdersLink() {
        orders.click();
        return this;
    }

    /**
     * Click on Payments Settings Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickPaymentsSettingsLink() {
        paymentsSettings.click();
        return this;
    }

    /**
     * Click on Peertopeer Deals Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickPeertopeerDealsLink() {
        peertopeerDeals.click();
        return this;
    }

    /**
     * Click on Press Kit Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickPressKitLink() {
        pressKit.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Profile Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickProfile1Link() {
        profile1.click();
        return this;
    }

    /**
     * Click on Profile Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickProfile2Link() {
        profile2.click();
        return this;
    }

    /**
     * Click on Reputation Widgets Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickReputationWidgets1Link() {
        reputationWidgets1.click();
        return this;
    }

    /**
     * Click on Reputation Widgets Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickReputationWidgets2Link() {
        reputationWidgets2.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Terms And Conditions Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickTermsAndConditionsLink() {
        termsAndConditions.click();
        return this;
    }

    /**
     * Click on Update Settings Button.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickUpdateSettingsButton() {
        updateSettings.click();
        return this;
    }
    

    /**
     * Click on Wallet Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickWalletLink() {
        wallet.click();
        return this;
    }

    /**
     * Click on White Paper Link.
     *
     * @return the profile class instance.
     */
    public MonethaProfile clickWhitePaperLink() {
        whitePaper.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the profile class instance.
     */
    public MonethaProfile fill() {
        setHomeAddressTextField();
        setEmailnotVerified2EmailField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the profile class instance.
     */
    public MonethaProfile fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Emailnot Verified Email field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setEmailnotVerified1EmailField() {
        return setEmailnotVerified1EmailField(data.get("EMAILNOT_VERIFIED_1"));
    }

    /**
     * Set value to Emailnot Verified Email field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setEmailnotVerified1EmailField(String emailnotVerified1Value) {
        return this;
    }

    /**
     * Set default value to Emailnot Verified Email field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setEmailnotVerified2EmailField() {
        return setEmailnotVerified2EmailField(data.get("EMAILNOT_VERIFIED_2"));
    }

    /**
     * Set value to Emailnot Verified Email field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setEmailnotVerified2EmailField(String emailnotVerified2Value) {
    	emailnotVerified2.clear();
        emailnotVerified2.sendKeys(emailnotVerified2Value);
        return this;
    }

    /**
     * Set default value to Home Address Text field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setHomeAddressTextField() {
        return setHomeAddressTextField(data.get("HOME_ADDRESS"));
    }

    /**
     * Set value to Home Address Text field.
     *
     * @return the profile class instance.
     */
    public MonethaProfile setHomeAddressTextField(String homeAddressValue) {
    	homeAddress.clear();
        homeAddress.sendKeys(homeAddressValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the profile class instance.
     */
    public MonethaProfile submit() {
        clickUpdateSettingsButton();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the profile class instance.
     */
    public MonethaProfile verifyPageLoaded() {
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
     * @return the profile class instance.
     */
    public MonethaProfile verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
