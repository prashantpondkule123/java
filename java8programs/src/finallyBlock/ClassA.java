package finallyBlock;

public class ClassA {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("This is try block");
			int a = 10/0;
			System.exit(0);
			System.out.println("This is try block after exit method");
		}catch(Exception e) {
			System.out.println("This is catch block");
			System.exit(0);
			System.out.println("This is catch block after exit method");
		}finally {
			System.out.println("This is finally block");
		}
	}

}
