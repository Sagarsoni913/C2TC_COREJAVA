package com.tns.Thread;


public class JoinDemo extends Thread {

public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("Thread AAAA");
	}
}


public class Demo{
	

	public static void main(String[] args) throws InterruptedException{
		JoinDemo t = new JoinDemo();
		t.start();
		t.join();  //if this thread/main thread wants to wait */
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread BBBB");
		}
		
	}

}
}