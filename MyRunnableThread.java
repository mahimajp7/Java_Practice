package practice;

/*
-> A Thread can be created by extending Thread class also. But Java allows only one class to extend, it wont allow multiple inheritance. 
So it is always better to create a thread by implementing Runnable interface. Java allows you to implement multiple interfaces at a time.
-> By implementing Runnable interface, you need to provide implementation for run() method.
-> To run this implementation class, create a Thread object, pass Runnable implementation class object to its constructor. 
Call start() method on thread class to start executing run() method.
Implementing Runnable interface does not create a Thread object, it only defines an entry point for threads in your object. 
It allows you to pass the object to the Thread(Runnable implementation) constructor.

 */

public class MyRunnableThread implements Runnable {
	public static int count =0;
	//Defining the constructor
	
	public MyRunnableThread(){
	
	}
	
	public void run(){
		
		while(MyRunnableThread.count <= 10){
			try{
			System.out.println("Example Thread - " + (++MyRunnableThread.count));
			Thread.sleep(100);
		}
			catch(InterruptedException iex){
				System.out.println("Exception in Thread "+iex.getMessage());
			}
				
			}
	}

	public static void main(String[] args) {
		System.out.println("Starting main thread..");
		
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		
		while(MyRunnableThread.count<=10){
			try{
			System.out.println("Main Thread - " + (++MyRunnableThread.count));
			Thread.sleep(100);
		}
			catch(InterruptedException iex){
				System.out.println("Exception in Thread "+iex.getMessage());
			}
				
			}
		
		System.out.println("End of main..");
		

	}

}

