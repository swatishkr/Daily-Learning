package EverydayJava2022;

public class SocialMediaPage {

	String UserName;
	String UserEmail;

	public static void main(String args[])

	{
		UserDetail newUserDetail = new UserDetail();
		try {
				newUserDetail.addUserLocation();
				newUserDetail.addUserGender();
				newUserDetail.addUserAge();
			}
		finally {
			newUserDetail.close();
		}
	}
}
