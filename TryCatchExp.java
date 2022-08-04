package Phase2assisted;

	public class TryCatchExp {
		public static void main(String[] args) {
			try {
				System.out.println(5/0);
			}
			catch (ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("Arithmetic Exception is handled here.Division by 0 is not possible");

			}
			finally {
				System.out.println("end of program");
			}
		}


}
