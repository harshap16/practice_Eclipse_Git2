package dummy2;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		swap1();
		
		
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
}
