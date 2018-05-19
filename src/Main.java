public class Main {
	public static void main(String[] args) {
		Account checking = new Checking("Anderson Cossul", 123456151, 1500);
		checking.showInfo();
		System.out.println();

		System.out.println("||||||||||||||||||||||||||||||\n");
		
		Account saving = new Saving("Anderson Cossul", 1203192319, 2000);
		saving.showInfo();
		System.out.println();
	}
}