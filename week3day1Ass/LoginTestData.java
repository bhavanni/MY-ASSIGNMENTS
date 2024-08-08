package week3day1Ass;

public class LoginTestData extends TestData {
    public void enterUsername() {
        System.out.println("Username " );
        
    }

    public void enterPassword() {
        System.out.println("Password " );
        
    }
    
    public static void main(String[] args) {
		
            LoginTestData loginTestData = new LoginTestData();
            loginTestData.enterCredentials();
            loginTestData.navigateToHomePage();
            loginTestData.enterUsername();
            loginTestData.enterPassword();
        }
    
}