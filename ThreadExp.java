package Phase2assisted;

	import Phase2assisted.MyThread;
	import Phase2assisted.MyNewThread;
	class MyNewThread implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getId()+" My New Thread\n");
			
		}
	}
	class MyThread extends Thread{
		public void run(){
			System.out.println(this.getId()+" My Thread\n");
		}
	}
	public class ThreadExp {

		public static void main(String[] args) {
			
			  System.out.println("Thread_class Method start");
			  MyThread th=new MyThread();
				th.setPriority(3);
				th.start();
			
			//runnable thread
			  Thread t=new Thread(new MyNewThread());
			  t.start();
			  System.out.println("Runnable Method Stop");
				
		}
	}


