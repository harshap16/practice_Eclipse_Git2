package dummy2;

import java.util.HashSet;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {
		//23rd Mar 2021,Tue

		
		//swap1();
		//swap2();
		duplicate1();
		
	}
public static void swap1()
{
	int x=100;
	int y=200;
	x=x+y;//100+200=300
	y=x-y;//300-200=100
	x=x-y;//300-100=200
	System.out.println("After Swapping : "+ " x="+x+ ",y= "+y);

}
public static void swap2()
{
	String a="Selenium";
	String b="Webdriver";
	a=a+b;
	b=a.substring(0, (a.length()-b.length()));
	a=a.substring(b.length());
	System.out.println("a ="+a);
	System.out.println("b ="+b);
	
	
	
}
public static void duplicate1()
{
	String s="India is my country I love my country";
	//splitting words using regex
	String[] str=s.split("\\W");
	//creating object of HashSet class
	Set<String> set=new HashSet<String>();
	for (int i=0;i<str.length-1;i++)
	{
		for(int j=1;j<str.length;j++)
		{
			if(str[i].equals(str[j]) && i!=j)
				set.add(str[i]);	
		}
		
		
	}
	System.out.println(set);
}

}
