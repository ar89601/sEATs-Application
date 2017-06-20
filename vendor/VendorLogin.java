/**
 * @author Ashley.Ridout
 * @date May 27, 2017
 *
 */
package vendor;

public class VendorLogin {
	//single instance
	private static final VendorLogin UserName = new VendorLogin();

	//private constructor
	private VendorLogin(){}
	
	//get instance
	public static VendorLogin getSingeltonOfUserName(){
		return UserName;
	}
	
	protected static void uniqueSingleton(){
		System.out.println("User name accepted. Please enter a password.");
	}
}
