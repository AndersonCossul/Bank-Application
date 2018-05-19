public class Main {
	public static void main(String[] args) {
		Account checking = new Checking("Anderson Cossul", 123456151, 1500);
		checking = new Checking("Anderson Cossul", 123455783, 1500);
		Account saving = new Saving("Anderson Cossul", 1203192319, 2000);
	}
}