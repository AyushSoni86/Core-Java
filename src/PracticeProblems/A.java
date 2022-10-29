public class A
{
	int rollNumber ;
	String name ;

	static
	{
		System.out.println(" I am a certified G");
	}

	A()
	{
		System.out.println( " My name is enzo amore " ) ;
	}	
	
	A( int rollNumber )
	{
		this.rollNumber = rollNumber ;
	}	

	A( int rollNumber, String name )
	{
		this.rollNumber = rollNumber ;
		this.name = name ;
	}	


	public static void main(String[] args)
	{
		A a1 = new A( );
		A a2 = new A( 100 );
		A a3 = new A( 10 ," Ayush " );
		
		System.out.println( a2.rollNumber ) ;
		System.out.println( a3.rollNumber +" "+ a3.name ) ;
		
	}
}