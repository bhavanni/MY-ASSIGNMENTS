package week3day2Ass;

public class JavaConnection1 implements DatabaseConnection {

	

	@Override
	public void connect() {
	
		System.out.println("It is Connected");
	}

	@Override
	public void disconnect() {
		
		System.out.println("It is DisConnected");
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("It is executedUpdate successfully");
	}
	public static void main(String[] args) {
		
		JavaConnection1 jv1 = new JavaConnection1();
		jv1.connect();
		jv1.disconnect();
		jv1.executeUpdate();
	}
}
