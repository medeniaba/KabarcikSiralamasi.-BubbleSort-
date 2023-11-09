
public class KabarcikSiralamasiAlgoritmasi {
	


	
	
	
	static void bubble(int a[] ) { 
		
		int temp ; 
		int n = a.length ; 
		for (int i = 0  ; i < n ; i++ ) {
			for ( int j = 0 ; j < n ; j++  ) {
				
				if ( a[j] > a[i] ) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp ; 
				}
			
			}
		}}
			 
	
	
	
public static void main ( String[]args) {
		
		int a [] = new int [] {100, 250 , 400 , 125 , 550 , 900 , 689 ,450,347 , 700  } ; 
		
		System.out.println(" Once ");
		
		for (int i = 0 ; i< a.length ; i++) {
			
			System.out.println( a[i] + " " );
		}
		
		bubble(a);
		
		
		System.out.println("");
		
		System.out.println(" Sonra ");
		
	
		for(int i=0; i < a.length; i++){
			System.out.print(a[i] + " ");
			}
	
			
			
}}
	
	
	
 

	


