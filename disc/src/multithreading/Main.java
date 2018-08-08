package multithreading;

public class Main {
public static void main(String args[])
{
	for(int i=0;i<10;i++)
	{
		Fibonacci ob=new Fibonacci(i);
		ob.setName("Fibonacci");
		ob.setPriority(Thread.MAX_PRIORITY);  
		  
		ob.start();
		try {
			ob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ob.getName()+ ": "+ ob.fibo);
	}
		
		Factorial ob1=new Factorial(5);
		ob1.setName("Factorial");
		ob1.setPriority(Thread.MIN_PRIORITY);  
		ob1.start();
		try {
			ob1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ob1.getName()+ ": "+ ob1.fact);
		
		
	
}
}

class Factorial extends Thread
{
	int y;
	int fact=1;
	public Factorial(int y)
	{
		this.y=y;
	}
	@Override
	public void run()
	{
		
		//while(y>0)
		//{
			//fact*=y;
			//y--;
		//}
		for(int i=1;i<=y;i++)
		{
			fact*=i;
		}
}
}
class Fibonacci extends Thread
{
	int x,fibo;
	public Fibonacci(int x)
	{
		this.x=x;
	}
	public void run()
	{
		if(x==0)
			fibo=0;
		else if(x<2)
			fibo=1;
		else
		{
			Fibonacci ob=new Fibonacci(x-1);
			Fibonacci ob1=new Fibonacci(x-2);
			ob.start();
			ob1.start();
			try {
				ob.join();
			ob1.join();
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fibo=ob.fibo+ob1.fibo;
			
			
		}
	}
	
}
