package aa;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		aa: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				if(j==2)
					continue aa;	
				System.out.print(j);
			}
			System.out.println();
		}
		
	       Scanner scan = new Scanner(System.in);
	        int z = scan.nextInt();
	        int y = scan.nextInt();
	        
	        if(z != 0 && y != 0){
	            System.out.println(z+y);
	        }
	}
}
