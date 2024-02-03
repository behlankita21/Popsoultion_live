package javaPractice;

public class MethodOverridingPractice {
	
	public void testing()
	{
		 System.out.println("software");
	}
}
  class base extends MethodOverridingPractice
{
	
	    public void testing()
	    {
	    	System.out.println("software+testing");
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingPractice a=new MethodOverridingPractice();
		a.testing();
		//base b=new base();
		//b.testing();
			}

	}


