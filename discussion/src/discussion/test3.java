package discussion;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<String> ob=new ArrayList<String>();
		ArrayList<String> ob1=new ArrayList<String>();
		String x="";
		String y="";
				
		/*if(s.length()%2==0)
		{
		for(int i=0;i<s.length();)
		{
			if(i%2==0)
			{r
				String a="";
				a+=s.charAt(i);
				 //ob.add(a);
				x+=a;
				 i++;
			}
			else
			{
				
				String b="";
				b+=s.charAt(i)+s.charAt(i+1);
				y+=b;
				//ob1.add(b);
				i+=2;		
			}
		}
		}
		else {
			for(int i=0;i<s.length()-1;i++)
			{
				if(i%2==0)
				{
					String a="";
					a+=s.charAt(i);
					x+=a;
					// ob.add(a);
					 i++;
				}
				else
				{
					
					String b="";
					b+=s.charAt(i)+s.charAt(i+1);
					y+=b;
					//ob1.add(b);
					i+=2;		
				}
			}
			String z="";
			z+=s.charAt(s.length()-1);
			y+=z;
			
		}
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<ob.size();i++)
		{
			for(int j=0;j<ob.size()-1;j++)
			{
				if(ob.get(j).compareTo(ob.get(j+1))>0)
				{
					String temp=ob.get(j);
					ob.set(j,ob.get(j+1));
					ob.set(j+1, temp);
				}
			}
		}
		for(int i=0;i<ob1.size()-1;i++)
		{
			for(int j=0;j<ob1.size()-i-1;j++)
			{
				if(ob1.get(j).compareTo(ob1.get(j+1))>0)
				{
					String temp=ob1.get(j);
					ob1.set(j,ob1.get(j+1));
					ob1.set(j+1, temp);
				}
			}
		}
		int n;
		if(ob.size()>ob1.size())
		{
			n=ob.size();
		}
		else
			n=ob1.size();
		String ab;
		for(int i=0;i<n;i++)
		{
			ab
		}
		*/
		
		for(int i=0;i<s.length()-2;)
		{
			String a="";
			String b="";
			a+=s.charAt(i);
			x+=a;
			ob.add(a);
			b+=s.charAt(i+1);
			b+=s.charAt(i+2);
			y+=b;
			ob1.add(b);
			i+=3;
		}
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<ob.size();i++)
		{
			for(int j=0;j<ob.size()-1;j++)
			{
				if(ob.get(j).compareTo(ob.get(j+1))>0)
				{
					String temp=ob.get(j);
					ob.set(j,ob.get(j+1));
					ob.set(j+1, temp);
				}
			}
		}
		for(int i=0;i<ob1.size()-1;i++)
		{
			for(int j=0;j<ob1.size()-i-1;j++)
			{
				if(ob1.get(j).compareTo(ob1.get(j+1))>0)
				{
					String temp=ob1.get(j);
					ob1.set(j,ob1.get(j+1));
					ob1.set(j+1, temp);
				}
			}
		}
		int n;
		String z="";
		if(ob.size()>ob1.size())
			n=ob.size();
		else
			n=ob1.size();
		for(int i=0;i<n;i++)
		{
			z+=ob.get(i);
			z+=ob1.get(i);
		}
		if(n==ob.size())
			z+=ob.get(n-1);
		else
			z+=ob1.get(n-1);
System.out.println(z);		
		//System.out.println(a);
		//System.out.println(b);
		
	}
}
