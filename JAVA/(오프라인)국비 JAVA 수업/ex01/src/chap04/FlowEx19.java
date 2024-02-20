package chap04;

class FlowEx19 {
	public static void main(String[] args) { 
		/*
		 * i=1일때 j=1일 때 k = 2~3
		 * i=1일때 j=2일 때 k = 2~3
		 * i=1일때 j=3일 때 k = 2~3
		 * 
		 * i=2일때 j=1일 때 k = 2~3
		 * i=2일때 j=2일 때 k = 2~3
		 * i=2일때 j=3일 때 k = 2~3
		 * 
		 * i=3일때 j=1일 때 k = 2~3
		 * i=3일때 j=2일 때 k = 2~3
		 * i=3일때 j=2일 때 k = 2~3
		 * 
		 */
		for(int i=1;i<=3;i++)  
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++) 
					System.out.println(""+i+j+k);	
	}
}
