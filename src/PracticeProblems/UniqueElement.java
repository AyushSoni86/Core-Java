class UniqueElement
{
	public static void main(String[] args)
	{

		int[] arr = { 12, 34, 45, 11, 12, 34, 54, 45 };
		findUnique( arr );


	}


	static void findUnique(int[] arr )
	{
		int sum = 0 ;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum = sum ^ arr[i] ;	
			


		}
		
		int rightMostBit = sum & ( -sum ) ;
		int sum1 = 0 , sum2 = 0 ;


		for( int i = 0 ; i < arr.length ; i++)
		{
			if( ( arr[i] & rightMostBit ) > 0 )
			{
				sum1 = sum1 ^ arr[i] ;
				
			}
			else
			{
				sum2 = sum2 ^ arr[i] ;
			}
			

		}
		
		System.out.println( sum1 + "  " + sum2 );

	}

}