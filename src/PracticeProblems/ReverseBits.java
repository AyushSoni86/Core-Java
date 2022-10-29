class ReverseBits{

	public static void main (String[] args){

		int num = 3 ;
		System.out.println( reverseBits( num ) );		

	}

	static long reverseBits( int num ){
		long rev = 0 ;
		for( int i = 0 ; i < 32 ; i++){	
			rev = rev << 1 ;
			int mask = 1 << i ;
			if( (num & mask) != 0)
				rev = rev | 1 ;
		}	
		

		return rev ;
		

	}
}