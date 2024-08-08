package week3day2Ass;

public class JavaConnection extends MySqlConnection {

	

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
		JavaConnection jv = new JavaConnection();
		jv.connect();
		jv.disconnect();
		jv.executeUpdate();
		jv.executeQuery();
	}
}
