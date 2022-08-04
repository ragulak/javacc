package Phase2assisted;



	public class throwsExp {
		static void getInfo() throws ArithmeticException, ArrayIndexOutOfBoundsException {
			int a[]= {23};
			System.out.println(a[2]);
		}
		public static void main(String[] args) {
			try {
				getInfo();
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Array index bound is exceeded here,it is not possible");

			}
			System.out.println("Hello ALL!!!");
		}
	}
