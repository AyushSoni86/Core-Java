public class WithoutUsingThis
{
	int rollNumber ;
	String name ;

	static
	{
		System.out.println(" I am a certified G");
	}

	WithoutUsingThis()
	{
		System.out.println( " My name is enzo amore " ) ;
	}	
	
	WithoutUsingThis( int roll )
	{
		rollNumber = roll ;
	}	

	WithoutUsingThis( int roll, String n )
	{
		rollNumber = roll ;
		name = n ;
	}	


	public static void main(String[] args)
	{
		WithoutUsingThis a1 = new WithoutUsingThis( );
		WithoutUsingThis a2 = new WithoutUsingThis( 100 );
		WithoutUsingThis a3 = new WithoutUsingThis( 10 ," Ayush " );
		
		System.out.println( a2.rollNumber ) ;
		System.out.println( a3.rollNumber +" "+ a3.name ) ;
		
	}
}