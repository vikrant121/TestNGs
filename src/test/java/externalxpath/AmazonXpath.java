package externalxpath;

public class AmazonXpath
{

	 // login
		public static final String signin = "//*[text() = 'Hello, sign in']";
		public static final String uid = "//*[@id=\"ap_email\"]";
		public static final String ctnbtn = "//*[@id=\"continue\"]";
		public static final String err1 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";
	    public static final String pwd = "//*[@id=\"ap_password\"]";
	    public static final String submit = "//*[@id=\"signInSubmit\"]";
	    public static final String err2 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";
	    
	    // Shop
	    public static final String searchbox = "//*[@id=\"twotabsearchtextbox\"]";
	    public static final String searchresult = "//*[@class = 'a-size-base-plus a-color-base a-text-normal']";
	    public static final String kartbtn = "//*[@id=\"add-to-cart-button\"]";

	    // signin
	    public static final String newusersignin = "//*[@id=\"createAccountSubmit\"]";
}
